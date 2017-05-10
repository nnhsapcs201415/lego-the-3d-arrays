import lejos.nxt.*;
import lejos.robotics.objectdetection.*;
public class Drive{
    private static int highestLight;
    public static void main(String[] agrs){
        NXTMotor LEFT = Mtor.LEFT;
        NXTMotor RIGHT = Mtor.RIGHT;
        
        LightSensor LI = Sensors.LI;
        Button.ENTER.waitForPressAndRelease();
        while(true){ 
            
            
            while(LI.getLightValue() > 5){
                LEFT.forward();
            }
           
        }
        
    }
}