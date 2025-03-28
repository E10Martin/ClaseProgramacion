import java.io.File;

public class TodosArchivos {

    public void leerInformacion(File directorio){


        if (directorio.exists() && directorio.isDirectory()) {
                for (File fichero : directorio.listFiles()) {
                    System.out.println(fichero.getAbsolutePath());
                    if (fichero.isDirectory()) {
                        leerInformacion(fichero);
                    }
                }
            }
    }
}
