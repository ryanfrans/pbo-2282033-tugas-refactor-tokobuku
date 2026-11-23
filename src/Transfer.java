public class Transfer implements MetodeBayar {
    @Override
    public String nama() {
        return "Transfer (+Rp2.500)";
    }

    @Override
    public int totalBayar(int totalBelanja) {
        return totalBelanja + 2500;
    }
}