import java.util.ArrayList;
import java.util.List;

public class Keranjang {
    private List<Buku> daftarBuku = new ArrayList<>();
    private List<BisaDikirim> daftarKirim = new ArrayList<>();
    private List<BisaDiunduh> daftarUnduh = new ArrayList<>();

    public void tambah(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tambahKirim(BisaDikirim buku) {
        daftarKirim.add(buku);
    }

    public void tambahUnduh(BisaDiunduh buku) {
        daftarUnduh.add(buku);
    }

    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public List<BisaDikirim> getDaftarKirim() {
        return daftarKirim;
    }

    public List<BisaDiunduh> getDaftarUnduh() {
        return daftarUnduh;
    }

    public int hitungTotalBelanja() {
        int total = 0;
        for (Buku b : daftarBuku) {
            total += b.hargaAkhir();
        }
        return total;
    }

    public int hitungTotalBerat() {
        int totalBerat = 0;
        for (BisaDikirim b : daftarKirim) {
            totalBerat += b.getBeratGram();
        }
        return totalBerat;
    }
}