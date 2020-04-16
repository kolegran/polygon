package staticblockproblem;

public class Application {
    public static void main(String[] args) {
        new User();
    }

    private static class User {
        static {
            final User user = new User();
            System.out.println(user.getCity().getName());
        }

        private City city;

        public City getCity() {
            return city;
        }

        public void setCity(City city) {
            this.city = city;
        }
    }

    private static class City {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
