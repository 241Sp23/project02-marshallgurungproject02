/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author S553314
 */
public abstract class Employee {
    private int employeeId;
    private String employeeName;
    private boolean isWorking;

    public Employee(String name, int number, boolean employed) {
        employeeName = name;
        employeeId = number;
        isWorking = employed;
    }
    public String getName() {
        return employeeName;
    }
    public void setName(String name) {
        employeeName = name;
    }
      public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int number) {
        employeeId = number;
    }
      public boolean IsWorking() {
        return isWorking;
    }
    public void setIsWorking(boolean employed) {
        isWorking = employed;
    }
    public String toString(){
        return employeeName+"\t"+employeeId+"\t"+isWorking;
    }
     
    
    public abstract double getPay();
}
