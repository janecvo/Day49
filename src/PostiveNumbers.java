import java.util.Scanner;

public class PostiveNumbers {
    public static void main (String[] args){
        Scanner  scanner = new Scanner(System.in);
        while (true){   
            System.out.println("Enter a number");
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0){
                System.out.println("Process finished with exit code 0");
                break; 
            }
            
            if (userNum < 0) {
                System.out.println("Number must be a postive number.");
                continue;
            }

        System.out.println("Your number is " + userNum);
    }
}
}
