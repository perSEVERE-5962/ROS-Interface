package ROS_Interface.src;

import java.util.concurrent.Callable;
import java.util.function.Consumer;

import edu.wpi.first.networktables.EntryListenerFlags;
import edu.wpi.first.networktables.EntryNotification;
import edu.wpi.first.networktables.NetworkTableEntry;

public class Subscriber {
    private NetworkTableEntry topic;

    Subscriber(NetworkTableEntry topic, Callable<Void> callback){
        this.topic = topic;

        /*Consumer<EntryNotification> _callback = new Consumer<EntryNotification>() {
            @Override
            public void accept(EntryNotification arg0) {
              try {
                callback.call();
            } catch (Exception e) {
                e.printStackTrace();
              }        
            }
          };
        
        this.topic.addListener(_callback, EntryListenerFlags.kNew | EntryListenerFlags.kUpdate);*/
    }

    public NetworkTableEntry getTopic(){
        return this.topic;
    }
}
