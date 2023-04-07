package project02startingfiles;

public abstract class Employee {
    //Declare variables
    private String employeeName;
    private int employeeId;
    private boolean isWorking;
    
    //Constructor
    public Employee(String name, int number, boolean employed){
        this.employeeName = name;
        this.employeeId = number;
        this.isWorking = employed;
    }
    
    //Getter methods
    public String getName(){
        return this.employeeName;
    }
    
    public int getEmployeeId(){
        return this.employeeId;
    }
    
    public boolean isWorking(){
        return this.isWorking;
    }
    
    //Setter methods
    public void setName(String name){
        this.employeeName = name;
    }
    
    public void setEmployeeId(int number){
        this.employeeId = number;
    }
    
    public void setIsWorking(boolean employed){
        this.isWorking = employed;
    }
    
    //Abstract method
    public abstract double getPay();
}

