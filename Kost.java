public class Kost {
    private String nama;
    private String alamat;
    private String noTelp;
    private double hargaBulanan;
    private boolean tersedia;

    public Kost(){
        System.out.println("Membuat Object baru");
    }

    public Kost(String nama, String alamat,String noTelp, double hargaPerBulan){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.hargaBulanan = hargaPerBulan;
        this.tersedia = true;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNoTelp(String noTelp){
        this.noTelp = noTelp;
    }
    
    public String getNoTelp(){
        return noTelp;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setHarga(double harga){
        this.hargaBulanan = harga;
    }

    public double getHarga(){
        return hargaBulanan;
    }

    public void setTersedia(boolean tersedia)
    {
        this.tersedia = tersedia;
    }
    
    public boolean cekStokKamar(){
        return tersedia;
    }

    public void getInformasi(){
        System.out.println("Nama Penyewa : " + nama +"\nNo Telpon: " + noTelp + "\nAlamat: " + alamat + "\nHarga per Bulan: " + hargaBulanan + "\nKamar tersedia : " + (tersedia ? "Ya" : "Tidak"));
    }

    
}
