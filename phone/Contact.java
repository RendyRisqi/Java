package phone;

public class Contact {
    String nama;
    String nomor;

    public Contact(String nama, String nomor) {
        this.nama = nama;
        this.nomor = nomor;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNomor() {
        return this.nomor;
    }
}
