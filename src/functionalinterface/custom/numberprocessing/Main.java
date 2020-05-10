package functionalinterface.custom.numberprocessing;

public class Main {

    public static void main(String[] args) {
        printDividedTo2Numbers(new int[]{2, 3, 7, 10, 17, 24, 66, 5, 18}, integer -> integer / 2.0);
    }

    private static void printDividedTo2Numbers(int[] numbers, NumberProcessorFunction function) {
        for (int number : numbers) {
            System.out.println(function.process(number));
        }
    }
}
