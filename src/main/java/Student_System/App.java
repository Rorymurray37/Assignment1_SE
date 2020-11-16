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
        Module se = new Module("Soft eng");
        stu1.Register(se);
        stu2.Register(se);
        se.print();
    }
}
