
public class Pengguna {
    private int id;
    private String username;
    private String password;

    public Pengguna(){
        System.out.println("Object telah diciptakan, contructor berjalan\n");
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void daftar(){
        System.out.println("ini method Daftar user baru\n");
    }
    
    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password){
        this.password = password;   
    }

    public String getPassword(){
        return this.password;
    }

    public void hapus(){
        System.out.println("DELETE FROM pengguna\n");
    }

    public void hapus(String username){
        System.out.println("DELETE FROM pengguna WHERE username = "+username+";\n");
    }
    
    public void login(){
        System.out.println("ini method untuk Login\n");
    }
    
    public void login(String tokenGoogle){
        System.out.println("ini Login menggunakan google\n");
    }
    
}