package ocpexample.cat;

import java.util.ArrayList;
import java.util.List;

public final class CatProducer {
    private static List<Cat> cats = new ArrayList<>();

    private CatProducer() {
        // do nothing
    }

    public static void produce() {
        // Put two classes in the same file
        final BengalCat bengalCat = new BengalCat("Buba");
        final EgyptianMauCat egyptianMauCat = new EgyptianMauCat("Anubis");
        cats.add(bengalCat);
        cats.add(egyptianMauCat);
    }

    public static void print() {
        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }
    }
}
