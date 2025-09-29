public class MataKuliah {
    private String kode;
    private String nama;
    private Dosen dosen;

    public MataKuliah(String kode, String nama, Dosen dosen) {
        this.kode = kode;
        this.nama = nama;
        this.dosen = dosen;
    }

    @Override
    public String toString() {
        return nama + " (" + kode + ") - " + dosen;
    }
}
