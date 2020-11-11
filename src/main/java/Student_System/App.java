package Student_System;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student me = new Student("Rory","17/04/2000",20,1739511);
        Module cs = new Module("Soft eng");
        me.Register(cs);
        cs.print();
    }
}
