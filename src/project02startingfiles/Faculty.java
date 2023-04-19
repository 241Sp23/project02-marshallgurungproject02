
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author S553314
 */
public class Faculty extends Employee {
    private final double annualSalary;
    private final int weeksPerYear;
    private final String department;

    public Faculty(String name, int number, boolean working, double salary, int weeks, String dept) {
        super(name, number, working);
        annualSalary = salary;
        weeksPerYear = weeks;
        department = dept;
    }
    @Override
    public double getPay() {
        return (2 * annualSalary) / weeksPerYear;
    }
    @Override
    public String toString() {
        return super.toString()+"\t"+annualSalary+"\t"+weeksPerYear+"\t"+department;
    }

}
