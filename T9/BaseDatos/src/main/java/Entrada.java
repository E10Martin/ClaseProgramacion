import database.DBConnector;
import dto.UsuarioDT0;
import model.Usuario;

public class Entrada {
    public static void main(String[] args) {
        /*DBConnector dbConnector = new DBConnector();
        dbConnector.createConnection();*/

        UsuarioDT0 usuarioDT0 = new UsuarioDT0();
        Usuario usuario = new Usuario(3,"Martin","Ruiz","martin@ces","Si",10,1000);
        usuarioDT0.insertarUsuarios(usuario);

    }
}
