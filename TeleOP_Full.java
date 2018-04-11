package org.firstinspires.ftc.teamcode.TeleOP;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Libraries.LibraryBaseTeleOP;

/**
 * Created by Ari on 02-11-17.
 * Edited by Harrison
 */


@TeleOp(name = "TeleOP_Full", group = "Comp")
public class TeleOP_Full extends LibraryBaseTeleOP {

    @Override
    public void loop(){



        gyroYaw  = angles.firstAngle;

        // Add some telemetry.
        telemetry.addData("Axial: ", dAxial);
        telemetry.addData("Lateral: ", dLateral);
        telemetry.addData("Yaw: ", dYaw);
        telemetry.addData("Gyro Yaw: ", gyroYaw);


        //Turn the conveyor
        moveConveyor(-gamepad2.right_stick_y/20);

        //Drop intake
        if(gamepad2.right_bumper){
            moveDropKick(-0.1);
        }else if(gamepad2.left_bumper){
            moveDropKick(0.1);
        }else{
            moveDropKick(0);
        }
        //Turn intake
        if (gamepad2.left_trigger > 0.2 || gamepad1.left_trigger > 0.2){ // May need to change this.
            moveIntake(intakePower);
        }
        else if (gamepad2.right_trigger > 0.2 || gamepad1.right_trigger > 0.2){
            moveIntake(-intakePower);
        }else{
            moveIntake(0);
        }


        if(gamepad2.y){
            kicker.setPosition(0);
        }else if (gamepad2.b){
            kicker.setPosition(0.25);
        }else if(gamepad2.a){
            kicker.setPosition(0.45);
        }

		
		
		"hello random strings 10/10"

"add more strings"




        telemetry.update();
    }

    @Override
    public void stop(){


    }

}