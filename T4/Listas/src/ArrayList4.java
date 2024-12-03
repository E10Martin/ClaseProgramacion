import java.util.*;

public class ArrayList4 {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //Crea un programa que cree un ArrayList de palabras, introduce en él 10 palabras cualquiera.
        // Muestra el número de letras de todas las palabras, la palabra con más letras y la palabra con menos letra

        ArrayList<String> listaPalabras = new ArrayList<>();
        listaPalabras.add("fdrgg");
        listaPalabras.add("grgeg");
        listaPalabras.add("rgerggwerg");
        listaPalabras.add("rgegrgegrre");
        listaPalabras.add("rgegrg");
        listaPalabras.add("gegrg");
        listaPalabras.add("gre");
        listaPalabras.add("er");
        listaPalabras.add("err");
        listaPalabras.add("h");

        int numeroLetras =0;
        String palabraMayor = listaPalabras.get(0);
        String palabraMenor = listaPalabras.get(0);
        for (String item:listaPalabras) {
            numeroLetras +=item.length();
            if (palabraMayor.length()<item.length()){
                palabraMayor = item;
            }
            if (palabraMenor.length()>item.length()){
                palabraMenor = item;
            }
        }
        oirdenarLista(listaPalabras);

    }

    public static void oirdenarLista(ArrayList<String> lista){
        Collections.sort(lista);//ordenado alfabeticamente
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()> o2.length()){
                    return 1;
                } else if (o1.length()<o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (String item: lista) {
            System.out.print(item+"\t");
        }
    }
}
