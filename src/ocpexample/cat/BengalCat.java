package ocpexample.cat;

public class BengalCat implements Cat {
    private final String name;

    public BengalCat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class EgyptianMauCat implements Cat {
    private final String name;

    public EgyptianMauCat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
