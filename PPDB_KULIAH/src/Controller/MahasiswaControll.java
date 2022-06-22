package Controller;
import Entity.Mahasiswa;
import Model.ModelMahasiswa;
import java.util.ArrayList;

public class MahasiswaControll implements ControllerInterface {
   public void insertData(int NIK, String username, String password, String nama_calon,String tempat_lhr, String tgl_lhr, String email, int no_telp, String asal_sekolah, String thn_lulus, String alamat){
        Mahasiswa mahasiswaEntity = new Mahasiswa();
                mahasiswaEntity.setNik(NIK);
                mahasiswaEntity.setUsername(username);
                mahasiswaEntity.setPassword(password);
                mahasiswaEntity.setNama(nama_calon);
                mahasiswaEntity.setTgl_lhr(tgl_lhr);
                mahasiswaEntity.setEmail(email);
                mahasiswaEntity.setNo_telp(no_telp);
                mahasiswaEntity.setAsal_sklh(asal_sekolah);
                mahasiswaEntity.setThn_lulus(thn_lulus);
                mahasiswaEntity.setAlamat(alamat);
        AllObjectModel.Modelmahasiswa.createData(mahasiswaEntity);
    }
    public ArrayList<Mahasiswa> getDataMahasiswa(){
        return AllObjectModel.Modelmahasiswa.getMahasiswa();
    }
    public ArrayList<Mahasiswa> getByNik(int cek){
        return AllObjectModel.Modelmahasiswa.getMahasiswa(cek);
    }
    public void deleteData(int NIK){
        AllObjectModel.Modelmahasiswa.deleteMahasiswa(NIK);
    }

 //  public void updateData(int urut, String data, int NIK){
 //       switch(urut){
 //           case 1:
 //              AllObjectModel.Modelmahasiswa.updateNama(data, NIK);
 //               break;
 //           case 2:
 //               AllObjectModel.Modelmahasiswa.updateTempat_lhr(data, NIK);
 //               break;
 //           case 3:
 //               AllObjectModel.Modelmahasiswa.updateNo_telp(data, NIK);
 //               break;
 //           case 4:
 //                AllObjectModel.Modelmahasiswa.updateAlamat(data, NIK);
 //               break;
 //           
  //      }
  //  }

    @Override
    public int login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertData(int NIK, String username, String password, String nama_calon, String tempat_lhr, int tgl_lhr, String email, int no_telp, String asal_sekolah, int thn_lulus, String alamat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

    

