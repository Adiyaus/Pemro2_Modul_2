public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        p1.nama = "Roi";     //Ketinggalan tanda titik koma menyebabkan syntax error
        p1.asal = "Kingdom of Orvel";   
        p1.setJabatan("Assasin");
        p1.setUmur(17); // Menambahkan line ini bertujuan agar kita dapat menginput umur pegawai
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " Tahun");//Menambahkan " Tahun" agar hasil Output nya sesuai dengan yang diminta
    }       
}
