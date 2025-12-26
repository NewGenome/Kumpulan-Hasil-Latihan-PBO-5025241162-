import java.sql.*;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args) {
        try {
            conn = Config.configDB();
            stmt = conn.createStatement();

            while (!conn.isClosed()) {
                showMenu();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void showMenu() {
        System.out.println("\n========= MENU PERPUSTAKAAN =========");
        System.out.println("1. Lihat Daftar Buku");
        System.out.println("2. Tambah Buku");
        System.out.println("3. Edit Buku");
        System.out.println("4. Hapus Buku");
        System.out.println("0. Keluar");
        System.out.print("Pilih> ");

        int selectedMenu = input.nextInt();
        input.nextLine(); 

        switch (selectedMenu) {
            case 1 -> showData();
            case 2 -> insertData();
            case 3 -> updateData();
            case 4 -> deleteData();
            case 0 -> System.exit(0);
            default -> System.out.println("Pilihan salah!");
        }
    }

    static void showData() {
        String sql = "SELECT * FROM buku";
        try {
            rs = stmt.executeQuery(sql);
            System.out.println("\n+--------------------------------+");
            System.out.println("| DATA BUKU PERPUSTAKAAN        |");
            System.out.println("+--------------------------------+");
            while (rs.next()) {
                System.out.printf("%d. %s (%s)\n", rs.getInt("id_buku"), rs.getString("judul"), rs.getString("pengarang"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void insertData() {
        try {
            System.out.print("Judul Buku: ");
            String judul = input.nextLine();
            System.out.print("Pengarang: ");
            String pengarang = input.nextLine();

            String sql = "INSERT INTO buku (judul, pengarang) VALUE('%s', '%s')";
            sql = String.format(sql, judul, pengarang);

            stmt.execute(sql);
            System.out.println("Buku berhasil ditambahkan!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void updateData() {
        try {
            System.out.print("ID Buku yang akan diedit: ");
            int idBuku = input.nextInt();
            input.nextLine();
            System.out.print("Judul Baru: ");
            String judul = input.nextLine();
            System.out.print("Pengarang Baru: ");
            String pengarang = input.nextLine();

            String sql = "UPDATE buku SET judul='%s', pengarang='%s' WHERE id_buku=%d";
            sql = String.format(sql, judul, pengarang, idBuku);

            stmt.execute(sql);
            System.out.println("Data berhasil diperbarui!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void deleteData() {
        try {
            System.out.print("ID Buku yang akan dihapus: ");
            int idBuku = input.nextInt();

            String sql = String.format("DELETE FROM buku WHERE id_buku=%d", idBuku);
            stmt.execute(sql);
            
            System.out.println("Buku telah dihapus!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}