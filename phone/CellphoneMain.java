package phone;

public class CellphoneMain {
    public static void main(String[] args) {
        Cellphone cp = new Cellphone("Nokia", "3310");

        cp.addContact("John", "12345");
        cp.addContact("Jane", "67890");

        cp.viewAllContacts();

        cp.searchContact("John");
        cp.searchContact("Alice");
    }
}


// public class CellphoneMain {
//     public static void main(String[] args) {
//         Cellphone cp = new Cellphone("Nokia", "3310");
//         cp.powerOn();
//         cp.volumeUp();
//         int volume = cp.getVolume();
//         System.out.println("Volume: " + volume);
//     }
// }
