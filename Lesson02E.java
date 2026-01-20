// PROBLEM

// Write a function  in which we input an array and it prints that array in reverse order..

// input : {1,2,3,4,5};
// output: 4 3 2 1

public class Lesson02E {

    public static void returnAndPrintReverse(int[] abc){
        for(int i = abc.length - 1; i >= 0; i--){
            System.out.print(abc[i] );
        }
    }
    public static void main(String[] args){
        int[] inputArray = {1,2,3,4,5};
        System.out.println("This is the numbers of Even Numbers ");
        returnAndPrintReverse(inputArray);
    }
}
