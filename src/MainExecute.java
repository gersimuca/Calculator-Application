import java.util.Scanner;
public class MainExecute {

    public static void main(String[] args) {

        double num1;
        double num2;
        char operator;
        double sum = 0;

            Scanner sc = new Scanner(System.in);
            System.out.println("Select operator [+, -, *, /] \n");
            operator = sc.next().charAt(0);

            System.out.println("Input your first number: \n");
            num1 = sc.nextDouble();

            System.out.println("Input your second number: \n");
            num2 = sc.nextDouble();

            if(Character.compare(operator, '/') == 0 && num2 == 0) {
                System.out.println("Second number can't be 0. Try again: \n");
                num2 = sc.nextDouble();
            }

            Funcitions calculator = new Funcitions();

            switch (operator) {
                case '+':
                    sum = calculator.addition(num1, num2);
                    break;
                case '-':
                    sum = calculator.subtraction(num1, num2);
                    break;
                case '*':
                    sum = calculator.multiplication(num1, num2);
                    break;
                case '/':
                    sum = calculator.division(num1, num2);
                    break;
                default:
                    System.out.println("You selected wrong operator! Try again");
                    break;
            }

            sc.close();
            System.out.println(num1 + " " + operator + " " + num2 + " = " + sum);
        }
    }
