import java.io.File;
import java.io.IOException;

public class Operaciones {

    public void divisionEntre0(int numero) throws ArithmeticException {
        System.out.println("Procedemos a dividir unnumero entre 0");
        System.out.println("la division del numero es "+ numero/0);
        System.out.println("Fin del metodo");
    }

    public void crearFichero(String path)  {
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void lanzarExcepcion(String nombre, int telefono) throws TelefonoExcepcion{
        if (String.valueOf(telefono).length()!=9){
            //lanzar una excepcion
            try {
                throw new Exception("Telefono incorrecto");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("No hay error");
        }
    }


}
