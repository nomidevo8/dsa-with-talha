// Polymorphism 
// Here, we can use same methods with different paramters and we can overide the same method in the child class 
// so on this behalf there are two types of Polymorphism. 
// 1- Compile-time ( Overloading );
//  _________  Here method same name can be use with different parameters


class Overloading{
    // This is called Overloading Where we can use the same name methods with different paramters like we did in the mulitple contructors 
    public int returnSum(int a , int b ){
        return (a + b);
    }
    public int returnSum(int a , int b, int c){
        return (a + b + c);
    }
}

// _______________________ OVERRIDNG

class OverridingParent{
    public void sound(){
        System.out.print("Here is the Different Voice");
    }
}

class Cat extends OverridingParent{
    public void sound(){
        System.out.print("Meoww");
    }
}


public class Lesson06A {
    public static void main(String[] args){

        // OVERLOADING  --- Compile-time
        Overloading objOverloading = new Overloading();
        System.out.println("Here this is the first overloading method result | " + objOverloading.returnSum(10, 39));
        System.out.println("Here this is the second overloading method result | " + objOverloading.returnSum(20, 45, 28));

        // OVERRIDING --- Run-time
        // Here we override the same method sound() 

        Cat objCat = new Cat();
        System.out.println("Here is the sound of cat instead of the default text that is defined in the parrent class sound method");
        objCat.sound();
    }
}
