package org.firstinspires.ftc.teamcode.hardware;
import com.qualcomm.robotcore.hardware.DcMotor;

public class LinearActuator {
  private DcMotor act;

  public LinearActuator(DcMotor act) {

    this.act = act;
  }

  public void setVolt(double vltg, boolean inverted) {
    if (!inverted) {
      act.setPower(vltg);
    } else {
      act.setPower(-vltg);
    }
  }
}
