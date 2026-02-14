import java.util.Scanner;
public class Maininput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello user!");
        System.out.println("Enter your name: ");
        String name= sc.nextLine();
        System.out.println("Enter your lucky number: ");
        int lucky = sc.nextInt();
        System.out.println("Hello "+name+",! Your lucky number is: "+lucky+ " shows your are hardworking. Keep it up!");
    }
}