package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class OI {

    //Create Controllers Here
        XboxController Xbox = new XboxController(RobotMap.Xbox_Port);
       
    //Create Subsystems (Drivetrain, Intake etc. Here)

    Drivetrain driveT = new Drivetrain();
    Elevator sheldon = new Elevator();
    Intake intake = new Intake();

    boolean isOpen = false;

    public void readInput() {

        //Use If Statements To Determine When Each Subsystem's Methods/Commands 
        //This Class Is A Long List Of If Statements. DO NOT USE ELSE!

        if (Xbox.getAButton()==true) { //The A Button on the Xbox controller sets the elevator to a set height level with the lowest rocket hatch panel port.

//lowheight

        } else if (Xbox.getBButton()==true) { //The B Button on the Xbox controller sets the elevator to a set height level with the middle rocket hatch panel port.

//mediumortop

        } else if (Xbox.getYButton()==true) { //The Y Button on the Xbox controller sets the elevator to a set height level with the highest rocket hatch panel port.

//highheight

        } else if (Xbox.getXButton()==true) { //The X Button on the Xbox controller has an undecided purpose. Perhaps holding down this and pressing the other letter buttonsset the height to cargo ports on the rocket.

//undecided

        }
        
        if (Xbox.getY(Hand.kLeft)>0.5) { //When the left trigger on the controller is flicked upward, the robot will move forward.
                
            driveT.driveForward(.7);

        } else if (Xbox.getY(Hand.kLeft)<-0.5) { //When the left trigger on the controller is flicked downward, the robot will move backwards.

                driveT.driveBackward(.7);

        } else if (Xbox.getX(Hand.kLeft)>0.5) { //When the left trigger on the controller is flicked to the right, the robot will turn right

                driveT.turnLeft(.5);

        } else if (Xbox.getX(Hand.kLeft)<-0.5) { //When the left trigger on the controller is flicked to the left... take a wild guess.
            
                driveT.turnRight(.5);

        }

        if (Xbox.getY(Hand.kRight)>0.1) {
                sheldon.raiseElevator(.7);
        }
        else if (Xbox.getY(Hand.kRight)<0.1) {
                sheldon.raiseElevator(0);
        }
        if (Xbox.getY(Hand.kRight)<-0.1) {
                sheldon.raiseElevator(-.7);
        }
       /* if (Xbox.getY(Hand.kRight)<-0.2) {
                sheldon.lowerElevator(-0.5);
        }
        else if (Xbox.getY(Hand.kRight)==0) {
                sheldon.lowerElevator(0);
        }*/
        
        if (Xbox.getTriggerAxis(Hand.kLeft)>0.1) { //Pressing down on the left trigger on the controller will raise the robot's arm

          if(isOpen == false) {
                  intake.open();
           } else {
                    intake.close();
            }
                
        } else if (Xbox.getTriggerAxis(Hand.kRight)>0.1) { //Pressing down on the right trigger on the controller will lower the robot's arm.

                if(intake.goForward == true) {
                     intake.rollForward(1);
                } else {
                     intake.rollBackward(1);   
                }
        }

        if (Xbox.getBumper(Hand.kLeft)==true) { //

                //CCCAAAAAMMMMMEEERRRRAAA

        } else if (Xbox.getBumper(Hand.kRight)==true) {

//plan z

        }
    }
}