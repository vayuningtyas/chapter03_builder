public class PaketMakanan {

    private String nasi, lauk, sayur, minuman;

    public PaketMakanan() {
    }

    public String getNasi() {
        return nasi;
    }

    public void setNasi(String nasi) {
        this.nasi = nasi;
    }

    public String getLauk() {
        return lauk;
    }

    public void setLauk(String lauk) {
        this.lauk = lauk;
    }

    public String getSayur() {
        return sayur;
    }

    public void setSayur(String sayur) {
        this.sayur = sayur;
    }

    public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String minuman) {
        this.minuman = minuman;
    }

    @Override
    public String toString() {
        return "Paket Makanan"
                + "\n---------------"
                + "\nNasi: " + getNasi()
                + "\nLauk: " + getLauk()
                + "\nSayur: " + getSayur()
                + "\nMinuman: " + getMinuman();
    }

}

class PaketMakananBuilder {

    private PaketMakanan paketMakanan;

    public PaketMakananBuilder() {
        this(new PaketMakanan());
    }

    public PaketMakananBuilder(PaketMakanan paketMakanan) {
        this.paketMakanan = paketMakanan;
    }

    public PaketMakananBuilder nasi(String nasi) {
        paketMakanan.setNasi(nasi);
        return this;
    }

    public PaketMakananBuilder lauk(String lauk) {
        paketMakanan.setLauk(lauk);
        return this;
    }

    public PaketMakananBuilder sayur(String sayur) {
        paketMakanan.setSayur(sayur);
        return this;
    }

    public PaketMakananBuilder minuman(String minuman) {
        paketMakanan.setMinuman(minuman);
        return this;
    }

    public PaketMakanan getResult() {
        return paketMakanan;
    }

}

class PaketMakananDirector {

    // Declare Singleton
    private static PaketMakananDirector director = null;

    private PaketMakananDirector() {}

    public static synchronized PaketMakananDirector getInstance() {
        if (director == null) {
            director = new PaketMakananDirector();
        }
        return director;
    }

    public PaketMakanan PaketNasiPadang() {
        PaketMakananBuilder builder = new PaketMakananBuilder();
        builder.nasi("Nasi Padang");
        builder.lauk("Rendang Daging");
        builder.sayur("Sayur Nangka");
        builder.minuman("Teh Talua");

        return builder.getResult();
    }

    public PaketMakanan PaketNasiGoreng() {
        PaketMakananBuilder builder = new PaketMakananBuilder();
        builder.nasi("Nasi Goreng");
        builder.lauk("Telur Ceplok");
        builder.sayur("Kerupuk");
        builder.minuman("Es Teh");

        return builder.getResult();
    }

    public PaketMakanan PaketSaladBuah() {
        PaketMakananBuilder builder = new PaketMakananBuilder();
        builder.nasi(null);   // No rice for salad
        builder.lauk(null);    // No lauk for salad
        builder.sayur("Salad Buah");
        builder.minuman("Jus Jeruk");

        return builder.getResult();
    }

}

