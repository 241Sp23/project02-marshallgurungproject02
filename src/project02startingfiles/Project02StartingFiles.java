package project02startingfiles;
import java.io.*;
import java.util.*;

public class Project02StartingFiles {

    public static void main(String[] args) throws FileNotFoundException{
        //Gather user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students in the file: ");
        int numOfStudents = input.nextInt();
        System.out.print("Enter the number of staff in the file: ");
        int numOfStaff = input.nextInt();
        System.out.print("Enter the number of faculty in the file: ");
        int numOfFaculty = input.nextInt();
        System.out.print("Enter the name of the file: ");
        String nameOfFile = input.next();
        System.out.println();
        
        //Open and read the file
        File inputFile = new File(nameOfFile);
        Scanner fileReader = new Scanner(inputFile);
        
        //Create an array
        Employee[] workers = new Employee[numOfStudents + numOfStaff + numOfFaculty];
        
        //Iterate through the file and add each line into the array
        int count = 0;
        while(fileReader.hasNext()){
            String[] info = fileReader.nextLine().strip().split(","); //splits the line at the commas

            if(count < numOfStudents){
                workers[count] = new StudentEmployee(info[0], (Integer.parseInt(info[1])), (Boolean.parseBoolean(info[2])), (Integer.parseInt(info[3])), (Boolean.parseBoolean(info[4])), (Double.parseDouble(info[5])));
            }
            else if(count < (numOfStudents + numOfStaff)){
                workers[count] = new ClassifiedStaff(info[0], Integer.parseInt(info[1]), Boolean.parseBoolean(info[2]), Double.parseDouble(info[3]), info[4]);
            }
            else{
                workers[count] = new Faculty(info[0], Integer.parseInt(info[1]), Boolean.parseBoolean(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5]);
            }
            
            count++;
        }
        
        //Print out the list
        for(Employee i: workers){
            System.out.println(i);
        }
        System.out.println();
        
        //Print out the two-week pay
        System.out.println("Pay for two-week pay period\n===========================");
        for(Employee i: workers){

            if(i.IsWorking()){
                System.out.printf("%-18s$%-9.2f", i.getName(), i.getPay());
                System.out.println();
            }
        }
        
        fileReader.close();
    }

    
}
