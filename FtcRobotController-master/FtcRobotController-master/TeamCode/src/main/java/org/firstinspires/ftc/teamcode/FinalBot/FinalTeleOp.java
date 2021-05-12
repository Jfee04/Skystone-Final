package org.firstinspires.ftc.teamcode.FinalBot;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

import java.util.List;

@TeleOp(name="FinalTeleOp")
public class FinalTeleOp extends OpMode{

    FinalBot bot;

    @Override
    public void init() {

        bot = new FinalBot(hardwareMap);
        BotIntake intake = bot.intake;
        BotHook hook = bot.hook;
    }

    //intake = new BotIntake(hardwareMap.get(DcMotor.class, "intakeLeft"), hardwareMap.get(DcMotor.class, "intakeRight"), hardwareMap.get(CRServo.class, "finger"));

    @Override
    public void loop() {

        //Intake Controls
        if(gamepad1.dpad_up){
            intake.startIntake();
        }
        else if(gamepad1.dpad_down){
            intake.stopIntake();
        }//intake wheels start/stop

        if(gamepad1.left_bumper){
            intake.closeFinger();//towards intake
        }
        else if(gamepad1.right_bumper){
            intake.openFinger();//away from intake
        }

        //Hook Control
        if(gamepad1.dpad_left){
            hook.raiseHook();
        }
        else if(gamepad1.dpad_right){
            hook.dropHook();
        }
    }

}
