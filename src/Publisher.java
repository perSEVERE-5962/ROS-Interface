package ROS_Interface.src;

import edu.wpi.first.networktables.NetworkTableEntry;

import ROS_Interface.msgs.MessageType;


public class Publisher {
    private NetworkTableEntry topic;

    Publisher(NetworkTableEntry topic){
        this.topic = topic;
    }

    void publish(MessageType msg){
        topic.setString("TEST");
    }
}
