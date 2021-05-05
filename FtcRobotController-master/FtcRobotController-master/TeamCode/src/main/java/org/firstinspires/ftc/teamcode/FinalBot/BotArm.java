package org.firstinspires.ftc.teamcode.FinalBot;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class BotArm {
    private static final double rpm = 152;

    public DcMotor armBaseMotor; //tetrix motor
    public Servo wristServo;
    public Servo handServo;



    public BotArm(DcMotor base, Servo wrist, Servo hand)
    {
        armBaseMotor = base;
        armBaseMotor.setPower(0);
        wristServo = wrist;
        handServo = hand;

    }

    public void baseRotateDegrees(double degrees, double speed) // should be 0 < speed < 1
    {
        ElapsedTime time = new ElapsedTime(0);

        //in seconds
        double rotateTime = Math.abs(degrees)/((rpm*speed)/60*360) * 5; //calculates the time that the arm needs to rotate

        time.reset();

        armBaseMotor.setPower(speed*(Math.abs(degrees)/degrees));
        while(time.seconds() < rotateTime);
        armBaseMotor.setPower(0);
    }

    public void handGrab(boolean state)
    {
        if (state)
        {
            handServo.setPosition(0);
        }
        else
        {
            handServo.setPosition(0.5);
        }
    }


    public void wristOut()
    {
        wristServo.setPosition(0);
    }

    public void wristIn()
    {
        wristServo.setPosition(1);
    }

    public void setGrabPos()
    {
        handGrab(false);
        baseRotateDegrees(50, 1);
        wristIn();
        baseRotateDegrees(-50,.1);
    }
}
