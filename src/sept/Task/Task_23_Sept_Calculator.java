package sept.Task;

public class Task_23_Sept_Calculator {
    public static void main(String[] args) {
      /*  Create a simple calculator that performs addition,
      subtraction, multiplication, and division,
      modulus based on user input using switch statements.
                Inputs :   num 1, num 2, +
                Output :  num1+num2 → print information.*/
      int num1 = 10, num2=5;
        char ch='+';
        switch (ch){
            case '+':
                int sum= num1+num2;
                System.out.println(sum);
                        break;
            case '-':
                int diff= num1-num2;
                System.out.println(diff);
                break;
            case '*':
                int mul= num1*num2;
                System.out.println(mul);
                break;
            case '/':
                int div= num1/num2;
                System.out.println(div);
                break;
            case '%':
                int mod= num1%num2;
                System.out.println(mod);
                break;
            default:
                System.out.println("Incorrect operator");
                break;
        }
        System.out.println("Loop ends --");

    }
}
