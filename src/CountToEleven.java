import java.util.Scanner;
public class CountToEleven {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number less than 11");
        int start = Integer.valueOf(scanner.nextLine());
        int end = 12;

        for (int i = start; i < end; i++){
            System.out.println(i);
        }
    }
}
