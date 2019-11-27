/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import java.text.DecimalFormat;

import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {

  CasseroleCustomController ccc;
  private static DecimalFormat df2 = new DecimalFormat("#.##");
  private static DecimalFormat df4 = new DecimalFormat("#.####");

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    ccc = new CasseroleCustomController(0);
  }


  @Override
  public void autonomousInit() {

  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {

  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    System.out.println(df2.format(ccc.getJoystickX()));
    System.out.println(df2.format(ccc.getJoystickY()));
    System.out.println(df2.format(ccc.getJoystickTwist()));
    System.out.println(df4.format(ccc.getUpperKnob()));
    System.out.println(df4.format(ccc.getLowerKnob()));
    System.out.println(ccc.getJoystickButton());
    //ccc.debugPrint();

    ccc.ledUpdate();

  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
    
  }
}
