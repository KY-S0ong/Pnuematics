// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class pneumatics extends SubsystemBase {
  /** Creates a new pneumatics. */
  private final DoubleSolenoid climberpiston = new DoubleSolenoid(Constants.pcm, PneumaticsModuleType.CTREPCM, 0,1);
  private final DoubleSolenoid piston2 = new DoubleSolenoid(Constants.pcm, PneumaticsModuleType.CTREPCM, 2,3);
  private final DoubleSolenoid piston3 = new DoubleSolenoid(Constants.pcm, PneumaticsModuleType.CTREPCM, 4,5);

  public pneumatics() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void setForword(){
    climberpiston.set(Value.kForward);
  }
  public void setForwardBoth(){
    piston2.set(Value.kForward);
    piston3.set(Value.kForward);
  }
  

  public void setReverse(){
    climberpiston.set(Value.kReverse);
  }
  public void setReverseBoth(){
    piston2.set(Value.kReverse);
    piston3.set(Value.kReverse);
  }
  

  public void setOff(){
    climberpiston.set(Value.kOff);
  }
  public void setOffBoth(){
    piston2.set(Value.kOff);
    piston3.set(Value.kOff);
  }
  
  
}
