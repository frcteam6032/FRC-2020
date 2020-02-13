/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import com.revrobotics.CANSparkMax;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;


//import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */
  
    private final CANSparkMax m_frontLeft = new CANSparkMax(Constants.FRONT_LEFT_DRIVE_ID, MotorType.kBrushless);
    //private final CANSparkMax m_rearLeft = new CANSparkMax(Constants.REAR_LEFT_DRIVE_ID, MotorType.kBrushless);
    //private final SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);
 
    private final CANSparkMax m_frontRight = new CANSparkMax(Constants.FRONT_RIGHT_DRIVE_ID, MotorType.kBrushless);
    //private final CANSparkMax m_rearRight = new CANSparkMax(Constants.REAR_RIGHT_DRIVE_ID, MotorType.kBrushless);
   // private final SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);
 
    DifferentialDrive m_drive = new DifferentialDrive(m_frontLeft, m_frontRight);

    
    
   
  public DriveTrain() {
    
    
    
  }

   
  public void arcadeDrive(double speed, double rotation, boolean square) {
    m_drive.arcadeDrive(speed, rotation, square);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
