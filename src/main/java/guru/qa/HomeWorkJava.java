
import java.util.List;

public class HomeWorkJava {
  public static void main(String[] args) {

    ArithmeticOperations();
    ArithmeticOperationsDouble ();
    LogicalOperations();
    ArithmeticOperationsOverflow();
  }
  private static void ArithmeticOperations () {
    int a = 10;
    int b = 20;

    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("b / a = " + (b / a));

  }
  private static void ArithmeticOperationsDouble () {
    int x = 5;
    double doubleValue = 10;
    System.out.println("Сложение: " + (x + doubleValue));
    System.out.println("Вычитание: " + (x - doubleValue));
    System.out.println("Умножение: " + (x * doubleValue));
    System.out.println("Деление: " + (x / doubleValue));
  }
  private static void LogicalOperations () {
    int с = 6;
    int d = 4;
    System.out.println("с > d = " + (с > d) );
    System.out.println("с < d = " + (с < d) );
    System.out.println("d >= с = " + (d >= с) );
    System.out.println("d <= с = " + (d <= с) );

  }
  private static void ArithmeticOperationsOverflow () {
    int maxInt = Integer.MAX_VALUE;
    int minInt = Integer.MIN_VALUE;

    System.out.println("Переполнение int при сложении: " + (maxInt + 1));
    System.out.println("Переполнение int при вычитании: " + (minInt - 1));

  }
}