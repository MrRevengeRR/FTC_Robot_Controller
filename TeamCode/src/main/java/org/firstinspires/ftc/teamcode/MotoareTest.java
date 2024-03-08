package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "MotoareTest")
public class MotoareTest extends LinearOpMode {

    private MotoareAuto directie = new MotoareAuto();

    private static long timp = 1500;

    private DcMotor stangaFata;
    private DcMotor stangaSpate;
    private DcMotor dreaptaFata;
    private DcMotor dreaptaSpate;

    /**
     * This function is executed when this OpMode is selected from the Driver Station.
     */
    @Override
    public void runOpMode() {
        stangaFata = hardwareMap.get(DcMotor.class, "stangaFata");
        stangaSpate = hardwareMap.get(DcMotor.class, "stangaSpate");
        dreaptaFata = hardwareMap.get(DcMotor.class, "dreaptaFata");
        dreaptaSpate = hardwareMap.get(DcMotor.class, "dreaptaSpate");

        stangaFata.setDirection(DcMotor.Direction.REVERSE);
        stangaSpate.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();
        if (opModeIsActive()) {
            // Run
            directie.Fata(stangaFata, dreaptaFata, stangaSpate, dreaptaSpate);
            sleep(timp);
            directie.Stop(stangaFata, dreaptaFata, stangaSpate, dreaptaSpate);
            sleep(1500);
            directie.Spate(stangaFata, dreaptaFata, stangaSpate, dreaptaSpate);
            sleep(timp);
            directie.Stop(stangaFata, dreaptaFata, stangaSpate, dreaptaSpate);
            sleep(1500);
            directie.Stanga(stangaFata, dreaptaFata, stangaSpate, dreaptaSpate);
            sleep(timp);
            directie.Stop(stangaFata, dreaptaFata, stangaSpate, dreaptaSpate);
            sleep(1500);
            directie.Dreapta(stangaFata, dreaptaFata, stangaSpate, dreaptaSpate);
            sleep(timp);
            directie.Stop(stangaFata, dreaptaFata, stangaSpate, dreaptaSpate);
            sleep(1500);
            directie.StangaSus(stangaFata, dreaptaFata, stangaSpate, dreaptaSpate);
            sleep(timp);
            directie.Stop(stangaFata, dreaptaFata, stangaSpate, dreaptaSpate);
            sleep(1500);
            directie.DreaptaJos(stangaFata, dreaptaFata, stangaSpate, dreaptaSpate);
            sleep(timp);
            directie.Stop(stangaFata, dreaptaFata, stangaSpate, dreaptaSpate);
            sleep(1500);
            directie.DreaptaSus(stangaFata, dreaptaFata, stangaSpate, dreaptaSpate);
            sleep(timp);
            directie.Stop(stangaFata, dreaptaFata, stangaSpate, dreaptaSpate);
            sleep(1500);
            directie.StangaJos(stangaFata, dreaptaFata, stangaSpate, dreaptaSpate);
            sleep(timp);
        }
    }
}