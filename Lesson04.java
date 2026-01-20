import java.util.Scanner;

public class Lesson04 {
    public static void main(String[] args){
        Scanner superScanner = new Scanner(System.in);
        System.out.println("Hy! Press any key and then Enter to proceed");
        String isProceed = superScanner.next();
        System.out.println("Please Enter Your Name");
        String userName = superScanner.next();
        System.out.println("Please Enter your Father Name");
        String userFatherName = superScanner.next();
        System.out.println("Your Email");
        String userEmail = superScanner.next();
        System.out.println("Your Phone Number");
        String userPhoneNo = superScanner.next();
        System.out.println("What is your age?");
        int userAge = superScanner.nextInt();
        System.out.println("is it true?");
        System.out.println("God Help those who help themseleves? true or false");
        boolean thatSentenceTrue = superScanner.nextBoolean();

        System.out.println("Here is your Details");

        System.out.println("Name         | " + userName);
        System.out.println("Father Name  | " + userFatherName);
        System.out.println("User Email   | " + userEmail);
        System.out.println("User Phone   | " + userPhoneNo);
        System.out.println("User Age     | " + userAge);
        System.out.println("Sentence is  | " + thatSentenceTrue);
        
    }
}
