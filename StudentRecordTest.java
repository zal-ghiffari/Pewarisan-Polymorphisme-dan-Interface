public class StudentRecordTest {
    public static void main( String[] args ){
        StudentRecord siswaTingkat1 = new StudentRecord();
        StudentRecord siswaTingkat2 = new StudentRecord();
        StudentRecord siswaTingkat3 = new StudentRecord();
        StudentRecord siswaTingkat4 = new StudentRecord();

        TesOverride tesoverride = new TesOverride();

        siswaTingkat1.gantiNama("Jemi");
        siswaTingkat2.gantiNama("Farras");
        siswaTingkat3.gantiNama("Alwan");
        siswaTingkat4.gantiNama("Charent");

        System.out.println(siswaTingkat1.getNama());
        tesoverride.gantiNama("ZAL");
        System.out.println(siswaTingkat4.getNama());
        System.out.println(tesoverride.getNama());

        System.out.println("Jumlah Siswa Sebanyak = "+StudentRecord.getJmlSiswa()+" Orang");
    }
}
        
class TesOverride extends StudentRecord{
    @Override
    public String getNama(){
        System.out.println("Siswa Farras Mahasiswa Tingkat 2");
        return nama;
    }

    public void gantiNama(String newnama){
        nama = newnama;
        System.out.println("Berhasil mengganti nama menjadi "+newnama);
    }
}