package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode;
import com.qualcomm.robotcore.hardware.*;

@TeleOp(name = "test")
public class testing extends OpMode {
    DcMotor motorRight;
    DcMotor motorLeft;
    DcMotor top;

    @Override
    public void init() {
        motorRight = hardwareMap.dcMotor.get("motorRight");
        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        top = hardwareMap.dcMotor.get("top");
        telemetry.addData('Status', 'Initialized');
    }

    @Override
    public void loop() {
        motorRight.setPower(gamepad1.right_trigger);
        motorLeft.setPower(-1* gamepad1.left_trigger);
        if(gamepad1.a){
            motorRight.setPower( -1*gamepad1.right_trigger);
            motorLeft.setPower(gamepad1.left_trigger);
        }

        if(gamepad1.b){
            top.setPower(.5);
        } else{
            top.setPower(0);
        }
        if(gamepad1.x){
            top.setPower(-.5);
        } else {
            top.setPower(0);
        }
        telemetry.addData("Right bumber: ", gamepad1.right_trigger);
        telemetry.addData("lefy bumper" , gamepad1.left_trigger);
    }
}
