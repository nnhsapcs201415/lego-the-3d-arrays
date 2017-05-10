import lejos.nxt.*;
import lejos.robotics.objectdetection.*;
public class Motor{

    public static void main(String[] agrs){

        NXTMotor B = new NXTMotor(MotorPort.A);
        B.forward();

    }
}
