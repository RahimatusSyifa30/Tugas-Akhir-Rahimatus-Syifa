package Entity;

public class Fakultas {
    private int id_fakultas;
    public String nama_fakultas; 
    public Fakultas(){}
   
    public String getNama() {return nama_fakultas;}
    public int getId(){
        return id_fakultas;}
    
    public void setNama(String nama_fakultas) {this.nama_fakultas = nama_fakultas;}
    public void setId(int id_fakultas){
        this.id_fakultas = id_fakultas;}
}
