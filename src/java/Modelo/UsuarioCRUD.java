/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface UsuarioCRUD {
    public List ListarUsuario();
    public Usuario BuscarUsuario(String dni);
    public String RegistrarUsuario(String dni,String nom, String correo,String contra);
    public Usuario EliminarUsuario(String dni);
    public Usuario ValidarUsuario(String dni, String Contra);
    public String EditarUsuario(int dni, String contra);
}
