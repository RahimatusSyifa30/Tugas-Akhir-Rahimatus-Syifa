package Controller;

public interface ControllerInterface {
    int login (String username, String password);
    void insertData(int NIK, String username, String password, String nama_calon,String tempat_lhr, int tgl_lhr, String email, int no_telp, String asal_sekolah, int thn_lulus, String alamat);  
}
