public class RsTriangle {

    public static void main(String[] args) {

        int num = 10;

        System.out.println("Равносторонний треугольник");
        for (int i = 1; i <= num; ++i) {

            for (int j = num; j > i; --j)
                System.out.print(" ");

            for (int j = 1; j < 2 * i; ++j)
                System.out.print("*");

            System.out.println();
        }
    }
}






