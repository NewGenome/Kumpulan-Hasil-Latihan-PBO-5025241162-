public class BungaMatahari extends Tumbuhan {

    public BungaMatahari(String name) {
        super(name);
    }

    @Override
    public void grow() {
        System.out.println(getName() + " tumbuh dengan mengikuti arah sinar matahari untuk memperoleh energi maksimal.");
    }

    @Override
    public void fotosintesis() {
        System.out.println(getName() + " melakukan fotosintesis sambil mengikuti pergerakan matahari.");
    }
}
