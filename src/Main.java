import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Write second number: ");
        int num2 = scanner.nextInt();
        int res;
        System.out.print("Action: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();
        switch (action){
            case "+":
                res = num1 + num2;
                System.out.print("Result: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.print("Result: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.print("Result: " + res);
                break;
            case "/":
                if(num2 == 0) {
                    System.out.println("Error");
                }else{
                    res = num1 / num2;
                    System.out.print("Result: " + res);
                }
                break;
            default:
                System.out.println("Data not correct");
        }
    }
}