public class Mahasiswa {
    private String nama;
    private String nrp;
    private MataKuliah mataKuliah;

    public Mahasiswa(String nama, String nrp) {
        this.nama = nama;
        this.nrp = nrp;
    }

    public void ambilMataKuliah(MataKuliah mk) {
        this.mataKuliah = mk;
    }

    @Override
    public String toString() {
        return "Nama: " + nama +
               "\nNRP: " + nrp +
               "\nMata Kuliah: " + (mataKuliah != null ? mataKuliah : "Belum ambil MK");
    }
}
