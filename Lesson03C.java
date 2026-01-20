public class Lesson03C {
    public static int returnMin(int[] abc){
        if(abc.length == 0){
            throw new IllegalArgumentException("Array Cannot be empty ");
        }

        int smallestNumber = Integer.MAX_VALUE; // As there cannot be saved a bigger value then that...
        for(int i = 0 ; i < abc.length; i++){
            if(abc[i] < smallestNumber){
                smallestNumber = abc[i];
            }
        }
        return smallestNumber;
    } 
    public static void main (String[] args){
        int[] inputArray = {1,93,043,-10};
        System.out.print("This is the Smallest number = " + returnMin(inputArray));
    }
}
