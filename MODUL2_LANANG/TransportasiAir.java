public class TransportasiAir {
    
    protected int jumlahKursi;
    protected int biaya;

    public TransportasiAir(int jumlahKursi,int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    void informasi(int jumlahKursi, int biaya){
        System.out.println("Transportasi Air jenis tidak diketahui dengan kursi berjumlah "+jumlahKursi+" ditetapkan dengan biaya ssebesar Rp. "+biaya);
    }
    void berlayar(){
    System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar");
    }
    void berlabuh(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahuhi berlabuh di pantai");
    }
}
