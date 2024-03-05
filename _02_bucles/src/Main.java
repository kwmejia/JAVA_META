import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       /* Contador Simple: Escribe un programa que utilice un bucle for para contar del 1 al 10 e
        imprimir cada número en la consola.*/

        /*for (int i= 1; i<=10;i++){
            System.out.println(i);
        }*/
        /*Suma de Números: Utiliza un bucle while para sumar los números del 1 al 100 e imprimir
        el resultado.*/

 /*       int contador = 0;
        int sumaTotal = 0;

        while (contador <= 100){
            sumaTotal += contador;
            contador++;
        }

        System.out.println(sumaTotal);*/

       /* for (int i= 1; i<= 10; i++){
            System.out.println("\nTabla del "+i);

            for (int j=1; j<=10; j++){
                System.out.println(i+"x"+j+" = "+ (i*j));
            }
        }*/

        /*Sistema de Menú Interactivo: Desarrolla un sistema de menú interactivo que muestre
        diferentes opciones al usuario (por ejemplo, 1. Ver saldo 2. Depositar dinero 3. Retirar
        dinero 4. Salir). Utiliza un bucle para permitir al usuario interactuar con el menú hasta que
        elija salir.*/

        String option = "";
        double saldo = 0;
        do {

            option = JOptionPane.showInputDialog(null, "\n\n MENU DE OPCIONES\n" +
                    "1. Ver saldo\n" +
                    "2. Depositar dinero\n" +
                    "3. Retirar\n" +
                    "4. Salir \n\n" +
                    "Ingrese una opción: ");


            switch (option) {

                case "1":
                    JOptionPane.showMessageDialog(null, "Tu saldo hasta el momento es: $" + saldo);
                    break;
                case "2":
                    String precioString = JOptionPane.showInputDialog(null, "Ingresa el valor a depositas \n"
                            + "$");

                    try {

                        double precio = Double.parseDouble(precioString);
                        saldo += precio;

                        JOptionPane.showMessageDialog(null, "Dinero ingresado correctamente!!, tu saldo es: $"+saldo);

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "los caracteres ingresados no son válidos");
                    }
                    break;

                case "3":
                    try {

                        double valorRetirar= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el valor a retirar")) ;

                        if (valorRetirar <= saldo){
                            saldo -= valorRetirar;
                            JOptionPane.showMessageDialog(null,"Retiro correcto!, tu saldo es:" +saldo);
                        }else  {
                            JOptionPane.showMessageDialog(null,"Saldo insuficiente");
                        }
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null, "los caracteres ingresados no son válidos");
                    }
                    break;
            }
        } while (!option.equals("4"));

    }
}