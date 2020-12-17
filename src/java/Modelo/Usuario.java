package Modelo;

 // @author Anderson
 
public class Usuario {
    
    String dni;
    String nombre;
    String correo;
    String contraseña;

    public Usuario() {
    }

    public Usuario(String dni, String nombre, String correo, String contraseña) {
        this.dni = dni;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public boolean ValidarDNI() {
        if (dni.matches("^[0-9]{8}$"))
		return true;
		else
			return false;
    }
    
}
