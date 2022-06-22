package Entity;

public class UserAbstract {
    protected String username,password;
   
    public UserAbstract(){}
    public UserAbstract(String username, String password){
        this.username= username;
        this.password = password;
    }
    public String getUsername() {return username;}
    public String getPassword() {return password;}
    
    public void setUsername(String username) {this.username = username;}
    public void setPassword(String password) {this.password = password;}
}
