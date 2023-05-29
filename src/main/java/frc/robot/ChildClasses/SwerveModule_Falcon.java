// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.ChildClasses;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.sensors.CANCoder;

import edu.wpi.first.math.kinematics.SwerveModuleState;
import frc.robot.ParentClasses.SwerveModule;

/** Add your docs here. */
public class SwerveModule_Falcon extends SwerveModule{
    public TalonFX drive;
    public TalonFX steer;
    public CANCoder enc;

    public SwerveModule_Falcon(int driveID, int steerID, int encID) {
        drive = new TalonFX(driveID);
        steer = new TalonFX(steerID);
        enc = new CANCoder(encID);
    }

    @Override
    public void setState(SwerveModuleState state) {
        
    }
}
