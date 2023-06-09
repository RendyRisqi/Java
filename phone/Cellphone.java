package phone;
import phone.Phone;

import java.lang.Math;

import java.util.ArrayList;
import java.util.List;

public class Cellphone implements Phone{
    // Kode lainnya...

    private List<Contact> contacts; // Daftar kontak

    public Cellphone(String merk, String type) {
        // Kode konstruktor lainnya...
        contacts = new ArrayList<>();
    }

    public void addContact(String nama, String nomor) {
        Contact newContact = new Contact(nama, nomor);
        contacts.add(newContact);
        System.out.println("Kontak berhasil ditambahkan.");
    }

    public void viewAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Tidak ada kontak.");
        } else {
            System.out.println("Daftar Kontak:");
            for (Contact contact : contacts) {
                System.out.println("Nama: " + contact.getNama() + ", Nomor: " + contact.getNomor());
            }
        }
    }

    public void searchContact(String nama) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getNama().equalsIgnoreCase(nama)) {
                System.out.println("Kontak ditemukan:");
                System.out.println("Nama: " + contact.getNama() + ", Nomor: " + contact.getNomor());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Kontak dengan nama " + nama + " tidak ditemukan.");
        }
    }

    // Kode lainnya...
}



// public class Cellphone implements Phone {
//     // Kode lainnya...

//     public void volumeUp() {
//         if (this.status == 0) {
//             System.out.println("Ponsel mati. Tidak dapat menaikkan volume.");
//         } else {
//             this.volume++;
//             if (this.volume >= MAX_VOLUME) {
//                 this.volume = MAX_VOLUME;
//             }
//         }
//     }

//     public void volumeDown() {
//         if (this.status == 0) {
//             System.out.println("Ponsel mati. Tidak dapat menurunkan volume.");
//         } else {
//             this.volume--;
//             if (this.volume <= MIN_VOLUME) {
//                 this.volume = MIN_VOLUME;
//             }
//         }
//     }

//     public int getVolume() {
//         if (this.status == 0) {
//             System.out.println("Ponsel mati. Tidak dapat melihat volume.");
//             return -1;
//         } else {
//             return this.volume;
//         }
//     }

//     public void topUpPulsa(int amount) {
//         // Logika untuk menambahkan pulsa ke ponsel
//         System.out.println("Top up pulsa sebesar " + amount + " berhasil dilakukan.");
//     }

//     public int getSisaPulsa() {
//         // Logika untuk menghitung sisa pulsa
//         return 50000; // Contoh nilai sisa pulsa
//     }

//     // Kode lainnya...
// }


// public class Cellphone implements Phone {
//     String merk;
//     String type;
//     int batteryLevel;
//     int status;
//     int volume;

//     public Cellphone(String merk, String type) {
//         this.merk = merk;
//         this.type = type;
//         this.batteryLevel = (int)(Math.random() * (100 - 0 + 1) + 0);  
//     }

//     public void powerOn() {
//         this.status = 1;
//         System.out.println("Ponsel menyala");
//     }
    
//     public void powerOff() {
//         this.status = 0;
//         System.out.println("Ponsel mati");
//     }

//     public void volumeUp() {
//         if (this.status == 0) {
//             System.out.println("Ponsel mati. Tidak dapat menaikkan volume");
//         } else {
//             this.volume++;
//             if (this.volume >= 100) {
//                 this.volume = 100;
//             }
//         }
//     }

//     public void volumeDown() {
//         this.volume--;
//     }

//     public int getVolume() {
//         return this.volume;
//     }
// }
