package myclass;

public class Mahasiswa {
  public String nama;
  public int nim;
  public int semester;
  public int usia ; 
  public String krs;
  
  public void infoMahasiswa() {
    System.out.println("=====Mahasiswa======");
    System.out.println("NIM: " + this.nim);
    System.out.println("Nama: " + this.nama);
    System.out.println("Semester: " + this.semester);
    System.out.println("Usia: " + this.usia);
    System.out.println("KRS: " + this.krs + "\n");
  }
}
