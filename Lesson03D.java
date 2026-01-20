// Given an array, store its reverse into another array

public class Lesson03D{
    public static void main (String[] args){
        int[] inputArray = {1,2,3,4,5};
        int[] reverseArray = returnReverseArray(inputArray);

        System.out.print("Here this is Testing of reverse array | ");
        printReverse(reverseArray);
    }

    public static int[] returnReverseArray(int[] abc){
        if(abc.length == 0 ){
            throw new IllegalArgumentException("Please, the empty array cannot be expected, Thanks");
        }

        int[] reverseArray = new int[abc.length];
        int reverseArrayIndex = 0;
        int intialization = abc.length - 1;
        for(int i = intialization; i >= 0; i--){
            reverseArray[reverseArrayIndex] = abc[i];
            reverseArrayIndex++;
        }

        return reverseArray;
    }

    public static void printReverse(int[] reverseArray){
        for(int i = 0 ; i < reverseArray.length; i++){
            System.out.print(reverseArray[i]);
        }
    }
}