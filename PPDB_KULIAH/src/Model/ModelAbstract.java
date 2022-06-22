package Model;
import Helper.KoneksiDb;
import java.sql.Connection;

public abstract class ModelAbstract {
    Connection conn = KoneksiDb.getconnection();
    
    public abstract void updatePassword(String password);
    public abstract int cekLogin(String username, int password);
    
}
