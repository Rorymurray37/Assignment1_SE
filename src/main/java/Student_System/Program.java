/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_System;


import java.util.ArrayList;
import org.joda.time.DateTime;
/**
 *
 * @author rorymurray
 */
public class Program {
    private String name;
    private ArrayList<Student> enrolledStudents = new ArrayList<Student>();
    private ArrayList<Module> modules = new ArrayList<Module>();
  
    DateTime Sdt = new DateTime();
    DateTime Edt = new DateTime();
   
    
    public Program(String name,DateTime Sdt,DateTime Edt){
      
        this.name = name;
        this.Sdt = Sdt;
        this.Edt = Edt;
        
    }
    
    public String getName(){
        return name;
    }
    public DateTime getStartdate(){
        return Sdt;
    }
    public DateTime getEnddate(){
        return Edt;
    }
    
   public void AddStudent(Student student){
       enrolledStudents.add(student);
   }
   
   public void AddModule(Module module){
       modules.add(module);
       
   }
   public void PrintModules(){
        for(int i = 0; i< modules.size(); i++){
            Module m = modules.get(i);
            System.out.print(m.getName());
            m.print();
        }
       
   }
   
}
