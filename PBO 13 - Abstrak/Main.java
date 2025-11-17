public class Main {
    public static void main(String[] args) {

        Programmer p = new Programmer("Felix - Programmer");
        Arsitek a = new Arsitek("Andi - Arsitek");
        Kucing k = new Kucing("Kucing Angora");
        IkanPaus ip = new IkanPaus("Paus");
        BungaMatahari b = new BungaMatahari("Bunga Matahari");
        PohonKelapa pk = new PohonKelapa("Pohon Kelapa");

        System.out.println("=== Manusia ===");
        p.bernapas();
        p.grow();
        p.speak();

        System.out.println();
        a.bernapas();
        a.grow();
        a.speak();

        System.out.println("\n=== Hewan ===");
        k.bernapas();
        k.grow();
        k.move();

        System.out.println();
        ip.bernapas();
        ip.grow();
        ip.move();

        System.out.println("\n=== Tumbuhan ===");
        b.bernapas();
        b.grow();
        b.fotosintesis();

        System.out.println();
        pk.bernapas();
        pk.grow();
        pk.fotosintesis();
    }
}
