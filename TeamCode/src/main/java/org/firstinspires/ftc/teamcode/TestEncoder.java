package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import java.io.Console;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "TestEncoder")
public class TestEncoder extends LinearOpMode {

    private MotoareAuto directie = new MotoareAuto();

    private static long timp = 250;

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

        // Init
        stangaFata.setDirection(DcMotor.Direction.REVERSE);
        stangaSpate.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();
        if (opModeIsActive()) {
            // Run
            directie.Fata(stangaFata, dreaptaFata, stangaSpate, dreaptaSpate);
            int position = stangaFata.getCurrentPosition();
            sleep(timp);
            position = stangaFata.getCurrentPosition();
        }
    }
}