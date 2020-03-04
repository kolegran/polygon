package ocpexample.main;

public class MainKindTester {
    // correct
    public static void main(String[] args) {
    }

    // correct
    public static void main(String[] options) {
    }

    // correct
    public static void main(String args[]) {
    }

    // correct
    public static void main(String... args) {
    }

    // wrong
    public void main(String[] args) {
    }

    // wrong
    public static void main() {
    }

    // wrong
    public static int main(String[] args) {
        return 0;
    }

    // wrong
    public static String main(String[] args) {
        return "";
    }

    // wrong
    public static void main(String[] args, int number) {
    }

    // wrong
    public void main(String[] args, double number) {
    }

    // wrong
    public double main(String[] args, char c) {
        return 0.0;
    }
}
