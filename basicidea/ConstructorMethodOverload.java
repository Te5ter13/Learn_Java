package basicidea;


public class ConstructorMethodOverload {
    //constructor overloading
    int id;
    String name;
    ConstructorMethodOverload(){
        System.out.println("Default Constructor");
    }
    ConstructorMethodOverload(int i, String fullName){
        id = i;
        name = fullName;
    }

    //Method OVerload
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        //Constructor Overload
        ConstructorMethodOverload onlyContructor = new ConstructorMethodOverload();
        System.out.println("Default Constructor Values");
        System.out.println("Student id ="+onlyContructor.id+"\nStudent Name: "+onlyContructor.name);

        System.out.println("\nParameterized Constructor");
        ConstructorMethodOverload onlyContructorparameter = new ConstructorMethodOverload(10, "Johnny");
        System.out.println("Student id is:"+onlyContructorparameter.id+"\nStudent Name is"+onlyContructorparameter.name);

        //Method OVerloading
        System.out.println("\nMethod Overloading is:");
        System.out.println("Sum is:"+ConstructorMethodOverload.add(13,13));
        System.out.println("Sum is:"+ConstructorMethodOverload.add(13,13,13));
    }
    
}
