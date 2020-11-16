package Student_System;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student stu1 = new Student("Rory Murray","17/04/2000",20,1739511);
        Student stu2 = new Student("James Bond","10/02/1965",55,17395954);
        Student stu3 = new Student("Dan O'Neill", "03/06/1999",21,2734949);
        Student stu4 = new Student("Katie Burke", "24/06/1998",22,57539439);
        Student stu5 = new Student("Asap Rocky", "30/08/1999",21,4968294);
        
        Program CS = new Program("Computer Science","01/09/2020","30/05/2021");
        stu1.RegisterForCourse(CS);
        stu2.RegisterForCourse(CS);
        stu3.RegisterForCourse(CS);
    
        
        Program EE = new Program("Electrical Engineering","01/09/2020","30/05/2021");
        stu4.RegisterForCourse(EE);
        stu5.RegisterForCourse(EE);
        
        
        Module NE = new Module("Networking");
        stu1.RegisterForModule(NE);
        stu3.RegisterForModule(NE);
        stu5.RegisterForModule(NE);
        stu4.RegisterForModule(NE);
        
        Module se = new Module("Software Engineering");
        stu1.RegisterForModule(se);
        stu2.RegisterForModule(se);
        stu3.RegisterForModule(se);
        stu5.RegisterForModule(se);
        
        Module ML = new Module("Machine Learning");
        stu3.RegisterForModule(ML);
        stu1.RegisterForModule(ML);
        stu2.RegisterForModule(ML);
        stu4.RegisterForModule(ML);
        stu5.RegisterForModule(ML);
        
        EE.AddModule(NE);
        CS.AddModule(ML);
        CS.AddModule(se);
        
        CS.Print();
        EE.Print();
    }
}
