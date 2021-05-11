package org.firstinspires.ftc.teamcode.FinalBot;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

import java.util.List;

@TeleOp(name="VeljkoTeleOp")
public class TeleOpIntake extends OpMode {

    BotIntake intake; //new BotIntake(hardwareMap.get(DcMotor.class, "intakeLeft"), hardwareMap.get(DcMotor.class, "intakeRight"), hardwareMap.get(CRServo.class, "finger"));
    
    @Override
    public void init() {
        intake = new BotIntake(hardwareMap.get(DcMotor.class, "intakeLeft"), hardwareMap.get(DcMotor.class, "intakeRight"));
    }

    @Override
    public void loop() {

        if(gamepad1.dpad_up){
            intake.startIntake();
        }
        else if(gamepad1.dpad_down){
            intake.stopIntake();
        }
    }

}
