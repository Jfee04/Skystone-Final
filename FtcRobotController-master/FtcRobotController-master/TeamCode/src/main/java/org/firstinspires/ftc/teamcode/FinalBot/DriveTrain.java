package org.firstinspires.ftc.teamcode.FinalBot;

import com.qualcomm.robotcore.hardware.DcMotor;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

public class DriveTrain {
    private final DcMotor[] wheels = new DcMotor[4];

    public DriveTrain(){
        wheels[0] = hardwareMap.get(DcMotor.class, "frontLeft");
        wheels[1] = hardwareMap.get(DcMotor.class, "frontRight");
        wheels[2] = hardwareMap.get(DcMotor.class, "backLeft");
        wheels[3] = hardwareMap.get(DcMotor.class, "backRight");
    }

    public void setMode(DcMotor.RunMode mode){
        for(DcMotor m:wheels){
            m.setMode(mode);
        }//sets runmode of all motors
    }//sets mode of all the motors to mode

    public void setPower(int power){
        for (int i = 0; i < 4; i++) {
            if (i==1 || i==3){
                wheels[i].setPower(-power);
            }
            else{
                wheels[i].setPower(power);
            }
        }
    }

    

}
