package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "test2")
public class testingV2 extends OpMode
{
   DcMotor motorRight;
   DcMotor motorLeft;

    @Override
    public void init() {
        motorRight = hardwareMap.dcMotor.get("motorRight");
        motorLeft = hardwareMap.dcMotor.get("motorLeft");
    }

    @Override
    public void loop() {
        motorRight.setPower(gamepad1.right_trigger - gamepad1.left_stick_x);
        motorLeft.setPower(gamepad1.right_trigger + gamepad1.left_stick_x);
        if(gamepad1.a)
        if(!motorRight.isBusy()) motorRight.setPower(-1*(gamepad1.left_trigger) + gamepad1.left_stick_x);
        if(!motorLeft.isBusy()) motorLeft.setPower(-1*(gamepad1.left_trigger) - gamepad1.left_stick_x);

    }
}
