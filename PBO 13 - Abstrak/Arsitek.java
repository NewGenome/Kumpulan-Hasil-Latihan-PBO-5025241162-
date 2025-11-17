public class Arsitek extends Manusia {

    public Arsitek(String name) {
        super(name);
    }

    @Override
    public void grow() {
        System.out.println(getName() + " berkembang dengan mempelajari desain baru dan meningkatkan kreativitas arsitektural.");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " menunjukkan sebuah rancangan bangunan.");
    }
}
