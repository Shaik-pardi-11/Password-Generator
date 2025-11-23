import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            Generator generator = new Generator(keyboard);
            generator.mainLoop();
        }
    }
}
