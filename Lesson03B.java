// Find the largest number in an array

public class Lesson03B {
    public static int returnMax(int[] abc){
        if(abc.length == 0){
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int biggestNumber = Integer.MIN_VALUE;

        for(int i = 0 ;  i < abc.length; i++){
            if (abc[i] > biggestNumber){
                biggestNumber = abc[i];
            }
        }
        return biggestNumber;
    }

    public static void main (String[] args){
        int[] inputArray = {1,3,-399, 8};
        System.out.println("This is the largest/Maximum Number = " + returnMax(inputArray));
    }
}
