package Entity;

import java.util.Date;

public class Mahasiswa extends UserAbstract{
    private String nama_cln,tempat_lhr,email,asal_sekolah,alamat;
    public String tgl_lhr,thn_lulus;
    private int NIK, umur, No_telp;
    
    public Mahasiswa(){}
    public String getNama(){return nama_cln;}
    public String getTmpt_lhr(){return tempat_lhr;}
    public String getTgl_lhr(){return tgl_lhr;}
    public String getEmail(){return email;}
    public String getAsal_sklh(){return asal_sekolah;}
    public String getThn_lulus(){return thn_lulus;}
    public String getAlamat(){return alamat;}
    
    public int getNik(){return NIK;}
    public int getUmur(){return umur;}
    public int getNo_telp(){return No_telp;}
    
    public void setNama(String nama_cln){this.nama_cln=nama_cln;}
    public void setTmpt_lhr(String tempat_lhr){this.tempat_lhr=tempat_lhr;}
    public void setTgl_lhr(String tgl_lhr){this.tgl_lhr=tgl_lhr;}
    public void setEmail(String email){this.email=email;}
    public void setAsal_sklh(String asal_sekolah){this.asal_sekolah=asal_sekolah;}
    public void setThn_lulus(String thn_lulus){this.thn_lulus=thn_lulus;}
    public void setAlamat(String alamat){this.alamat=alamat;}

    public void setNik(int NIK){this.NIK = NIK;}
    public void setUmur(int umur){this.umur = umur;}
    public void setNo_telp(int No_telp){this.No_telp = No_telp;}
}
