package org.firstinspires.ftc.teamcode.FinalBot;

import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.Arrays;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

public class DriveTrain {

    public final DcMotor[] wheels = new DcMotor[4];

    private final double TPR = 1120;
    private final double DGR = 1;
    private final double Diameter_Inches = 4.0;
    private final double CPI = (TPR * DGR) / (Diameter_Inches * Math.PI);
    private final double CPR = 7200;
    private final double CPD = CPR/360;


    public DriveTrain(){
        wheels[0] = hardwareMap.get(DcMotor.class, "frontLeft");
        wheels[1] = hardwareMap.get(DcMotor.class, "frontRight");
        wheels[2] = hardwareMap.get(DcMotor.class, "backLeft");
        wheels[3] = hardwareMap.get(DcMotor.class, "backRight");
    }
    public DriveTrain(DcMotor i0, DcMotor i1, DcMotor i2, DcMotor i3){
        wheels[0] = i0;
        wheels[1] = i1;
        wheels[2] = i2;
        wheels[3] = i3;
    }

    //Getter
    ////////////////////////////////////////////////////////////////

    public DcMotor[] getWheels() {
        return wheels;
    }

    public double getTPR() {
        return TPR;
    }

    public double getDGR() {
        return DGR;
    }

    public double getDiameter_Inches() {
        return Diameter_Inches;
    }

    public double getCPI() {
        return CPI;
    }

    public double getCPR() {
        return CPR;
    }

    public double getCPD() {
        return CPD;
    }



    //Setter
    ////////////////////////////////////////////////////////////////

    public void setMode(DcMotor.RunMode mode){
        for(DcMotor m:wheels){
            m.setMode(mode);
        }//sets runmode of all motors
    }//sets mode of all the motors to mode

    public void setMode(int wheel, DcMotor.RunMode mode){
            wheels[wheel].setMode(mode);
    }//sets mode of wheel motor to mode

    public void setPower(int power){
        for (int i = 0; i < 4; i++) {
            //if (i==1 || i==3){
                wheels[i].setPower(power);
            //}
            //else{
                //wheels[i].setPower(-power);
            //}
        }
    }

    public void setPower(int i, int power){
       //if (i==1 || i==3){
            wheels[i].setPower(power);
        //}
        //else{
            //wheels[i].setPower(-power);
        //}
    }

    public void rotateClockWise(int degrees, int power){
        for (int i = 0; i < 4; i++) {
            if(i == 0 || i == 2){
                setPower(i,1);
            }else
                setPower(i,1);

        }
    }


}
