public class IkanPaus extends Hewan {

    public IkanPaus(String name) {
        super(name);
    }

    @Override
    public void grow() {
        System.out.println(getName() + " tumbuh dengan memakan plankton dan beradaptasi di lautan dalam.");
    }

    @Override
    public void move() {
        System.out.println(getName() + "  berenang perlahan namun kuat melintasi samudra.");
    }
}
