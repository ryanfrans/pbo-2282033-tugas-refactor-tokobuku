public class TokoBukuSolid {
    public static void main(String[] args) {
        BukuCetak b1 = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        BukuCetak b2 = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);
        BukuDigital b3 = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5);
        BukuAudio b4 = new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240);

        Keranjang keranjang = new Keranjang();
        keranjang.tambah(b1);
        keranjang.tambah(b2);
        keranjang.tambah(b3);
        keranjang.tambah(b4);

        keranjang.tambahKirim(b1);
        keranjang.tambahKirim(b2);

        keranjang.tambahUnduh(b3);
        keranjang.tambahUnduh(b4);

        StrukPrinter printer = new StrukPrinter();
        PenyimpanRiwayat riwayat = new FileRiwayat();
        Notifikasi notifikasi = new EmailSender();
        MetodeBayar metode = new EWallet();

        Toko toko = new Toko(printer, riwayat, notifikasi);
        toko.checkout("Sari", "sari@mail.com", keranjang, metode);
    }
}