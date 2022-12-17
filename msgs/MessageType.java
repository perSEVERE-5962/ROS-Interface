package ROS_Interface.msgs;

public class MessageType {

    public static enum NetworkTableType {
        Boolean,
        Double,
        Numeric,
        String,
        Raw,
        Object
    } 

    private NetworkTableType type;
    private Boolean isArray;

    public MessageType(NetworkTableType type, Boolean isArray){
        this.type = type;
        this.isArray = isArray;
    }
}
