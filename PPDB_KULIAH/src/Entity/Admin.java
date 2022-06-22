package Entity;

public class Admin extends UserAbstract{
    private int id_admin;
    protected String nama_fakultas;
    public Admin(String username, String password){
        super(username,password);
        this.id_admin = id_admin;
        }
    public int getId(){
        return id_admin;
    }
    public void setId(int id_admin){
        this.id_admin = id_admin;
    }
}

