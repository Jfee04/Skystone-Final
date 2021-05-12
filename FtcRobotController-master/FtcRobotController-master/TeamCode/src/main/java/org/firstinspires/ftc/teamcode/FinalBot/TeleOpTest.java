package org.firstinspires.ftc.teamcode.FinalBot;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.FinalBot.DriveTrain;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

import java.util.List;

@TeleOp(name="exampleTele")
public class TeleOpTest extends OpMode {

    private DcMotor FrontLeft, FrontRight, BackLeft, BackRight;
    //public DistanceSensor distanceSensorForward;
    //public ColorSensor colorSensor;


    @Override
    public void init() {

        FrontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        FrontRight = hardwareMap.get(DcMotor.class, "frontRight");
        BackLeft = hardwareMap.get(DcMotor.class, "backLeft");
        BackRight = hardwareMap.get(DcMotor.class, "backRight");


        //distanceSensorForward = hardwareMap.get(DistanceSensor.class, "front_distance");
        //colorSensor = hardwareMap.get(ColorSensor.class, "color_sensor");
    }

    @Override
    public void loop() {
            //if(gamepad1.right_stick_x  < -.3 || gamepad1.right_stick_x > .3){

        //if (gamepad1.left_stick_x > 0.3 || gamepad1.left_stick_x < -0.3 || gamepad1.left_stick_y > 0.3 || gamepad1.left_stick_y < -0.3) {}
        telemetry.addData("Ticks", FrontLeft.getCurrentPosition());
        telemetry.update();
        if(gamepad1.a) {
            FrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            try {
                wait(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            FrontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        }

            if (gamepad1.left_stick_x > 0.3 || gamepad1.left_stick_x < -0.3 || gamepad1.left_stick_y > 0.3 || gamepad1.left_stick_y < -0.3) {
                FrontLeft.setPower(gamepad1.left_stick_y + gamepad1.left_stick_x);
                FrontRight.setPower(-(gamepad1.left_stick_y - gamepad1.left_stick_x));
                BackLeft.setPower(gamepad1.left_stick_y - gamepad1.left_stick_x);
                BackRight.setPower(-(gamepad1.left_stick_y + gamepad1.left_stick_x));
            }// normal movement forward Backward and diagonal
            else if (gamepad1.left_trigger > .1) {
                FrontLeft.setPower(-gamepad1.left_trigger);
                FrontRight.setPower(-(gamepad1.left_trigger));
                BackLeft.setPower(-gamepad1.left_trigger);
                BackRight.setPower(-(gamepad1.left_trigger));
            } else if (gamepad1.right_trigger > .1) {
                FrontLeft.setPower(gamepad1.right_trigger);
                FrontRight.setPower(-(-gamepad1.right_trigger));
                BackLeft.setPower(gamepad1.right_trigger);
                BackRight.setPower(-(-gamepad1.right_trigger));
            }
            else{
                FrontLeft.setPower(0);
                FrontRight.setPower(0);
                BackLeft.setPower(0);
                BackRight.setPower(0);
            }


        }



        //if(gamepad1.right_stick_x > .5 || gamepad1.right_stick_y > .5 )


        //test

        /*if(gamepad1.left_stick_x > 0.2){

            FrontRight.setPower(-gamepad1.left_stick_x);
            BackLeft.setPower(-gamepad1.left_stick_x);
            BackRight.setPower(gamepad1.left_stick_x);
            FrontLeft.setPower(gamepad1.left_stick_x);

        }else if(gamepad1.left_stick_x < -0.2){

            FrontRight.setPower(-gamepad1.left_stick_x);
            BackLeft.setPower(-gamepad1.left_stick_x);
            BackRight.setPower(gamepad1.left_stick_x);
            FrontLeft.setPower(gamepad1.left_stick_x);

        }else {

            FrontLeft.setPower(-1 * gamepad1.left_stick_y);
            FrontRight.setPower(-1 * gamepad1.left_stick_y);
            BackLeft.setPower(-1 * gamepad1.left_stick_y);
            BackRight.setPower(-1 * gamepad1.left_stick_y);

        }

        telemetry.addData("gamepadStatusY:", gamepad1.left_stick_y);
        telemetry.addData("gamepadStatusX:", gamepad1.left_stick_x);
        //telemetry.update();

        //telemetry.addData("Distance Forward: ", distanceSensorForward.getDistance(DistanceUnit.INCH));
        telemetry.update();

        //telemetry.addData("Color: ", colorSensor.getClass());
        */
    }


