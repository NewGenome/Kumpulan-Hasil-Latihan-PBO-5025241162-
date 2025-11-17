public class Programmer extends Manusia {

    public Programmer(String name) {
        super(name);
    }

    @Override
    public void grow() {
        System.out.println(getName() + " berkembang dengan mempelajari bahasa pemrograman baru dan meningkatkan kemampuan logika.");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " menjelaskan konsep pemrograman C++.");
    }
}
