import model.Usuarios;

import java.io.*;

public class OperacionesUsuario {

    public void escribirUsuario(String path, Usuarios usuarios){
        File file = new File(path);
        PrintWriter printWriter = null;

        try{
            printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.println(usuarios.toString());
            //escribe nombre
        } catch (IOException e){
            System.out.println("error i/o");
        } finally {
            try{
                printWriter.close();
            } catch ( Exception e){
                System.out.println("error");
            }
        }
    }

    public void lecturaUsuario(String path) throws IOException {
        File file = new File(path);
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea;
            while ((linea = bufferedReader.readLine()) != null){
                //el usuario
                String[] datos = linea.split(",");
                Usuarios usuarios = new Usuarios(datos[0],datos[1], datos[2], Integer.parseInt(datos[3]) );
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error no encontrado");
        } finally {
            try{
                bufferedReader.close();
            }catch (IOException | NullPointerException e){
                System.out.println("Fallo en el cierre");
            }
        }
    }

    public void escribirUsuarioObjeto(String path, Usuarios usuarios){
        File file = new File(path);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(usuarios);
        } catch (FileNotFoundException e) {
            System.out.println("Error de fihchero");
        } catch (IOException e) {
            System.out.println("Error i/o");
        } finally {
            try{
                objectOutputStream.close();
            } catch (IOException | NullPointerException e){
                System.out.println("Error i/o");
            }
        }
    }

    public void leerUsuarioObjeto(String path){
        File file = new File(path);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            Usuarios usuarios = (Usuarios) objectInputStream.readObject();
            usuarios.mostrarDatos();
        } catch (FileNotFoundException e) {
            System.out.println("Fallo fichero");
        } catch (IOException e) {
            System.out.println("Fallo i/o");
        } catch (ClassNotFoundException e){
            System.out.println("Calse no encontrada");
        }catch (ClassCastException e){
            System.out.println("Error en el casteo de datos");
        }

    }
}
