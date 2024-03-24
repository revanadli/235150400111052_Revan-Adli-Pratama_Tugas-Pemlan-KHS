import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        KHS khs = new KHS();

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1) + ":");
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            khs.tambahMahasiswa(new mahasiswa(nim, nama));
        }

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i+1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            String namaMatkul = input.nextLine();
            System.out.print("Kode: ");
            String kode = input.nextLine();
            System.out.print("Nilai Angka: ");
            int nilaiAngka = input.nextInt();
            input.nextLine();
            System.out.print("NIM Mahasiswa: ");
            String nimMhs = input.nextLine();
            khs.tambahNilai(new matkul(kode, namaMatkul, nilaiAngka, nimMhs));
        }

        System.out.print("Masukkan NIM mahasiswa untuk mencetak KHS: ");
        String nimCetak = input.nextLine();
        khs.cetakKHS(nimCetak);

        input.close();
    }
}
