import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        example1();
        example2();
    }

    private static void example2() throws FileNotFoundException {
        String fname = "turtles";
        ArrayList<Turtles> turtless = readTurtlesFromFile(fname);
        System.out.println(turtles);
    }

    private static ArrayList<Turtles> readTurtlesFromFile(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        ArrayList<Turtles> turtles = new ArrayList<>();
        while (scanner.hasNext()){
            String n = scanner.next();
            double w = scanner.nextDouble();
            String c = scanner.next();
            turtles.add(new Turtle(n,  c, w));
        }
        scanner.close();
        return turtles;
    }

    private static void example1() throws FileNotFoundException {
        String filename = "ab.txt";
        ArrayList<Integer> numbers = readIntegersFromFile(filename);
        System.out.println(numbers);
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
    }

    private static ArrayList<Integer> readIntegersFromFile(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        ArrayList<Integer> numbers = new ArrayList<>();
        while (scanner.hasNext()){
            int x = scanner.nextInt();
            numbers.add(x);
        }
        scanner.close();
        return numbers;
    }
}

