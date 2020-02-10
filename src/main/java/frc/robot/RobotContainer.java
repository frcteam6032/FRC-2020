/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.SpinIntake;
import frc.robot.commands.StopIntake;
import frc.robot.subsystems.Belts;
import frc.robot.subsystems.Climber;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Gate;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.WheelOfFortune;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  final Joystick driverController = new Joystick(Constants.DRIVER_CONTROLLER_PORT);
  final Joystick operatorController = new Joystick(Constants.OPERATOR_CONTROLLER_PORT);

  final Button oButtonA = new JoystickButton(this.operatorController, Constants.BUTTON_A);
  final Button oButtonB = new JoystickButton(this.operatorController, Constants.BUTTON_B);
  final Button oButtonX = new JoystickButton(this.operatorController, Constants.BUTTON_X);
  final Button oButtonY = new JoystickButton(this.operatorController, Constants.BUTTON_Y);

  final Button oButtonRightBumper = new JoystickButton(this.operatorController, Constants.RIGHT_BUMPER);
  final Button oButtonLeftBumper= new JoystickButton(this.operatorController, Constants.LEFT_BUMPER);

  public static DriveTrain driveTrain;
  public static Intake intake;
  public static Gate gate;
  public static WheelOfFortune wheelOfFortune;
  public static Climber climber;
  public static Belts belts;

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */

  public RobotContainer() {
    driveTrain = new DriveTrain();
    intake = new Intake();
    gate = new Gate();
    wheelOfFortune = new WheelOfFortune();
    climber = new Climber();
    belts = new Belts();





    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    oButtonA.whenPressed(new SpinIntake());
    oButtonA.whenReleased(new StopIntake());


  }

  public double getDriverRawAxis (int axis){
    return this.driverController.getRawAxis(axis);

  }

  public boolean getDriverRawButton (int button) {
    return this.driverController.getRawButton(button);
  }

  public int getDriverPOV() {
    return this.driverController.getPOV();
  }


  public double getOperatorRawAxis (int axis){
    return this.driverController.getRawAxis(axis);
  }

  public boolean getOperatorRawButton (int button){
    return this.operatorController.getRawButton(button);
  }

  public int getOperatorPOV() {
    return this.operatorController.getPOV();
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    //Replace this to call the command groups that is wanted
    return null;//new Command(); cat
  }
}
