// PROBLEM

// Write a funciton that returns the number of even numbers are in the array.

// Input : {1,2,3,4,5,6};
// Output : 3;

public class Lesson02D {

    public static int returnCountEven(int[] abc){
        int inProgressNum = 0;
        for(int i = 0 ; i < abc.length; i++){
            if((abc[i] % 2) == 0){
                inProgressNum++;
            }
        }
        return inProgressNum;
    }
    public static void main(String[] args){
        int[] inputArray = {1,2,3,4,5,6};
        System.out.println("This is the numbers of Even Numbers " + returnCountEven(inputArray));
    }
}
