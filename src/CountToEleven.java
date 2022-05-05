import java.util.Scanner;
public class CountToEleven {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        while (true){
        System.out.println("Enter a number less than 11");
        int start = Integer.valueOf(scanner.nextLine());
        int end = 12;
        if (start > end){
            System.out.println("Your number is greater than 11. Please enter a number less than 11.");
        }else 
        for (int i = start; i < end; i++){
                        System.out.println(i);
                }
                break;
        }
    }
}
