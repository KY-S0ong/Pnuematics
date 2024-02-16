// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.movePiston;
import frc.robot.commands.movePistonBoth;
import frc.robot.commands.reversePiston;
import frc.robot.commands.reversePistonBoth;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.pneumatics;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private final XboxController xc = new XboxController(Constants.XC1);

  private final pneumatics piston = new pneumatics();
  //private final falcon m_motor = new falcon();

  private final movePiston m_actuate = new movePiston(piston);
  private final reversePiston m_ReversePiston = new reversePiston(piston);
  private final movePistonBoth m_actuateBoth = new movePistonBoth(piston);
  private final reversePistonBoth m_ReversePistonBoth = new reversePistonBoth(piston);

  //private final driveMotor m_DriveMotor = new driveMotor(m_motor);
  //private final driveByController m_drive = new driveByController(xc, m_motor);

  // Replace with CommandPS4Controller or CommandJoystick if needed
  

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    //m_motor.setDefaultCommand(m_drive);
    new JoystickButton(xc, Constants.xcA).whileTrue(m_actuate);
    new JoystickButton(xc, Constants.xcB).whileTrue(m_ReversePiston);

    new JoystickButton(xc, 3).whileTrue(m_actuateBoth);
    new JoystickButton(xc, 4).whileTrue(m_ReversePistonBoth);
  }


  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}
