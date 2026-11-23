public class EmailSender implements Notifikasi {
    @Override
    public void kirim(String alamat, String isi) {
        System.out.println("[EMAIL " + alamat + "] " + isi);
    }
}