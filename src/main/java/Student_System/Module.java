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
public class Module {
    private String name;
    private ArrayList<Student> students = new ArrayList<Student>();//Array list for Student Objects
    
    public Module(String name){ //initialise variables
        this.name= name;
    }
    
    public String getName(){
        return name;
    }
    
    public void AddStudent(Student student){
        students.add(student);
        
    }
    
    public void print(){ // print method to list students in module
        System.out.print(name + "\n");
        System.out.print("----------------" + "\n");
        for(int i = 0; i< students.size(); i++){
            Student stu = students.get(i);
            System.out.print(stu.getName() + "\n");
           }
    }
}
