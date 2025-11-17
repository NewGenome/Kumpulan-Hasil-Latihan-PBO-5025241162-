public class Kucing extends Hewan {

    public Kucing(String name) {
        super(name);
    }

    @Override
    public void grow() {
        System.out.println(getName() + " tumbuh dengan makan daging dan aktif beraktivitas.");
    }

    @Override
    public void move() {
        System.out.println(getName() + "  bergerak lincah dengan 4 kaki.");
    }
}
