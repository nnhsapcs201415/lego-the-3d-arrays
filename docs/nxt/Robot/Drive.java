import lejos.nxt.*;
import lejos.robotics.objectdetection.*;
import lejos.robotics.navigation.*;
public class Drive{
    private static int highestLight;
    public static void main(String[] agrs){
        NXTRegulatedMotor LEFT = Mtor.LEFT;
        NXTRegulatedMotor RIGHT = Mtor.RIGHT;
        DifferentialPilot pilot = new DifferentialPilot(56.0, 100.0, LEFT, RIGHT, true);
        LightSensor LI = Sensors.LI;
        int rep = 0;
        while(rep < 3){
            pilot.forward();
        }
        pilot.stop();
    }
}