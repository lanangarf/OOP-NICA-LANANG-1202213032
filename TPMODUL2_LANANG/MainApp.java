public class MainApp {

    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Esia", 64, 144);
        System.out.println("");
        perangkat.informasi();
        System.out.println("");

        Laptop laptop = new Laptop("Nokia", 64, (float)8.2,true);
        laptop.informasi();
        laptop.bukaGame("Valorant");
        laptop.kirimEmail("ariefqyan@gmail.com");
        laptop.kirimEmail("lanang@gmail.com", "ariefr@gmail.com");
        System.out.println("");

        Handphone handphone = new Handphone("Bionic 14", 64, 12,false);
        handphone.informasi();
        handphone.telfon((int)8122122);
        handphone.kirimSMS(852112);
        handphone.kirimSMS(12121212,29292211);
        System.out.println("");        
    
    }
}
