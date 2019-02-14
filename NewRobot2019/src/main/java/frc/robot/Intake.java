package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;

public class Intake {

    public boolean isOpen = false;
    public boolean goForward = false;

    //Create Roller Controllers
    Spark leftRoll = new Spark(RobotMap.Roller_Left);
    Spark rightRoll = new Spark(RobotMap.Roller_Right);
    //Create Mechanism Controllers
    DoubleSolenoid fullExt = new DoubleSolenoid(0, 1);

    public void rollForward(double speed) {

        leftRoll.set(-speed);
        rightRoll.set(speed);
        
    } 

    public void rollBackward(double speed) {

        leftRoll.set(speed);
        rightRoll.set(-speed);

    }

    public void open() {

        fullExt.set(DoubleSolenoid.Value.kReverse);      
    }

    public void close()
    {
        fullExt.set(DoubleSolenoid.Value.kForward);
    }
}