package frc.robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain {

    //Create Sparks Needed Here Using RobotMap (You Will Need One For Each Side Unless Otherwise Specified)

    Spark driveLeft = new Spark(RobotMap.Drive_Left);
    Spark driveRight = new Spark(RobotMap.Drive_Right);

    //Create A Differential Drive That Utilizes The Sparks For Each Side

    DifferentialDrive driveT = new DifferentialDrive(driveLeft, driveRight);
    
    //All Of The Drivetrain Methods Are Below, Dictating All Of The Possible Actions Of The Drivetrain

    public void driveForward(double driveSpeed) {
        //Use The leftDriveSpeed and rightDriveSpeed variables to tell the DifferentialDrive to move the robot
        //Hint: Look at the Differential Drive class on WPI
        driveT.tankDrive(driveSpeed, driveSpeed);
    }

    public void driveBackward(double driveSpeed) {
        //Use The leftDriveSpeed and rightDriveSpeed variables to tell the DifferentialDrive to move the robot
        //Hint: Look at the Differential Drive class on WPI
        driveT.tankDrive(-driveSpeed, -driveSpeed);
    }

    public void turnLeft(double driveSpeed) {
        //Use The leftDriveSpeed and rightDriveSpeed variables to tell the DifferentialDrive to move the robot
        //Hint: Look at the Differential Drive class on WPI
        driveT.tankDrive(driveSpeed, -driveSpeed);
    }

    public void turnRight(double driveSpeed) {
        //Use The leftDriveSpeed and rightDriveSpeed variables to tell the DifferentialDrive to move the robot
        //Hint: Look at the Differential Drive class on WPI
        driveT.tankDrive(-driveSpeed, driveSpeed);
    }
}