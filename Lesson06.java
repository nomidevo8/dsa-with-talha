// Inheritance 

// It means we can use parent methods and properties in the child class 

import java.util.Scanner;

class ParentClass{
    String name;
    int age;

    ParentClass(){
        this.name = "Nauman";
        this.age = 22;
    }
}

class ChildClass extends ParentClass{
    int marks;
    ChildClass(int marks){
        this.marks = marks;
    }
}

// _________________________________ 

class SuperParentClass{
    int SuperClassAge;
    String SuperClassName;
    // Parameterized class 
    SuperParentClass(int SuperClassAge, String SuperClassName){
        this.SuperClassAge = SuperClassAge;
        this.SuperClassName = SuperClassName;
    }
}

class SuperChildclass extends SuperParentClass{
    int marks;
    SuperChildclass(int SuperClassAge, String SuperClassName, int marks){
        super(SuperClassAge, SuperClassName);
        this.marks = marks;
    }
}

// ____________________________________

public class Lesson06 {
    public static void main(String[] arg){
        ChildClass inherited = new ChildClass(50);
        System.out.println(inherited.name + " is " + inherited.age + " years old got the marks = " + inherited.marks);


        // Inherited with Paramterized contruct in the parent 
        Scanner scr = new Scanner(System.in);
        System.out.println("Do you want to see how the super functiohnality work in Parent Paramatarized Contruct? Enter Yes?");
        String wantSuperFunction = scr.next();
        SuperChildclass spc = new SuperChildclass(22, "Nauman", 33);
        System.out.println("Here is Super Class information |");
        System.out.print(spc.SuperClassName + " is " + spc.SuperClassAge + " year old got the marks = " + spc.marks);
    }
}


// Important 
// mportant Rules
// Rule #1

// If parent has only parameterized constructor,
// child MUST call super(parameters)