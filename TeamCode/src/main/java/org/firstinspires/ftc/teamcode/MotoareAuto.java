package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class MotoareAuto {

    private static double viteza = 0.5;

    static void Fata(DcMotor stangaFata, DcMotor dreaptaFata, DcMotor stangaSpate, DcMotor dreaptaSpate) {
        stangaFata.setDirection(DcMotor.Direction.REVERSE);
        stangaSpate.setDirection(DcMotor.Direction.REVERSE);
        dreaptaFata.setDirection(DcMotor.Direction.FORWARD);
        dreaptaSpate.setDirection(DcMotor.Direction.FORWARD);
        dreaptaFata.setPower(viteza);
        stangaFata.setPower(viteza);
        dreaptaSpate.setPower(viteza);
        stangaSpate.setPower(viteza);
    }

    static void Spate(DcMotor stangaFata, DcMotor dreaptaFata, DcMotor stangaSpate, DcMotor dreaptaSpate) {
        stangaFata.setDirection(DcMotor.Direction.FORWARD);
        stangaSpate.setDirection(DcMotor.Direction.FORWARD);
        dreaptaFata.setDirection(DcMotor.Direction.REVERSE);
        dreaptaSpate.setDirection(DcMotor.Direction.REVERSE);
        dreaptaFata.setPower(viteza);
        stangaFata.setPower(viteza);
        dreaptaSpate.setPower(viteza);
        stangaSpate.setPower(viteza);
    }

    static void Stanga(DcMotor stangaFata, DcMotor dreaptaFata, DcMotor stangaSpate, DcMotor dreaptaSpate) {
        stangaFata.setDirection(DcMotor.Direction.FORWARD);
        stangaSpate.setDirection(DcMotor.Direction.REVERSE);
        dreaptaFata.setDirection(DcMotor.Direction.FORWARD);
        dreaptaSpate.setDirection(DcMotor.Direction.REVERSE);
        dreaptaFata.setPower(viteza);
        stangaFata.setPower(viteza);
        dreaptaSpate.setPower(viteza);
        stangaSpate.setPower(viteza);
    }

    static void Dreapta(DcMotor stangaFata, DcMotor dreaptaFata, DcMotor stangaSpate, DcMotor dreaptaSpate) {
        stangaFata.setDirection(DcMotor.Direction.REVERSE);
        stangaSpate.setDirection(DcMotor.Direction.FORWARD);
        dreaptaFata.setDirection(DcMotor.Direction.REVERSE);
        dreaptaSpate.setDirection(DcMotor.Direction.FORWARD);
        dreaptaFata.setPower(viteza);
        stangaFata.setPower(viteza);
        dreaptaSpate.setPower(viteza);
        stangaSpate.setPower(viteza);
    }

    static void StangaSus(DcMotor stangaFata, DcMotor dreaptaFata, DcMotor stangaSpate, DcMotor dreaptaSpate) {
        stangaFata.setDirection(DcMotor.Direction.REVERSE);
        stangaSpate.setDirection(DcMotor.Direction.FORWARD);
        dreaptaFata.setDirection(DcMotor.Direction.REVERSE);
        dreaptaSpate.setDirection(DcMotor.Direction.FORWARD);
        dreaptaFata.setPower(0);
        stangaFata.setPower(viteza);
        dreaptaSpate.setPower(viteza);
        stangaSpate.setPower(0);
    }

    static void DreaptaJos(DcMotor stangaFata, DcMotor dreaptaFata, DcMotor stangaSpate, DcMotor dreaptaSpate) {
        stangaFata.setDirection(DcMotor.Direction.FORWARD);
        stangaSpate.setDirection(DcMotor.Direction.FORWARD);
        dreaptaFata.setDirection(DcMotor.Direction.REVERSE);
        dreaptaSpate.setDirection(DcMotor.Direction.REVERSE);
        dreaptaFata.setPower(0);
        stangaFata.setPower(viteza);
        dreaptaSpate.setPower(viteza);
        stangaSpate.setPower(0);
    }

    static void DreaptaSus(DcMotor stangaFata, DcMotor dreaptaFata, DcMotor stangaSpate, DcMotor dreaptaSpate) {
        stangaFata.setDirection(DcMotor.Direction.FORWARD);
        stangaSpate.setDirection(DcMotor.Direction.REVERSE);
        dreaptaFata.setDirection(DcMotor.Direction.FORWARD);
        dreaptaSpate.setDirection(DcMotor.Direction.REVERSE);
        dreaptaFata.setPower(viteza);
        stangaFata.setPower(0);
        dreaptaSpate.setPower(0);
        stangaSpate.setPower(viteza);
    }

    static void StangaJos(DcMotor stangaFata, DcMotor dreaptaFata, DcMotor stangaSpate, DcMotor dreaptaSpate) {
        stangaFata.setDirection(DcMotor.Direction.FORWARD);
        stangaSpate.setDirection(DcMotor.Direction.FORWARD);
        dreaptaFata.setDirection(DcMotor.Direction.REVERSE);
        dreaptaSpate.setDirection(DcMotor.Direction.REVERSE);
        dreaptaFata.setPower(viteza);
        stangaFata.setPower(0);
        dreaptaSpate.setPower(0);
        stangaSpate.setPower(viteza);
    }

    static void Stop(DcMotor stangaFata, DcMotor dreaptaFata, DcMotor stangaSpate, DcMotor dreaptaSpate) {
        dreaptaFata.setPower(0);
        stangaFata.setPower(0);
        dreaptaSpate.setPower(0);
        stangaSpate.setPower(0);
    }

}