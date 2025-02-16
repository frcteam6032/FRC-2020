/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class SpinBelts extends CommandBase {
  /**
   * Creates a new SpinBelts.
   */
  double m_speed;
  public SpinBelts(double speed) {
    m_speed = speed;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.belts);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    RobotContainer.belts.setBeltMotor(m_speed);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.belts.setBeltMotor(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
