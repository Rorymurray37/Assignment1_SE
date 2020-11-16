/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_System;
import java.util.ArrayList; 
/**
 *
 * @author rorymurray
 */

public class Student{
    private String name,DOB;
    private int age,ID;
    private ArrayList<Module> modules = new ArrayList<Module>();//Array list for Module Objects
    private Program course;
    
    public Student(String name,String DOB,int age,int ID){ // Initialise variables
     this.name = name;
     this.DOB = DOB;
     this.age = age;
     this.ID = ID;
     
    }
    
    public String getUsername(){ //Get methods
        return name + age;  
    }
    public String getName(){
        return name;     
    }
    public int getAge(){
        return age;   
    }
    public int getID(){
        return ID;      
    }
    public String getDOB(){
        return DOB;
      
    }
    public String getCourse(){
        return course.getName();
    }
    
    public void RegisterForModule(Module module) //Register student for module
    {
        modules.add(module);
        module.AddStudent(this);
    }    
    public void RegisterForCourse(Program p){ //Register student for Course
        this.course = p;
        course.AddStudent(this);
    }
    
    public void Print(){//Print method for Student details
       
       String out = name +"| "+ this.getUsername() + "| " + course.getName();
        System.out.print(out + "\n");
        System.out.print("Modules"+ "\n" + "----------"+"\n");
        
        for (Module num : modules){
            System.out.print(num.getName()+"\n");
      }
           System.out.print("\n" + "\n");    
    }
    
}
