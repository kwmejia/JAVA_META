import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class Ejercicio05 {

    public static void main(String[] args) {
      /*  Lista de Reproducción Musical: Imagina que estás creando una aplicación para
        gestionar listas de reproducción musicales. Cada canción es representada
        simplemente por su nombre. El programa debe permitir:
         Añadir y remover canciones de la lista de reproducción.
         Mostrar la canción actual y las siguientes en la lista.
         Saltar a la siguiente canción.*/

        //Creación de la lista de canciones
        ArrayList<String> playList = new ArrayList<>();

        int option = 0;
        int cancionActual = 0;

        do {



                option = Integer.parseInt(JOptionPane.showInputDialog(" PLAYLIST \n" +
                        "1. Agregar canción\n" +
                        "2. Remover canción\n" +
                        "3. Mostrar canción Actual y siguientes en la lista\n" +
                        "4. Saltar a la siguiente canción\n" +
                        "5. Salir\n" +
                        "Ingrese una opción: "));

                switch (option) {

                    case 1://Añadir una canción

                        //Pedimos la nueva canción al usuario
                        String nuevaCancion = JOptionPane.showInputDialog("Ingrese el nombre de la canción a agregar");

                        //Agregamos la nueva canción a la playlist
                        playList.add(nuevaCancion.toLowerCase());

                        JOptionPane.showMessageDialog(null,
                                nuevaCancion + "Agregada correctamente. 🎶");
                        break;

                    case 2: //Eliminar una canción de la playList

                        //Pedimos al usuario el nombre dela canción a eliminar
                        String cancionEliminar = JOptionPane.showInputDialog("Ingrese el nombre de la canción a eliminar");

                        //Eliminar la canción que tenga ese nombre
                        if (playList.remove(cancionEliminar.toLowerCase())) {

                            JOptionPane.showMessageDialog(null, cancionEliminar +
                                    " Eliminada correctamente 🎶❌");
                        } else {
                            JOptionPane.showMessageDialog(null, cancionEliminar +
                                    " No se encuentra en la playList ❌");
                        }

                        break;

                    case 3: // Mostrar la canción actual y la siguiente en la lista
                        //Preguntar si la playList está vacía
                        if (playList.isEmpty()){
                            JOptionPane.showMessageDialog(null,"La playlist está vacía.");
                        }else {
                            //Creamos una variable Para guardar en texto todas las canciones mayores a la actual
                            String listaTotal = "";
                            //Agregamos la canción actual
                            listaTotal += "Canción actual:\n"+playList.get(cancionActual)+"\n "+
                            "\n\nSiguientes en la lista:\n";

                            for (int i = cancionActual; i < playList.size() -1; i++){
                                //Por cada iteración concatenamos a la variable listaTotal
                                listaTotal += "🎶 "+playList.get(i +1)+"\n";
                            }
                            JOptionPane.showMessageDialog(null,listaTotal);
                        }

                        break;

                    case  4: // Saltar a la siguiente canción

                        //Validar que si haya una siguiente canción
                        if (cancionActual +1 < playList.size()){
                            cancionActual++;
                            JOptionPane.showMessageDialog(null,
                                    playList.get(cancionActual)+ " Reproducida correctamente 🎶🎶");
                        }else  {
                            JOptionPane.showMessageDialog(null,"PlayList finalizada");
                            cancionActual=0;
                        }

                        break;
                }




        } while (option != 5);
    }
}
