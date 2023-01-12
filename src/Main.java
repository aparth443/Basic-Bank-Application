import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name = sc.nextLine();
        System.out.println("Enter the password:");
        String password = sc.nextLine();
        System.out.println("Enter balance:");
        double balance = sc.nextDouble();

        SBIUser user = new SBIUser(name,balance,password);
        String message = user.addMoney(100000);
        System.out.println(message);
        
        System.out.println("Enter the amount u want to withdraw");
        int money = sc.nextInt();
        System.out.println("Enter Password:");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money,pass));
        System.out.println(user.calculateInterest(10));
    }
}
