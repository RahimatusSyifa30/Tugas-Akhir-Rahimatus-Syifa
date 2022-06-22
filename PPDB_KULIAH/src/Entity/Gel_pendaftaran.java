package Entity;
import java.util.Date;

public class Gel_pendaftaran {
    private int id_gel;
    public Date tgl_pendaftaran,tgl_seleksi,tgl_pengumuman; 
    public Gel_pendaftaran(){}
   
    public Date getPend() {return tgl_pendaftaran;}
    public Date getSel() {return tgl_seleksi;}
    public Date getPeng() {return tgl_pengumuman;}
    public int getId(){
        return id_gel;}
    
    public void setPend(Date tgl_pendaftaran) {this.tgl_pendaftaran = tgl_pendaftaran;}
    public void setSel(Date tgl_seleksi) {this.tgl_seleksi = tgl_seleksi;}
    public void setPeng(Date tgl_pengumuman) {this.tgl_pengumuman = tgl_pengumuman;}
    public void setId(int id_gel){
        this.id_gel = id_gel;}
}
