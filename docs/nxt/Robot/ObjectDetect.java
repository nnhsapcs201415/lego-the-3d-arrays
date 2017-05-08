import lejos.nxt.*;
import lejos.robotics.objectdetection.*;

public class ObjectDetect{

    public static int MAX_DETECT = 80;

    public static void main(String[] args) throws Exception {

        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
        FeatureDetector fd = new RangeFeatureDetector(us, MAX_DETECT, 500);
        Feature result = fd.scan();
        if(result != null)
            {System.out.println("Range: " + result.getRangeReading().getRange());}
    }

   
}