import java.util.Scanner;

public class Pratice12 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("연산>>");

    int num01 = scanner.nextInt();
    String operator = scanner.next();
    int num02 = scanner.nextInt();
    int result = 0;

    //if (operator.equals("+")) {
    //  result = num01 + num02;
    //} else if (operator.equals("-")) {
    //  result = num01 - num02;
    //} else if (operator.equals("*")) {
    //  result = num01 * num02;
    //} else if (operator.equals("/")) {
    //  result = num01 / num02;
    //}

    switch (operator) {
      case "+":
        result = num01 + num02;
        break;
      case "-":
        result = num01 + num02;
        break;
      case "*":
        result = num01 + num02;
        break;
      case "/":
        result = num01 + num02;
        break;
      default:
        System.out.println("0으로 나눌 수 없습니다.");
    }
    System.out.println(num01 + operator + num02 + "의 계산 결과는 " + result);
  }
}
//op.equals("+")
