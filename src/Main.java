
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }


        System.out.println("hi there");System.out.println("hi there");System.out.println("hi there");

        for (int i = 1; i <= 5; i++) {
            System.out.println("*");
            for (int j = 1; j <= i; j++) {
                System.out.printf("A");
            }
        }

    }
}