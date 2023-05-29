// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.ChildClasses.SwerveModule_Falcon;
import frc.robot.ParentClasses.SwerveModule;

public class SwerveDrivetrain extends SubsystemBase {
  private static SwerveModule[] modules;

  public SwerveDrivetrain() {
    modules = new SwerveModule[] {new SwerveModule_Falcon(0, 0, 0), new SwerveModule_Falcon(0, 0, 0), new SwerveModule_Falcon(0, 0, 0), new SwerveModule_Falcon(0, 0, 0)};
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
