package Mail;

 //@author Anderson

public class User {
    String name;
    String email;
    String code;
    String id_cuenta;

    public User() {
    }

    public User(String name, String email, String code, String id_cuenta) {
        this.name = name;
        this.email = email;
        this.code = code;
        this.id_cuenta = id_cuenta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(String id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    
    
}
