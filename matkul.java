public class matkul {
    String kode;
    String namaMatkul;
    int nilaiAngka;
    String NIM;

    matkul(String kode, String namaMatkul, int nilaiAngka, String NIM){
        this.kode = kode;
        this.namaMatkul = namaMatkul;
        this.nilaiAngka = nilaiAngka;
        this.NIM = NIM;
    }

    String getNilaiHuruf(){
        if (nilaiAngka >= 80 && nilaiAngka <= 100){
            return "A";
        } else if (nilaiAngka >= 70 && nilaiAngka < 80){
            return "B";
        } else if (nilaiAngka >= 60 && nilaiAngka < 70){
            return "C";
        } else if (nilaiAngka >= 50 && nilaiAngka < 60){
            return "D";
        } else {
            return "E";
        }
    }

}
