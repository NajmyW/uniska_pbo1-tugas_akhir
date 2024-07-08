public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jml_hlmn;
    private int harga;

    public Buku() {
        System.out.println("Object buku telah dibuat, constractor buku berjalan\n");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJml_Hlmn(int jml_hlmn) {
        this.jml_hlmn = jml_hlmn;
    }

    public int getJml_Hlmn() {
        return jml_hlmn;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }
    public void baca(){
        System.out.println("Sedang Membaca Buku ini\n");
    }

    public void nulis(String text){
        System.out.println("Sedang menulis ke dalam buku dengan kalimat : "+ text+"\n"); 
    }

    public void feedback(String masukan){
        System.out.println("memberi masukan : " + masukan+"\n");
    }

   
    public void naikkanHarga(){
        harga += 1_500;
    }

    public void naikkanHarga(int hargaTambahan){
        harga += hargaTambahan;
    }

}