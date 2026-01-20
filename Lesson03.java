// write a funciton that will return maximum number

// My way 

// public class Lesson03 {
//     public static void main (String[] args){
//         int[] inputArray = {-1,-4,-95, -300};
//         System.out.print("Maximam number is = " + returnMax(inputArray) );
//     }
//     public static int returnMax(int[] abc){
//         if (abc == null || abc.length == 0){
//             throw new IllegalArgumentException("Array must not be empty");
//         }
//         int inProgressNum = abc[0];
//         for(int i = 0 ; i < abc.length; i++) {
//             if(inProgressNum < abc[i]){
//                 inProgressNum = abc[i];
//             }
//         }
//         return inProgressNum;
//     }
// }


// Standard way 

public class Lesson03 {
    public static void main(String[] args){
        int[] inputArray = {};
        System.out.print("Max number = " + returnMax(inputArray));
    }

    public static int returnMax(int[] abc){
        int standardMaxNumber = Integer.MIN_VALUE;
        for (int i = 0 ; i < abc.length; i++){
            if(standardMaxNumber < abc[i]){
                standardMaxNumber = abc[i];
            } 
        }
        return standardMaxNumber;
    }
}
