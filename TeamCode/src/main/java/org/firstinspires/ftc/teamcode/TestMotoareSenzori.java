package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@TeleOp(name = "TestMotoareSenzori")
public class TestMotoareSenzori extends LinearOpMode {

    private MotoareAuto directie = new MotoareAuto();

    private DcMotor stangaFata;
    private DcMotor stangaSpate;
    private DcMotor dreaptaFata;
    private DcMotor dreaptaSpate;
    private ColorSensor colorSensorFata;

    private DistanceSensor distanceSensorFata;

    @Override
    public void runOpMode() throws InterruptedException {
        colorSensorFata = hardwareMap.get(ColorSensor.class, "colorSensorFata");
        distanceSensorFata = hardwareMap.get(DistanceSensor.class, "distanceSensorFata");

        stangaFata = hardwareMap.get(DcMotor.class, "stangaFata");
        stangaSpate = hardwareMap.get(DcMotor.class, "stangaSpate");
        dreaptaFata = hardwareMap.get(DcMotor.class, "dreaptaFata");
        dreaptaSpate = hardwareMap.get(DcMotor.class, "dreaptaSpate");

        stangaFata.setDirection(DcMotor.Direction.REVERSE);
        stangaSpate.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();
        if (opModeIsActive()) {

            while (opModeIsActive()) {
                double distance = distanceSensorFata.getDistance(DistanceUnit.CM);
                int red = colorSensorFata.red();
                int green = colorSensorFata.green();
                int blue = colorSensorFata.blue();
                int sum = red + green + blue + 1;
                red = 255 * red / sum;
                green = 255 *  green / sum;
                blue = 255 *  blue / sum;
                String color;
                if (blue > green && blue > red) {
                    color = "purple";
                }
                else {
                    if (red > blue) {
                        color = "yellow";
                    }
                    else {
                        if (red + blue > green) {
                            color = "white";
                        }
                        else {
                            color = "green";
                        }
                    }
                }
                telemetry.addData("Red", red);
                telemetry.addData("Green", green);
                telemetry.addData("Blue", blue);
                telemetry.addData("Pixel", color);
                telemetry.addData("distance", distance);

                telemetry.update();
            }

        }
    }
}
