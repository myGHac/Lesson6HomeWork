public class Delivery {

    public static void main(String[] args) {
        int counter = 1;
        int client = 6;
        int factorial =1;

        do {
            factorial = factorial * counter;
            counter++;

        } while (counter <= client);

        System.out.println("Возможных вариантов доставки : " + factorial + " ");

    }
}
