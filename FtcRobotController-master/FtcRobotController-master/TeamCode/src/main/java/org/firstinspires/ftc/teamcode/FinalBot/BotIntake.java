package org.firstinspires.ftc.teamcode.FinalBot;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

import java.util.List;

public class BotIntake {

    public DcMotor[] motors = new DcMotor[2];
    public CRServo finger;
    public boolean fingerOpen = false;

    public BotIntake(DcMotor intakeLeft, DcMotor intakeRight, CRServo finger){
        motors[0] = intakeLeft;
        motors[1] = intakeRight;
        this.finger = finger;

        motors[0].setPower(0);
        motors[1].setPower(0);
    }

    public startIntake(){
        motors[0].setPower(1);
        motors[1].setPower(-1);
    }

    public stopIntake(){
        motors[0].setPower(0);
        motors[1].setPower(0);
    }

    public void closeFinger(){

    }

    public void openFinger(){

    }
    
}
