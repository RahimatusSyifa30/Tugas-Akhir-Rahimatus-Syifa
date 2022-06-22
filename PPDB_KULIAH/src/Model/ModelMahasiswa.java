package Model;
import java.util.Date;
import java.sql.Connection;
import java.util.ArrayList;
import Entity.Mahasiswa;

import java.sql.*;
import java.util.ArrayList;
public class ModelMahasiswa extends ModelAbstract{
     private String sql;
    public ArrayList<Mahasiswa> getMahasiswa(){ 
        ArrayList<Mahasiswa> arraylistMahasiswa = new ArrayList<>();
        try {
            Statement stat = conn.createStatement();
            sql = "SELECT * FROM calon_mhs";
            ResultSet rs= stat.executeQuery(sql);
            while(rs.next()) {
                Mahasiswa mahasiswaEntity = new Mahasiswa();
                mahasiswaEntity.setNik(rs.getInt("NIK"));
                mahasiswaEntity.setUsername(rs.getString("Username"));
                mahasiswaEntity.setPassword(rs.getString("password"));
                mahasiswaEntity.setNama(rs.getString("Nama Calon"));
                mahasiswaEntity.setTgl_lhr(rs.getString("Tanggal Lahir"));
                mahasiswaEntity.setEmail(rs.getString("Email"));
                mahasiswaEntity.setNo_telp(rs.getInt("No Telp"));
                mahasiswaEntity.setAsal_sklh(rs.getString("Asal Sekolah"));
                mahasiswaEntity.setThn_lulus(rs.getString("Tahun Lulus"));
                mahasiswaEntity.setAlamat(rs.getString("Alamat"));
                arraylistMahasiswa.add(mahasiswaEntity);}
        } catch (SQLException e) {
            System.out.println(e);
        }
        return arraylistMahasiswa; 
    }
    
    public ArrayList<Mahasiswa> getMahasiswa(int NIK){
        ArrayList<Mahasiswa> arraylistMahasiswa = new ArrayList<>();
        try {
            sql = "SELECT * FROM mahasiswa WHERE NIK =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, NIK);
            ResultSet rs = stat.executeQuery();
            while(rs.next()){
                Mahasiswa mahasiswaEntity = new Mahasiswa();
                mahasiswaEntity.setNik(rs.getInt("NIK"));
                mahasiswaEntity.setUsername(rs.getString("Username"));
                mahasiswaEntity.setPassword(rs.getString("password"));
                mahasiswaEntity.setNama(rs.getString("Nama Calon"));
                mahasiswaEntity.setTgl_lhr(rs.getString("Tanggal Lahir"));
                mahasiswaEntity.setEmail(rs.getString("Email"));
                mahasiswaEntity.setNo_telp(rs.getInt("No Telp"));
                mahasiswaEntity.setAsal_sklh(rs.getString("Asal Sekolah"));
                mahasiswaEntity.setThn_lulus(rs.getString("Tahun Lulus"));
                mahasiswaEntity.setAlamat(rs.getString("Alamat"));
                arraylistMahasiswa.add(mahasiswaEntity);}
        }catch (SQLException e) {
            e.printStackTrace();
        }return arraylistMahasiswa;
    }
    
    public void createData(Mahasiswa MahasiswaEntity) {
        try {
            sql = "INSERT INTO calon_mhs (NIK,username,password,nama_calon,tempat_lhr,tgl_lhr,email,no_telp,asal_sekolah,thn_lulus,alamat) Values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, MahasiswaEntity.getNik());
            stat.setString(2, MahasiswaEntity.getUsername());
            stat.setString(3, MahasiswaEntity.getPassword());
            stat.setString(4, MahasiswaEntity.getNama());
            stat.setString(5, MahasiswaEntity.getTmpt_lhr());
            stat.setString(6, MahasiswaEntity.getTgl_lhr());
            stat.setString(7, MahasiswaEntity.getEmail());
            stat.setInt(8, MahasiswaEntity.getNo_telp());
            stat.setString(9, MahasiswaEntity.getAsal_sklh());
            stat.setString(10, MahasiswaEntity.getThn_lulus());
            stat.setString(11, MahasiswaEntity.getAlamat());
       
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e) {
            System.out.println("GAGAL INPUT DATA!!!");
            e.printStackTrace();
        }
    }
  
    public void deleteMahasiswa(int NIK){
        try{
            sql = "DELETE FROM mahasiswa WHERE NIK =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, NIK);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e){
            System.out.println("GAGAL HAPUS");
            e.printStackTrace();
        }
    }

    @Override
    public void updatePassword(String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int cekLogin(String username, int password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
