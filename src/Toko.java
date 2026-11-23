public class Toko {
    private final StrukPrinter printer;
    private final PenyimpanRiwayat riwayat;
    private final Notifikasi notifikasi;

    public Toko(StrukPrinter printer, PenyimpanRiwayat riwayat, Notifikasi notifikasi) {
        this.printer = printer;
        this.riwayat = riwayat;
        this.notifikasi = notifikasi;
    }

    public void checkout(String pelanggan, String alamatEmail, Keranjang keranjang, MetodeBayar metode) {
        int total = keranjang.hitungTotalBelanja();
        int bayar = metode.totalBayar(total);

        printer.cetak(pelanggan, keranjang, metode, bayar);

        int jumlahBuku = keranjang.getDaftarBuku().size();
        riwayat.simpan(pelanggan + ";" + jumlahBuku + " buku;" + Buku.formatRupiah(bayar));
        notifikasi.kirim(alamatEmail, "Terima kasih " + pelanggan + ", total bayar " + Buku.formatRupiah(bayar));
    }
}