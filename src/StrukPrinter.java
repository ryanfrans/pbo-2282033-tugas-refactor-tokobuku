public class StrukPrinter {
    public void cetak(String pelanggan, Keranjang keranjang, MetodeBayar metode, int bayar) {
        System.out.println("================ STRUK =================");
        System.out.println("Pelanggan : " + pelanggan);
        for (Buku b : keranjang.getDaftarBuku()) {
            System.out.println(b.getJudul() + " (" + b.getPenulis() + ")");
            System.out.println("  Harga       : " + Buku.formatRupiah(b.getHarga()));
            System.out.println("  Keterangan  : " + b.keterangan());
            System.out.println("  Harga akhir : " + Buku.formatRupiah(b.hargaAkhir()));
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total belanja : " + Buku.formatRupiah(keranjang.hitungTotalBelanja()));
        System.out.println("Metode bayar  : " + metode.nama());
        System.out.println("Total bayar   : " + Buku.formatRupiah(bayar));
        System.out.println("Berat kiriman : " + keranjang.hitungTotalBerat() + " gram");
        System.out.println("-------------- LINK UNDUH ---------------");
        for (BisaDiunduh b : keranjang.getDaftarUnduh()) {
            System.out.println(b.linkUnduh());
        }
        System.out.println("-----------------------------------------");
    }
}