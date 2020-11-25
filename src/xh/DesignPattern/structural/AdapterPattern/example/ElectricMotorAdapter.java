package DesignPattern.structural.AdapterPattern.example;

/**
 * Created by Xiao Hong on 2020-07-21
 */
public class ElectricMotorAdapter implements Motor {
    
    private ElectricMotor electricMotor;
    
    public ElectricMotorAdapter( ) {
        this.electricMotor = new ElectricMotor();
    }
    
    @Override
    public void driver() {
        electricMotor.electricDrive();
    }
}
