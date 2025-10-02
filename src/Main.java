import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static boolean isOdd(Integer x) {
        return (x & 1) == 1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> tal = new ArrayList<>();
        for(int i=0; i<100; i++) tal.add(i);
        tal.stream().filter(Main::isOdd).map(i -> i+5).forEach(System.out::println);

        //Persons
        ArrayList<Person> ppl = new ArrayList<>();
        ppl.add(new Person("Jack", 10));
        ppl.add(new Person("Joe", 3));
        ppl.add(new Person("Gilly", 20));
        ppl.add(new Person("Ho", 19));
        ppl.add(new Person("Bo", 18));
        ppl.add(new Person("Marcus", 15));
        ppl.add(new Person("Cassius", 5));
        ppl.add(new Person("Docktor", 50));
        ppl.stream().filter(p -> p.age<=18).sorted().map(p->p.name).forEach(System.out::println);

        ArrayList<Double> prices = new ArrayList<>();
        Random rnd = new Random();
        for (int i=0; i<10; i++) {
            prices.add(rnd.nextDouble(100));
        }
        System.out.println("Prices:");
        prices.forEach(System.out::println);
        System.out.println("Total: " + prices.stream().reduce(Double::sum));
        System.out.println("Max: " + prices.stream().reduce(Double::max));
    }
}
