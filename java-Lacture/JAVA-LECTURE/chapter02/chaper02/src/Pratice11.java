import java.util.Scanner;

public class Pratice11 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("달을 입력하세요.(1~12)");

    int month = scanner.nextInt();

    //if (month >= 3 && month <= 5) {
    //  System.out.println("봄");
    //} else if (month >= 6 && month <= 8) {
    //  System.out.println("여름");
    //} else if (month >= 9 && month <= 11) {
    //  System.out.println("가을");
    //} else {
    //  System.out.println("겨울");
    //}

    switch (month) {
      case 3:
      case 4:
      case 5:
        System.out.println("봄");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("여름");
        break;
      case 9:
      case 10:
      case 11:
        System.out.println("가을");
        break;
      case 1:
      case 2:
      case 12:
        System.out.println("겨울");
        break;
      default:
        System.out.println("잘못입력");
    }
  }
  //op.equals("+");
}
