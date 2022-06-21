import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println("enter your nAME");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();

        System.out.println("Your name is : " + name);
    }
}
