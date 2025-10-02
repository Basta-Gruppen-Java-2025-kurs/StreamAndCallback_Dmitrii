public class Person implements Comparable<Person> {
    public String name;
    public int age;
    Person(String n, int a) {
        name = n;
        age = a;
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(age, person.age);
    }
}
