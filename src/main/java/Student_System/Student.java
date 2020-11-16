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
    private ArrayList<Module> modules = new ArrayList<Module>();
    
    
    public Student(String name,String DOB,int age,int ID){
     this.name = name;
     this.DOB = DOB;
     this.age = age;
     this.ID = ID;
     
    }
    
    public String getUsername(){
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
    
    public void Register(Module module)
    {
        modules.add(module);
        module.AddStudent(this);
    }    
    
}
