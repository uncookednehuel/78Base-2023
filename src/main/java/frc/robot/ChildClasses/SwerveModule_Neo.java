// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.ChildClasses;

import com.ctre.phoenix.sensors.CANCoder;

import edu.wpi.first.math.kinematics.SwerveModuleState;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import frc.robot.ParentClasses.SwerveModule;

/** Add your docs here. */
public class SwerveModule_Neo extends SwerveModule{
    public Spark drive;
    public Spark steer;
    public CANCoder enc;

    public SwerveModule_Neo(int driveID, int steerID, int encID) {
        drive = new Spark(driveID);
        steer = new Spark(steerID);
        enc = new CANCoder(encID);
    }

    @Override
    public void setState(SwerveModuleState state) {
        
    }
}
