// PROBLEM

// Write a funciton that takes an int[] and returns the sum  of all numbers 

// Input: {2,4,6}
// Output: 12


public class Lesson02C {
    public static int returnSum(int[] abc){
        int inProgressSum = 0;
   
        for(int i = 0; i < abc.length; i++ ){
            inProgressSum += abc[i];
        }
  
        return inProgressSum;
    }
    public static void main(String[] args){
        int[] numArray = {-9};
        System.out.println("This is the sum of that arrays " + returnSum(numArray));
    }
}
  