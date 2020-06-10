public class Baju extends Pakaian{
    public char kodeWarna = 'U';
    public Baju() {
        super.setHarga(1500.0);
        super.setJmlStock(5);
        super.setKeterangan("biru");

    }

    public void tampilInformasiBaju() {
        System.out.println("ID Baju: "+ getID());
        System.out.println("Keterangan: "+ getKeterangan());
        System.out.println("Kode Warna: "+ kodeWarna);
        System.out.println("Harga Baju: "+ getHarga());
        System.out.println("Jumlah Stok: "+ getJmlStock());

    }

    public static void main(String args[]) {
        Baju b = new Baju();
        b.tampilInformasiBaju();
    }
    
}