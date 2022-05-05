import java.util.Scanner;

public class Multiplication {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input a number:");
        int num = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i < 11; i++){
            int val = num*i;
            System.out.println(num +" x " + i + "=" +val);
        }
    }
}

