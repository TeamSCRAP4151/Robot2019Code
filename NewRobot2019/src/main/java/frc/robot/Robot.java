package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {

  CameraSystem camera = new CameraSystem();
  OI oi = new OI();

  @Override
  public void robotInit() { 
    
    Compressor c;
    PowerDistributionPanel power;

    power = new PowerDistributionPanel();
    power.clearStickyFaults();

    c = new Compressor(0); //default for PCM
    c.setClosedLoopControl(true);
    
    camera.useFrontCamera();
  }

  //Add Auto Init & Periodic For Sandstorm Period As Otherwise Commands Will Not Triggers

  @Override
  public void teleopInit() {
    
  }

  @Override
  public void teleopPeriodic() {
    
    oi.readInput();
  }

  @Override
  public void disabledInit() {

  }
}