public class Lesson02A {

    // Check if the int array has odd number 

    
    public static boolean hasOdd(int[] param1){


        for(int i = 0; i < param1.length; i++){
            if( (param1[i] % 2) == 1 ){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] numbers = {2, 4, 6, 8, 10};

        System.out.println("Is this have odd numbers? " + hasOdd(numbers));
        // System.out.println("Hello");
    }
}
