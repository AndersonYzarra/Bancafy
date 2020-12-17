package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

// @author Anderson

public class UsuarioDAO implements UsuarioCRUD{
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex = new Conexion();
    int res;
    String msj;

    @Override
    public List ListarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Usuario BuscarUsuario(String dni) {
        String sql = "select * from usuario where dni=?";
        Usuario c = new Usuario();
        try {
            con=conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, dni);
            rs=ps.executeQuery();
            while(rs.next()){
                c.setDni(rs.getString("dni"));
                c.setNombre(rs.getString("nombre"));
                c.setCorreo(rs.getString("correo"));
                c.setContraseña(rs.getString("contraseña"));
            }
            ps.executeUpdate();
        } catch (SQLException e) {
        }
        return c;
    }

    @Override
    public String RegistrarUsuario(String dni, String nom, String correo, String contra) {
        String sql="insert into usuario values (?,?,?,?);";
        try {
            con=conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, nom);
            ps.setString(3, correo);
            ps.setString(4, contra);
                    
            res=ps.executeUpdate();
            
            if(res==1){
                msj = "Usuario Agregado";
            }else{
                msj= "Error";
            }
        } catch (SQLException e) {
        }
        return msj; 
    }

    @Override
    public Usuario EliminarUsuario(String dni) {
        String sql = "delete from usuario where DNI=?";
        Usuario u = null;
        try {
            u = new Usuario();
            con=conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, dni);
            res = ps.executeUpdate();
            return u;
        } catch (SQLException e) {
        }
        return u;
    }

    @Override
    public Usuario ValidarUsuario(String dni, String Contra) {
        
        Usuario usuario=null;
        
        String sql="select nombre,correo from usuario where DNI=? and contraseña=?";

        try {
            con=conex.getConnection();
            ps=con.prepareStatement(sql);
            //
            ps.setString(1,dni);
            ps.setString(2,Contra);
            //
            rs=ps.executeQuery();
            
            if(rs.next()){
                usuario=new Usuario();
                usuario.setNombre(rs.getString(1));
                usuario.setCorreo(rs.getString(2));
                return usuario;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuario;
    }

    @Override
    public String EditarUsuario(int dni,String contra) {
        String sql="update usuario set contraseña=? where DNI=?";
         try {
            con=conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, contra);
            ps.setInt(2, dni);
            res = ps.executeUpdate();
            if(res==1)
                msj="Cliente actualizado";
            else msj = "Error";
        } catch (SQLException e) {
        }
         return msj;
    }

}
