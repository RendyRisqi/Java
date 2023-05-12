package program;
import myclass.Mahasiswa;
import myclass.MahasiswaAktif;
import myclass.MahasiswaBaru;
import myclass.MahasiswaLulus;
import myclass.MahasiswaTransfer;

public class Aksi {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Rudi";
        mhs.nim = 123;
        mhs.semester = 4;
        mhs.usia = 20;
        mhs.krs = "PPL, Data Mining, PBO, Struktur Data, Kalkulus";
        mhs.infoMahasiswa();

        MahasiswaBaru mhsBaru = new MahasiswaBaru("Ani", 456, 1, 18, "Struktur Data , RPL, Otomata, Kecerdasan Buatan", " SMA  Negeri 1 Semarang ", true );
        mhsBaru.infoMahasiswaBaru();
        mhsBaru.ikutOspek();
       

        MahasiswaTransfer mhsTransfer = new MahasiswaTransfer("Budi", 789, 3, 21, "Sistem Operasi, Mattrik & vektor, Basisdata,RPLL", "Universitas Gajah Mada", false);
        mhsTransfer.infoMahasiswaTransfer();
        mhsTransfer.ikutiOspek();
       

        MahasiswaLulus mhsLulus = new MahasiswaLulus("Caca", 246, 8, 25, "PBO, Struktur Data, Sistem Operasi, Data Mining, Kalkulus, Matrik & Vektor, Probabilitas", 2022, 3.8f, true);
        mhsLulus.infoMahasiswaLulus();
        mhsLulus.ikutWisuda();
       

        MahasiswaAktif mhsAktif = new MahasiswaAktif("cindy",265,4,19,"data mining, kecerdasan buatan, probabilitas, kalkulus, PBO, PPL");
        mhsAktif.infoMahasiswaAktif();
        
    }
}
