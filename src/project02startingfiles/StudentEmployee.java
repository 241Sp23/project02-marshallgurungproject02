package project02startingfiles;

public class StudentEmployee extends Employee{
    //Declare variables
    private int hoursWorked;
    private boolean isWorkStudy;
    private double payRate;
    
    //Constructor
    public StudentEmployee(String name, int number, boolean working, int hours, boolean workStudy, double rate){
        super(name, number, working);
        this.hoursWorked = hours;
        this.isWorkStudy = workStudy;
        this.payRate = rate;
    }
    
    //getPay
    public double getPay(){
        return this.hoursWorked * this.payRate;
    }
    
    //toString
    public String toString(){
        return String.format("%-18s%-18s%-9s%-9s%-9s%-5s", getName(), getEmployeeId(), isWorking(), this.hoursWorked, this.isWorkStudy, this.payRate);
    }
    
}
