public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar) {
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    void informasi(int jumlahKursi, int biaya){
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah "+jumlahKursi+" ditetapkan dengan biaya sebesar Rp. "+biaya);
    }
    void berlayar(int layar){
        System.out.println("Transportasi Air dengan jenis Sampan sedang berlayar menggunakan "+layar+" layar");
    }
    void berlabuh(){
        System.out.println("Transportasi Air dengan jenis Sampan berlabuh di pantai tanpa jangkar");
    }
    void berlabuh(int jangkar){
        System.out.println("Transportasi Air dengan jenis Sampan berlabuh di pantai dengan menggunakan "+jangkar+" buah jangkar");
    }

}
