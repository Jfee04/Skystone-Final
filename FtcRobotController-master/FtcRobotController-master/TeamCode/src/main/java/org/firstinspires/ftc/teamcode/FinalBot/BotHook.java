package org.firstinspires.ftc.teamcode.FinalBot;

import com.qualcomm.robotcore.hardware.Servo;

public class BotHook {

    Servo[] hook = new Servo[2];

    public BotHook(Servo hook, Servo hook2){

        this.hook[0] = hook;
        //this.hook[1] = hook2;

        raiseHook();
    }

    public void dropHook(){

        hook[0].setPosition(0);
        //hook[1].setPosition(0);
    }

    public void raiseHook(){

        hook[0].setPosition(1);
        //hook[1].setPosition(1);
    }

    public boolean hookDown(){

        return hook[0].getPosition() == 0;
    }
}
