/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class WheelOfFortune extends SubsystemBase {
  /**
   * Creates a new WheelOfFortune.
   */
  CANSparkMax wheelMotor = new CANSparkMax(Constants.WHEEL_MOTOR_ID, MotorType.kBrushed);
  public WheelOfFortune() {

  }

public void setWheelMotor(double speed) {
  wheelMotor.set(speed);
}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
