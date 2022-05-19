import java.lang.reflect.Array;
import java.util.ArrayList;

public interface Arithmetic {
    int a = 2;
    int b = 2;
    public static void sum2() {
       System.out.println(a+b);
   }
   public static int increase(int number1, int number2) {
      int number3 = number1 * number2;
      return number3;
   }
    default double getSum(double number1, double number2) {
        return 0;
    }
    public int getSum(ArrayList<Integer>);
}


//- объвите метод getSum - возвращает int, принимает ArrayList<Integer>
}
