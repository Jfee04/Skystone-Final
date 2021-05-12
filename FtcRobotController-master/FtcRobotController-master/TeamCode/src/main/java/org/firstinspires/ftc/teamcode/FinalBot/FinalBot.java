package org.firstinspires.ftc.teamcode.FinalBot;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import java.util.List;

import org.firstinspires.ftc.teamcode.FinalBot.BotIntake;

public class FinalBot {

    public BotIntake intake;
    public BotHook hook;
    //wheels
    //arm

    public FinalBot(HardwareMap map){

        intake = new BotIntake(map.get(DcMotor.class, "intakeLeft"), map.get(DcMotor.class, "intakeRight"), map.get(CRServo.class, "finger"));
        hook = new BotHook(map.get(Servo.class, "hook"), map.get(Servo.class, "hook2"));
    }
}
