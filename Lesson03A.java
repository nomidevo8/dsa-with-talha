// Math Fucntion 


public class Lesson03A {
    public static void main(String[] args){
        float num = (float) Math.random() * 100;
        System.out.println("This is random Absolute " + (int) Math.ceil(num));
        System.out.println("This is random Floor " +  (int) Math.abs(num));
    }
}
