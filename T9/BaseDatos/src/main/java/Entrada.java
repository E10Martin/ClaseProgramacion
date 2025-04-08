import database.DBConnector;
import dto.UsuarioDTO;
import model.Usuario;

import java.sql.Connection;

public class Entrada {
    public static void main(String[] args) {
        DBConnector dbConnector = new DBConnector();
        dbConnector.createConnection();


        UsuarioDTO usuarioDT0 = new UsuarioDTO();
        Usuario usuario = new Usuario(3,"Martin","Ruiz","martin@ces","si",0,0);
        usuarioDT0.insertarUsuarios(usuario);


        //System.out.println("El numero de despidos es de "+usuarioDT0.borrarUsuario(5000000));


    }
}
