import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import lejos.nxt.Sound;
import lejos.nxt.UltrasonicSensor;


public class HardwareIO{
 
    public static void main( String[] args){
    
        LCD.drawString("Ping...",0,0);
        Button.waitForAnyPress();
        LCD.clear();
        UltrasonicSensor U =  Sensors.U;
        int[] distances = new int[8];
        int col = 0;
        boolean more = true;
        while(more){
        
            U.ping();
            Sound.pause(30);
            U.getDistances(distances);
            for(int i = 0; i<distances.length;i++)
            {
                LCD.drawInt(distances[i], 4, 4*col,i);                              
            }
            col ++; 
            if(col >4 )
            {
                more = Button.waitForAnyPress() != Button.ID_ESCAPE;
                col =  0;
            }
        }
    }
} 