import java.util.ArrayList;

public class KHS {
    ArrayList<mahasiswa> daftarMahasiswa = new ArrayList<>();
    ArrayList<matkul> daftarNilai = new ArrayList<>();

    public void tambahMahasiswa(mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public void tambahNilai(matkul mataKuliah) {
        daftarNilai.add(mataKuliah);
    }

    public void cetakKHS(String NIM) {
        boolean mhsDitemukan = false;

        for (mahasiswa mhs : daftarMahasiswa) {
            if (mhs.NIM.equals(NIM)) {
                System.out.println("===================================================================");
                System.out.printf("| Mahasiswa NIM: %-48s|\n", mhs.NIM);
                System.out.printf("| Nama: %-57s|\n", mhs.nama);
                System.out.println("|=================================================================|");
                System.out.println("| Mata Kuliah\t\t| Kode\t\t| Nilai Angka\t| Nilai Huruf\t|");
                System.out.println("|-----------------------------------------------------------------|");

                for (matkul mk : daftarNilai) {
                    if (mk.NIM.equals(NIM)) {
                        System.out.printf("| %-20s| %-12s| %-13d| %-12s|\n", mk.namaMatkul, mk.kode, mk.nilaiAngka, mk.getNilaiHuruf());
                    }
                }
                System.out.println("===================================================================");
                mhsDitemukan = true;
                break;
            }
        }
        if (!mhsDitemukan) {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }
    }
}
