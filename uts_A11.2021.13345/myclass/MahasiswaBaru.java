package myclass;


public class MahasiswaBaru extends Mahasiswa{
    // property
    public String AsalaSekolah = "Tidak ada asal sekolah" ;
    public boolean ikutOspek = false ;


    public MahasiswaBaru(String nama, int nim, int semester, int usia, String krs, String AsalSekolah, boolean ikutOspek) {
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs;
        this.AsalaSekolah = AsalSekolah ;
        this.ikutOspek = ikutOspek;
      }

    public void ikutOspek(){
        this.ikutOspek = true;
        System.out.println("Mahasiswa baru dengan Nim : " + this.nim + " sudah ikut ospek \n");

    }

    public boolean getikutOspek(){
        return this.ikutOspek;
    }

    public boolean belumikutOspek() {
        return !this.ikutOspek;
    }

    public void infoMahasiswaBaru() {
        System.out.println("=== Mahasiswa Baru ===");
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + this.nama);
        System.out.println("Semester: " + this.semester);
        System.out.println("Usia: " + this.usia);
        System.out.println("KRS: " + this.krs);
        System.out.println("Asal Sekolah" + this.AsalaSekolah);
        System.out.println("Status OSPEK: " + this.ikutOspek );
      }


}