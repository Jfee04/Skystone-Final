package org.firstinspires.ftc.teamcode.FinalBot;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

import java.util.List;

public class BotIntake {

    public DcMotor[] motors = new DcMotor[2];
    public CRServo finger;
    public boolean fingerOpen = false;
    private ElapsedTime time = new ElapsedTime(0);//timer

    public BotIntake(DcMotor intakeLeft, DcMotor intakeRight, CRServo finger){

        motors[0] = intakeLeft;
        motors[1] = intakeRight;
        this.finger = finger;

        motors[0].setPower(0);//left motor
        motors[1].setPower(0);//right motor
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

        finger.setPower(1);//move towards intake

        time.reset();//reset time

        while(time.seconds() < 1);//waits 1 second for finger to close
        finger.setPower(0);

        fingerOpen = false;
    }

    public void openFinger(){

        finger.setPower(-1);//move away from intake

        time.reset();//reset time

        while(time.seconds() < 1);//waits 1 second for finger to open
        finger.setPower(0);

        fingerOpen = true;
    }

}
