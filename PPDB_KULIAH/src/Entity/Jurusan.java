package Entity;

public class Jurusan {
    private int id_jurusan;
    public String nama_jurusan; 
    public Jurusan(){}
   
    public String getNama() {return nama_jurusan;}
    public int getId(){
        return id_jurusan;}
    
    public void setNama(String nama_jurusan) {this.nama_jurusan = nama_jurusan;}
    public void setId(int id_jurusan){
        this.id_jurusan = id_jurusan;}
}
