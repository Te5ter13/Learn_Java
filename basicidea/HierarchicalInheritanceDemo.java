/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;

/**
 *
 * @author tester13
 */

//Super class
class Employee{
    float salary = 40000;
}

//Sub class
class PermanentEmp extends Employee{ 
    double hike = 0.5;
}
class TemporaryEmp extends Employee{
    double hike = 0.35;
}
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        PermanentEmp p = new PermanentEmp();
        TemporaryEmp t = new TemporaryEmp();
        System.out.println("Permanent Emp Salary is "+p.salary);
        System.out.println("Hike for Permanent Employee is "+p.hike);
        System.out.println("Temporary salary is "+t.salary);
        System.out.println("Hike for temp Emp is "+t.hike);
    }
}

