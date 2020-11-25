package DesignPattern.structural.AdapterPattern.example;

/**
 * Created by Xiao Hong on 2020-07-21
 */
public class MainClass {
    
    public static void main(String[] args) {
        Motor motor1 = new ElectricMotorAdapter();
        Motor motor2 = new OpticalMotorAdapter();
        motor1.driver();
        motor2.driver();
        
    }
}
