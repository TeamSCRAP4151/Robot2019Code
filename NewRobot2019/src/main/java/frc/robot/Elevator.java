package frc.robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class Elevator 
{
    //Create Sparks Needed Here Using RobotMap (You Will Need One For Each Side Unless Otherwise Specified)
    Spark elevator = new Spark(RobotMap.Elevator);

    public void raiseElevator(double speed) 
    {
        elevator.set(speed);
    }

    public void lowerElevator(double speed) 
    {
        elevator.set(-speed);
    }

    //Preset Methods TBA
}