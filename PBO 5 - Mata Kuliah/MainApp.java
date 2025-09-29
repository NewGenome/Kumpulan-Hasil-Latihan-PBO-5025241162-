import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input mahasiswa
        System.out.print("Masukkan nama mahasiswa: ");
        String namaMhs = sc.nextLine();
        System.out.print("Masukkan NRP mahasiswa: ");
        String nrp = sc.nextLine();
        Mahasiswa m1 = new Mahasiswa(namaMhs, nrp);

        // Pilih mata kuliah
        System.out.println("\nPilih mata kuliah:");
        System.out.println("1. Pemrograman Berbasis Objek");
        System.out.println("2. Otomata");
        System.out.println("3. Pemrograman Web");
        System.out.println("4. Teori Graf");
        System.out.println("5. Matematika Diskrit");
        System.out.print("Pilihan (1-5): ");
        int pilihan = sc.nextInt();
        sc.nextLine(); 

        String kode = "";
        String namaMk = "";
        Dosen dosen = null;

        switch (pilihan) {
            case 1:
                kode = "MK101"; namaMk = "Pemrograman Berbasis Objek";
                System.out.println("\nPilih Dosen:");
                System.out.println("1. Fajar Baskoro (NIP: FB00)");
                System.out.println("2. Rully Soelaiman (NIP: RS11)");
                System.out.print("Pilihan: ");
                int d1 = sc.nextInt();
                dosen = (d1 == 1) ? new Dosen("Fajar Baskoro", "FB00") : new Dosen("Rully Soelaiman", "RS11");
                break;
            case 2:
                kode = "MK102"; namaMk = "Otomata";
                System.out.println("\nPilih Dosen:");
                System.out.println("1. Viktor Hariadi (NIP: VH01)");
                System.out.println("2. Arya Yudhi Wajaya (NIP: AW02)");
                System.out.print("Pilihan: ");
                int d2 = sc.nextInt();
                dosen = (d2 == 1) ? new Dosen("Viktor Hariadi", "VH01") : new Dosen("Arya Yudhi Wijaya", "AW02");
                break;
            case 3:
                kode = "MK103"; namaMk = "Pemrograman Web";
                System.out.println("\nPilih Dosen:");
                System.out.println("1. Fajar Baskoro (NIP: FB02)");
                System.out.println("2. Irfan Subakti (NIP: IS01)");
                System.out.print("Pilihan: ");
                int d3 = sc.nextInt();
                dosen = (d3 == 1) ? new Dosen("Fajar Baskoro", "FB02") : new Dosen("Irfan Subakti", "IS01");
                break;
            case 4:
                kode = "MK104"; namaMk = "Teori Graf";
                System.out.println("\nPilih Dosen:");
                System.out.println("1. Viktor Hariadi (NIP: VH00)");
                System.out.println("2. Arya Yudhi Wijaya (NIP: AW01)");
                System.out.print("Pilihan: ");
                int d4 = sc.nextInt();
                dosen = (d4 == 1) ? new Dosen("Viktor Hariadi", "VH00") : new Dosen("Arya Yudhi Wijaya", "AW01");
                break;
            case 5:
                kode = "MK105"; namaMk = "Matematika Diskrit";
                System.out.println("\nPilih Dosen:");
                System.out.println("1. Muhammad Hilmil Muchtar Aditya Pradana (NIP: HM01)");
                System.out.println("2. Ilham Gurat Adilion (NIP: IG10)");
                System.out.print("Pilihan: ");
                int d5 = sc.nextInt();
                dosen = (d5 == 1) ? new Dosen("Muhammad Hilmil Muchtar Aditya Pradana", "HM01") : new Dosen("Ilham Gurat Adilion", "IG10");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }

        MataKuliah mk = new MataKuliah(kode, namaMk, dosen);

        // Mahasiswa ambil MK
        m1.ambilMataKuliah(mk);

        // Output hasil
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println(m1);

        sc.close();
    }
}
