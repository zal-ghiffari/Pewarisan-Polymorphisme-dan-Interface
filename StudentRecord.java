public class StudentRecord {
    public String nama;

    private String alamat;
    private int umur;
    private double mtk;
    private double bInggris;
    private double ipa;
    private double bIndo;
    private double sejarah;

    private double ratarata;

    private static int hitsiswa;

    public String getNama(){
        return nama;
    }

    public void gantiNama(String newNama ){
        nama = newNama;
    }

    public double getRataRata(){
        double result = 0;
        result = ( mtk+bInggris+ipa+bIndo+sejarah )/5;
        return result;
    }

    public static int getJmlSiswa(){
        return hitsiswa;
    }
}