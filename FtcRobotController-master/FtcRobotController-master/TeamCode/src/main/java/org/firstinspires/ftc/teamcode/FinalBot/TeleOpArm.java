package org.firstinspires.ftc.teamcode.FinalBot;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="TeleOpArm")
public class TeleOpArm extends LinearOpMode {

    BotArm arm = new BotArm(hardwareMap.get(DcMotor.class, "armBaseMotor"), hardwareMap.get(Servo.class, "wristServo"), hardwareMap.get(Servo.class, "handServo"));

    @Override
    public void runOpMode() throws InterruptedException {

    }
}
