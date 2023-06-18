import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    char operator;

    Double number1, number2, result;

    // create an object of Scanner class

    Scanner input = new Scanner(System.in);

    // ask users to enter operator

    System.out.println("Choose an operator: +, -, *, or /");

    operator = input.next().charAt(0);

    // ask users to enter numbers

    System.out.println("Enter first number");

    number1 = input.nextDouble();

    System.out.println("Enter second number");

    number2 = input.nextDouble();

    switch (operator) {

      // performs addition between numbers

      case '+':

        result = number1 + number2;

        System.out.println(number1 + " + " + number2 + " = " + result);

        break;

      // performs subtraction between numbers

      case '-':

        result = number1 - number2;

        System.out.println(number1 + " - " + number2 + " = " + result);

        break;

      // performs multiplication between numbers

      case '*':

        result = number1 * number2;

        System.out.println(number1 + " * " + number2 + " = " + result);

        break;

      // performs division between numbers

      case '/':

        result = number1 / number2;

        System.out.println(number1 + " / " + number2 + " = " + result);

        break;

      default:

        System.out.println("Invalid operator!");

        break;

    }

    input.close();

  }

}

Run Code

Output 1

Choose an operator: +, -, *, or /

*

Enter first number

3

Enter second number

9

3.0 * 9.0 = 27.

Here, we have used the Scanner class to take 3 inputs from the user.

operator - specifies the operation to be performed

number1/number2 - operands to perform operation on

Since the operator matches the case '*', so the corresponding codes are executed.
