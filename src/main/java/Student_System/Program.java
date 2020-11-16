/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_System;


import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
/**
 *
 * @author rorymurray
 */
public class Program {
    private String name,start,end;
    private ArrayList<Student> enrolledStudents = new ArrayList<Student>(); //array list for Student and Module Objects
    private ArrayList<Module> modules = new ArrayList<Module>();
  
    DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy"); //Joda time Objects
    DateTime Start;
    DateTime End;
    
    
    public Program(String name,String Sdt,String Edt){//Initialise variables
      
        this.name = name;
         this.Start = formatter.parseDateTime(Sdt);
         this.End = formatter.parseDateTime(Edt);
        
    }
    
    public String getName(){ // get methods
        return name;
    }
    public DateTime getStartdate(){
        return Start;
    }
    public DateTime getEnddate(){
        return End;
    }
    
   public void AddStudent(Student student){ //Add student to course 
       enrolledStudents.add(student);
   }
   
   public void AddModule(Module module){ // Add module to course
       modules.add(module);
       
   }
   
   public void Print(){ //Print method that lists the course name, modules and enrolled students.
       System.out.print(name + "\n"+"\n" + "Modules : ");
        for(int i = 0; i< modules.size(); i++){
            Module m = modules.get(i);
            
            System.out.print(m.getName()+"| ");
            
        }
       System.out.print("\n"+"\n");
        
       System.out.print("Students" + "\n"+"\n");
        
        
        for(Student s : enrolledStudents){
            s.Print();
        }
       
   }
   
}
