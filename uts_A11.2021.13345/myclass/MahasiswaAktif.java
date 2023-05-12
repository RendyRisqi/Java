package myclass;

public class MahasiswaAktif extends Mahasiswa{
   

    public MahasiswaAktif(String nama, int nim, int semester, int usia, String krs){
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs;
    }

    public void infoMahasiswaAktif() {
        System.out.println("=== Mahasiswa Aktif ===");
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + this.nama);
        System.out.println("Semester: " + this.semester);
        System.out.println("Usia: " + this.usia);
        System.out.println("KRS: " + this.krs);
        System.out.println("\n ================================================================== \n");
      }
    


}