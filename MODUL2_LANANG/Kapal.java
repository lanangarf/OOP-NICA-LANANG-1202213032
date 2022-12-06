public class Kapal extends TransportasiAir {
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin) {
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }
    void informasi(int jumlahKursi, int biaya){
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah "+jumlahKursi+" ditetapkan dengan biaya ssebesar Rp. "+biaya);
    }
    void berlayar(String mesin){
        System.out.println("Transportasi Air dengan jenis Sampan sedang berlayar menggunakan mesin "+mesin+" dengan kecepatan tidak stabil");
    }
    void berlayar(String mesin, int kecepatan){
        System.out.println("Transportasi Air dengan jenis Sampan sedang berlayar menggunakan mesin "+mesin+" dengan stabil di kisanaran "+kecepatan+" knot");
    }
    void berlabuh(){
        System.out.println("Transportasi Air dengan jenis Sampan berlabuh di pantai tanpa jangkar");}
    
}
