public class Pegawai { // nama public class nya harus disesuaikan dengan nama filenya, jadi disini diganti yang awalnya Employee jadi Pegawai
    public String nama;
    public String asal; //Awalnya disini adalah public char asal tetapi karena di main memerlukan lebih dari satu huruf jadi variabel asal disini di ubah saja jadi String 
    public String jabatan;
    public int umur;
    public String getNama() {
    return nama;
    }

    public void setUmur(int umur) {
        this.umur = umur; // Mengatur umur
    }
    //public String getAsal()
    public String getAsal() {
        return asal; //Pada line 10-11 ini terjadi kesalahan pada penulisan public String getAsal() yang dimana seharusnya itu ditulis dengan public char getAsal()
    }
    //public void setJabatan()
    public void setJabatan(String j) {
        this.jabatan = j;
        }        //Pada Line 14-16 ini terjadi kesalahan karena tidak dideklarasikan nya variabel j lebih tepatnya di line 14
}
