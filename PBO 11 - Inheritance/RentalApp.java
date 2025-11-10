import java.util.ArrayList;

public class RentalApp {
    public static void main(String[] args) {
        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<Kendaraan>();
        ArrayList<Penyewa> daftarPenyewa = new ArrayList<Penyewa>();
        
        daftarKendaraan.add(new Mobil("Toyota", "Avanza", 2020, 4));
        daftarKendaraan.add(new Motor("Honda", "Vario", 2021, 2));
        daftarKendaraan.add(new Sepeda("Polygon", "Strattos", 2019, "Balap"));
        daftarKendaraan.add(new Motor("Kawasaki", "ZX-10R", 2021, 2));

        
        daftarPenyewa.add(new Penyewa("Mia", daftarKendaraan.get(0)));
        daftarPenyewa.add(new Penyewa("Felix", daftarKendaraan.get(1)));
        daftarPenyewa.add(new Penyewa("Antonio", daftarKendaraan.get(2)));
        
        System.out.println("=== List Kendaraan Tersedia ===");
        for (Kendaraan k : daftarKendaraan) {
            k.displayInfo();
        }

        System.out.println("=== List Penyewa ===");
        for (Penyewa p : daftarPenyewa) {
            p.displayInfo();
            System.out.println("-----------------------------");
        }
    }
}
