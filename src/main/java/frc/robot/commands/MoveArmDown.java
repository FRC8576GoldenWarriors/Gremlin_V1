// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Arm;

public class MoveArmDown extends CommandBase {
  /** Creates a new MoveArm. */
  Arm arm;
  double arm_speed;
  public MoveArmDown(Arm arm, double speed) {
    this.arm = arm;
    arm_speed = speed;
    addRequirements(arm);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // armSpeed = 0.2; //RobotContainer.joystick.getRawAxis(1)*0.1;
    Arm.setSpeed(arm_speed);

    // if (Robot.potentiometer2.get()){
    //     Arm.setSpeed(0);
    //     end(true);
    // }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Arm.setSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
