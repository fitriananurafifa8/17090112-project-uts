import java.util.LinkedList;
import java.util.Scanner;
import model.*;
import service.*;

public class Aplikasi {

    private static Scanner scanner;
    private static BukuPerpusService service;

    public static void main(String args[]) {
        int opsi = 0;
        scanner = new Scanner(System.in);
        service = new BukuPerpusService();

        do {
            cetakMenu();
            opsi = scanner.nextInt();
            switch(opsi) {
                case 1 :
                  modulAdd();
                  break;
                case 2 :
                  ubahData(); break;
                case 3 :
                  hapusData(); break;
                case 4 :
                  tampilData();
                  break;
            }
        } while(opsi != 0);

    }

    private static void cetakMenu() {
        System.out.println("\n\n");
        System.out.println(" ***APLIKASI DATA BUKU PERPUSTAKAAN*** ");
        System.out.println(" 1. Tambah Data                   ");
        System.out.println(" 2. Ubah Data                     ");
        System.out.println(" 3. Hapus Data                    ");
        System.out.println(" 4. Tampilkan data                ");

        System.out.println(" 0. Keluar                        ");

        System.out.println("\n");
        System.out.print(" Pilihan > ");
    }

    private static void modulAdd() {
        String kdBuku, jdlBuku, nmPengarang, penerbit, thnTerbit;
    
        System.out.println(" ** Tambah Data ** ");

        System.out.print(" Kode Buku       : ");
        scanner = new Scanner(System.in);
        kdBuku = scanner.nextLine();
        System.out.print(" Judul Buku      : ");
        jdlBuku = scanner.nextLine();
        System.out.print(" Nama Pengarang  : ");
        nmPengarang = scanner.nextLine();
        System.out.print(" Penerbit        : ");
        penerbit = scanner.nextLine();
        System.out.print(" Tahun Terbit    : ");
        thnTerbit = scanner.nextLine();

        service.addData(new Buku(kdBuku, jdlBuku, nmPengarang, penerbit, thnTerbit));
        System.out.println("|------------------------------------------------");
    }

    private static void tampilData() {
        LinkedList<Buku> result = (LinkedList<Buku>) service.getAllData();

        int i=1;
        for(Buku bukuperpus : result) {
            
            System.out.println(" ** Tampil Data ** ");

            System.out.println(" Data ke-" + i++);
            System.out.println(" Kode Buku: " + bukuperpus.getKdBuku());
            System.out.println(" Judul Buku: " + bukuperpus.getJdlBuku());
            System.out.println(" Nama Pengarang: " + bukuperpus.getNmPengarang());
            System.out.println(" Penerbit: " + bukuperpus.getPenerbit());
            System.out.println(" Tahun Terbit: " + bukuperpus.getThnTerbit());
            System.out.println("|-----------------------------------------------");
        }
    }

    private static void ubahData() {
        String kdBuku, jdlBuku, nmPengarang, penerbit, thnTerbit;

        System.out.println(" ** Pengubahan Data ** ");

        System.out.print(" Kode Buku       : ");
        scanner = new Scanner(System.in);
        kdBuku = scanner.nextLine();
        System.out.print(" Judul Buku      : ");
        jdlBuku = scanner.nextLine();
        System.out.print(" Nama Pengarang  : ");
        nmPengarang = scanner.nextLine();
        System.out.print(" Penerbit        : ");
        penerbit = scanner.nextLine();
        System.out.print(" Tahun Terbit    : ");
        thnTerbit = scanner.nextLine();

        service.updateData(new Buku(kdBuku, jdlBuku, nmPengarang, penerbit, thnTerbit));
        System.out.println("|------------------------------------------------");
    }

    private static void hapusData() {
        String kdBuku;

        System.out.println(" ** Hapus Data ** ");

        System.out.print(" Kode Buku       : ");
        scanner = new Scanner(System.in);
        kdBuku = scanner.nextLine();

        service.deleteData(new Buku(kdBuku, null, null, null, null));
        System.out.println("|-----------------------------------------------");
    }

}