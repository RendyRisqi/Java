package myclass;

public class MahasiswaTransfer extends MahasiswaBaru {
    public String universitasAsal;

    public MahasiswaTransfer(String nama, int nim, int semester, int usia, String krs, String universitasAsal, boolean ikutOspek) {
        super(nama, nim, semester, usia, krs, null, ikutOspek);

        this.universitasAsal = universitasAsal;
    }

    public void ikutiOspek() {
        this.ikutOspek = false;
        System.out.println("Mahasiswa transfer dengan NIM :" + this.nim + " belum ikut ospek \n");
    }

    public boolean getSudahIkutOspek() {
        return this.ikutOspek;
    }

    public boolean belumIkutOspek() {
        return !this.ikutOspek;
    }

    public void infoMahasiswaTransfer() {
        System.out.println("=== Mahasiswa Transfer ===");
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + this.nama);
        System.out.println("Semester: " + this.semester);
        System.out.println("Usia: " + this.usia);
        System.out.println("KRS: " + this.krs);
        System.out.println("Universitas Asal: " + this.universitasAsal);
        System.out.println("Status OSPEK : " + this.ikutOspek + "\n");
    }
}