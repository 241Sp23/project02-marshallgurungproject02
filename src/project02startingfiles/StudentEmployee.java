
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author S553314
 */
public class StudentEmployee extends Employee {
    private final int hoursWorked;
    private final boolean isWorkStudy;
    private final double payRate;
    
    public StudentEmployee(String name, int number, boolean working, int hours, boolean workStudy, double rate){
        super(name, number, working);
        hoursWorked = hours;
        isWorkStudy = workStudy ;
        payRate = rate;
    }
    @Override
    public double getPay(){
        double payrate = payRate*hoursWorked;
        return payrate;
    }  
    @Override
    public String toString(){
        return super.toString()+"\t"+hoursWorked+"\t"+isWorkStudy+"\t"+payRate;
    }
}
