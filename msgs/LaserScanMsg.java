package ROS_Interface.msgs;

import java.nio.ByteBuffer;

public class LaserScanMsg extends MessageType {
    public LaserScanMsg(byte[] data) {
        super(NetworkTableType.Raw, false);
        ByteBuffer bb = ByteBuffer.wrap(data);
        this.angle_min = bb.getFloat();
        this.angle_max = bb.getFloat();
        this.angle_increment = bb.getFloat();
        this.time_increment = bb.getFloat();
        this.scan_time = bb.getFloat();
        this.range_min = bb.getFloat();
        this.range_max = bb.getFloat();
        this.ranges_size = bb.getInt();
        this.ranges = new float[this.ranges_size];
        for (int i = 0; i < this.ranges_size; ++i){
            this.ranges[i] = bb.getFloat();
        }
        this.intensities_size = bb.getInt();
        this.intensities = new float[this.intensities_size];
        for (int i = 0; i < this.intensities_size; ++i){
           this.intensities[i] = bb.getFloat();
        }
    }

    public float angle_min;
    public float angle_max;
    public float angle_increment;
    public float time_increment;
    public float scan_time;
    public float range_min;
    public float range_max;
    public int ranges_size;
    public float[] ranges;
    public int intensities_size;
    public float[] intensities;
}
