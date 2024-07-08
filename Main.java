

public class Main {
    public static void main(String[] args) {
        Pengguna pengguna = new Pengguna();
        pengguna.setId(3);
        System.out.println(pengguna.getId());
        pengguna.login();
        pengguna.daftar();
        pengguna.setPassword("Admin#1234");
        System.out.println(pengguna.getPassword());
        //bagian TAMU kita compile
        Tamu tamu = new Tamu();
        tamu.menambahMasaAktif(3);
        tamu.login();
        tamu.hapus();

        //bagian BUKU kita comile
        Buku buku = new Buku();
        buku.setJudul("Buku 1");
        buku.setPenulis("Penulis 1");
        buku.setJml_Hlmn(10);
        buku.nulis("Hai nama saya Najmy, kali ini saya sedang mengerjakan tugas akhir PBO 1. Semoga kali ini benar");
        buku.naikkanHarga();
        System.out.println("Harga Buku : "+buku.getHarga());
        buku.naikkanHarga(52400);
        System.out.println("Harga Buku : "+buku.getHarga());

        System.out.println("\n");
        //bagian KOST kita compile
        Kost kost = new Kost();
        kost.setNama("Adam");
        kost.setAlamat("Jl. Banjarbaru");
        kost.setHarga(450000);
        kost.setNoTelp("08465132654");
        kost.setTersedia(true);
        kost.getInformasi();

        //jika ga setia
        System.out.println("\n");
        kost.setNama("Najmy");
        kost.setAlamat("Jl. Banjarmasin");
        kost.setHarga(365000);
        kost.setNoTelp("08946143");
        kost.setTersedia(false);
        kost.getInformasi();

        System.out.println("\n");
        //didalam paramter
        Kost kost2 = new Kost("Ridho","Jl. Martapura","0898465984",34300);
        kost2.getInformasi();
    }
}
