public class Romb {

    public static void main(String[] args) {

        int num = 10;

        System.out.println("Ромб");
        for (int i = 1; i < num; ++i) {

            for (int j = num; j > i; --j)
                System.out.print(" ");

            for (int j = 1; j < 2 * i; ++j)
                System.out.print("*");

            System.out.println();
        }

        for (int i = num; i >= 1; --i) {

            for (int j = num; j > i; --j)
                System.out.print(" ");

            for (int j = 1; j < i * 2; ++j)

                System.out.print("*");

            System.out.println();
        }

    }
}
