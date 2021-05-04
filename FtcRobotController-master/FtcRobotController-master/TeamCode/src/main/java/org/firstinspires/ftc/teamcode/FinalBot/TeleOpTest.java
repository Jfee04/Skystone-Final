package SkyStoneActual.RobotController.FtcRobotController.;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;

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

        FrontLeft.setPower(1);
        FrontRight.setPower(1);
        BackLeft.setPower(1);
        BackRight.setPower(1);

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
}

