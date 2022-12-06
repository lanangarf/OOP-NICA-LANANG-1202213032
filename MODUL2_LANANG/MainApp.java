public class MainApp {
    public static void main(String[] args) {
        TransportasiAir transportasiAir = new TransportasiAir(4, 20000);
        transportasiAir.informasi(4, 20000);
        System.out.println("");

        Sampan sampan = new Sampan(20, 50000, 2);
        sampan.informasi(20, 50000);
        sampan.berlayar(2);
        sampan.berlabuh();
        sampan.berlabuh(2);
        System.out.println("");

        Kapal kapal = new Kapal(50, 100000, "Diesel");
        kapal.informasi(50, 100000);
        kapal.berlayar("Diesel");
        kapal.berlayar("Diesel", 20);
        kapal.berlabuh();
        System.out.println("");

    }
}
