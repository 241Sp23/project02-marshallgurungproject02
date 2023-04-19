
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author S553314
 */
public class ClassifiedStaff extends Employee{
    private double weeklySalary;
    private String division;
    
    public ClassifiedStaff(String name, int number, boolean working, double salary, String div){
        super(name, number, working);
        weeklySalary = salary;
        division = div;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String div) {
        division = div;
    }
    @Override
    public double getPay() {
        return weeklySalary * 2;
    }
    @Override
    public String toString() {
        return super.toString() + "\t" + weeklySalary + "\t" + division;
    }
}
