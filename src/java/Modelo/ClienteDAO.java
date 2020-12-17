package Modelo;

 //@author Anderson

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex = new Conexion();
    int res;
    String msj;
    
    public String RegistrarCliente(int dni,String nombre, String apellido, String correo, String direccion, int telefono, String ocupacion, int id_tipo) {
        String sql="insert into cliente (dni,nombre,apellido,correo,direccion,telefono,ocupacion,id_tipo) values (?,?,?,?,?,?,?,?)";
        try {
            con=conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, correo);
            ps.setString(5, direccion);
            ps.setInt(6, telefono);
            ps.setString(7, ocupacion);
            ps.setInt(8, id_tipo);
                    
            res=ps.executeUpdate();
            
            if(res==1){
            msj = "Cliente Agregado";
            }else{
            msj= "Error";
            }
        } catch (SQLException e) {
        }
        return msj; 
    }

    public String EditarCliente(int id,String nombre, String apellido, int dni, String correo,String direccion, int telefono, String ocupacion) {
        String sql="update cliente set (nombre=?, apellido=?, dni=?, correo=?, direccion=?, telefono=?, ocupacion=?) where id=?";
         try {
            con=conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setInt(4, dni);
            ps.setString(5, correo);
            ps.setString(6, direccion);
            ps.setInt(7, telefono);
            ps.setString(8, ocupacion);
            res = ps.executeUpdate();
            if(res==1)
                msj="Cliente actualizado";
            else msj = "Error";
        } catch (SQLException e) {
        }
         return msj;
    }

      public Cliente EliminarCliente(int id) {
        String sql = "delete from cliente where id=?";
        Cliente c = new Cliente();
        try {
            con=conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            res = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return c;
    }
    
    public List BuscarCliente(int dni) {
        List<Cliente> lista = new ArrayList<>();
        String sql = "select * from cliente where dni=?";
        try {
            con=conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setDni(rs.getInt("dni"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setCorreo(rs.getString("correo"));
                c.setDireccion(rs.getString("direccion"));
                c.setTelefono(rs.getInt("telefono"));
                c.setOcupacion(rs.getString("ocupacion"));
                c.setId_tipo(rs.getInt("id_tipo"));
                lista.add(c);
            }
            ps.executeUpdate();
        } catch (SQLException e) {
        }
        return lista;
    }
}
