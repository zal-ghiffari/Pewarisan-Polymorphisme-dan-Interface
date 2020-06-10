public class Pakaian {
    private int ID = 0;
    private String keterangan = "-keterangan diperlukan-";
    private double harga = 0.0;
    private int jmlStock = 0;
    private static int UNIQUE_ID = 0;

    public Pakaian() {
        ID = UNIQUE_ID++;
    }
    public int getID() {
        return ID;
    }
    public void setKeterangan(String d) {
        keterangan = d;
    }
    public String getKeterangan() {
        return keterangan;
    }
    public void setHarga(double p) {
        harga = p;
    }
    public double getHarga() {
        return harga;
    }
    public void setJmlStock(int q) {
        jmlStock = q;
    }
    public int getJmlStock() {
        return jmlStock;
    }
}