public class PohonKelapa extends Tumbuhan {

    public PohonKelapa(String name) {
        super(name);
    }

    @Override
    public void grow() {
        System.out.println(getName() + " tumbuh tinggi dengan akar yang kuat di daerah tropis.");
    }

    @Override
    public void fotosintesis() {
        System.out.println(getName() + " melakukan fotosintesis untuk mendukung pertumbuhan batang dan daunnya.");
    }
}
