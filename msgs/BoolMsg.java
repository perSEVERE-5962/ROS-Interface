package ROS_Interface.msgs;

public class BoolMsg extends MessageType{
    public BoolMsg() {
        super(NetworkTableType.Boolean, false);
    }

    public Boolean data;
}
