package ROS_Interface.src;

import edu.wpi.first.networktables.NetworkTableInstance;

import java.util.concurrent.Callable;

import ROS_Interface.msgs.MessageType;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;


public class NodeHandle {
    private NetworkTable nh;

    //For now we don't care about namespaces - this will be barebones
    public NodeHandle(){
        NetworkTableInstance nti = NetworkTableInstance.getDefault();
        nh = nti.getTable("roscore");
        NetworkTableEntry e = nh.getEntry("Test");
        e.setValue("test");
    }

    public Publisher advertise(String topic, MessageType messageType){
        NetworkTableEntry entry = nh.getEntry(topic);
        return new Publisher(entry);
    }

    public Subscriber subscribe(String topic, Callable<Void> callback){
        NetworkTableEntry entry = nh.getEntry(topic);
        return new Subscriber(entry, callback);
    }
}
