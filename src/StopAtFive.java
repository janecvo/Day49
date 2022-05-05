import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args){
        Scanner  scanner = new Scanner(System.in);
        while (true){
            System.out.println("Give a number");
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum !=5){
                continue;
            }

            if (userNum == 5){
                System.out.println("Process finished with exit code 0");
                break;
            }
    } 
}
}

