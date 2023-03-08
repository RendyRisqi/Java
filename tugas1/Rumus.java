
public class Rumus{

    

    // keliling lingkaran
    public void Keliling_lingkaran() {
        int r;
        double p,hsl;

        p = 3.14;
        r = 10;
        
        hsl = p*r;

        System.out.println("Luas lingkaran adalah = " + hsl + "\n");

    }

    // Luas Segitiga

    public void Luas_segitiga() {

        int alas,tinggi;
        double luas_segitiga ;

        alas = 6;
        tinggi = 4;

        luas_segitiga = 0.5*alas*tinggi;

        System.out.println("Luas Segitiga Siku-Siku adalah = " + luas_segitiga + "\n");
        
    }


    public void volume_tabung() {
        double p,d,hsl;
        int t;

        p = 3.14;
        d = 2.5;
        t = 10;

        hsl = p*d*d*t;

        System.out.println("volume tabung adalah = "+ hsl + "\n");





        
    }


    
}
