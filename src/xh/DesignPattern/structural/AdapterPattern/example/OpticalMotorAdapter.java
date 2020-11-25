package DesignPattern.structural.AdapterPattern.example;

/**
 * Created by Xiao Hong on 2020-07-21
 */
public class OpticalMotorAdapter implements Motor {
    
    private OpticalMotor opticalMotor;
    
    public OpticalMotorAdapter() {
        this.opticalMotor = new OpticalMotor();
    }
    
    @Override
    public void driver() {
        opticalMotor.opticalDrive();
    }
}
