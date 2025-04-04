package model;

import java.io.*;

public class OperacionesFichero {

    public void descifrarTexto(int fase, String path) {

        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(" ");
                for (String codigo : strings) {
                   int codigoDescifrado = Integer.valueOf(codigo);
                    System.out.println((char) codigoDescifrado);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error 1");
        } catch (IOException e) {
            System.out.println("Error 2");
        } finally {
            try {
                fileReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error 3");
            }
        }
    }

}
