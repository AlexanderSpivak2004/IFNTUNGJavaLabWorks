package laboratory_work11;

public class User {

    @MandatoryField
    private String name;
    @MandatoryField
    private int age;

    public User() {}

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @SafeVarargs
    public final <T> void printElements(T... elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}