import lejos.nxt.*;
public class Sensors{
    public static UltrasonicSensor U = new UltrasonicSensor(SensorPort.S1);
    public static LightSensor LI = new LightSensor(SensorPort.S2);
    public static TouchSensor FRONT = new TouchSensor(SensorPort.S3);
    public static TouchSensor BACK = new TouchSensor(SensorPort.S4);
}