package frc.robot;

import edu.wpi.first.wpilibj.CameraServer;

//Import WPI Lib

public class CameraSystem {

    //Create Cameras
    
    public void useFrontCamera() {
            //Turn On Front, Turn Off Back

            CameraServer.getInstance().startAutomaticCapture();

            //Start New Feed
    }

    public void useBackCamera()
    {
        //Turn Off Back, Turn On Front

        //Start New Feed
    }
} 