import java.util.Scanner;

public class DZ_70 {
    public static void main(String[] args) {
        int a, b;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();

        try {
            if (a == 0)
                throw new NullPointerException();
            if (b==0)
                throw new ArithmeticException();
            if (a<0||b<0)
                throw new Exception();
        }
        catch (NullPointerException nullPointerException) {
            System.out.println("0 всегда будет 0");
        }
        catch (ArithmeticException arithmeticException) {
            System.out.println("Деление на 0");
        }
        catch (Exception value){
            System.out.println("Деление с ориццательным числом");
        }


        try {
            if (a-b<0)
                throw new ArithmeticException();
            if (a==0&&b<0)
                throw new ArithmeticException();
        } catch (ArithmeticException arithmeticException){
            System.out.println("Отрицательное значение");
        }


    }
}
