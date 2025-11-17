public abstract class MakhlukHidup {

    private String name;

    public MakhlukHidup(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void bernapas() {
        System.out.println(name + " sedang bernapas.");
    }

    public abstract void grow();
}
