// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.ChildClasses;

import frc.robot.ParentClasses.DrivetrainConst;

/** Constants class. Add all constants here*/
public class DrivetrainConst_Falcon extends DrivetrainConst{
    public static final int LU_DRIVE = 1;
    public static final int LU_STEER = 2;
    public static final int LU_ENC = 9;

    public static final int RU_DRIVE = 3;
    public static final int RU_STEER = 4;
    public static final int RU_ENC = 10;

    public static final int LD_DRIVE = 5;
    public static final int LD_STEER = 6;
    public static final int LD_ENC = 11;

    public static final int RD_DRIVE = 7;
    public static final int RD_STEER = 8;
    public static final int RD_ENC = 12;

    public static final double driveP = 0;
    public static final double driveI = 0;
    public static final double driveD = 0;
}