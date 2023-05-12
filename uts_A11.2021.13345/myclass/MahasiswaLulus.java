package myclass;

public class MahasiswaLulus extends Mahasiswa{
    
    // properti
    public int tahunWisuda;
    public float ipk;
    public boolean ikutWisuda;

    public MahasiswaLulus(String nama, int nim, int semester, int usia, String krs, int tahunWisuda, float ipk, boolean ikutWisuda) {
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs;
        this.tahunWisuda = tahunWisuda ;
        this.ipk = ipk;
        this.ikutWisuda = ikutWisuda;
        
    }

    public void ikutWisuda(){
        this.ikutWisuda = true;
        System.out.println("Mahasiswa Lulus dengan Nim " + this.nim + " Mengikuti Wisuda \n");

    }

    public boolean getikutWisuda(){
        return this.ikutWisuda;
    }

    public boolean TidakikutWisuda() {
        return !this.ikutWisuda;
    }

    public void infoMahasiswaLulus() {
        System.out.println("=== Mahasiswa Lulus ===");
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + this.nama);
        System.out.println("Semester: " + this.semester);
        System.out.println("Usia: " + this.usia);
        System.out.println("KRS: " + this.krs);
        System.out.println("Status Wisuda: " + this.ikutWisuda);
        System.out.println("Tahun Wisuda: " + this.tahunWisuda);
        System.out.println("IPK: " + this.ipk + "\n");
    }

}
