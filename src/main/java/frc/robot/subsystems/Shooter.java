// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkFlex;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
  CANSparkFlex chooserMotor;
  CANSparkFlex motor;

  /** Creates a new Shooter. */
  public Shooter() {
    chooserMotor = new CANSparkFlex(Constants.CHOOSER_MOTOR_ID, null);
    motor = new CANSparkFlex(Constants.MOTOR_ID, null);
  }

  private void shootUp(){
    motor.set(1);
    chooserMotor.set(1);
  }

  private void shootDown(){
    motor.set(1);
    chooserMotor.set(-1);
  }

  private void stopShooter(){
    motor.set(0);
    chooserMotor.set(0);
  }

  public Command shootUpCommand(){
    return this.run(()-> shootUp());
  }

  public Command shootDownCommand(){
    return this.run(()-> shootDown());
  }

  public Command stopShooterCommand(){
    return this.run(()-> stopShooter());
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
