import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //System.out.println nos permite imprimir un mensaje por consola
        /*
        System.out.println("Hola mundo!");

        //Instanciar la clase Scanner nos permite crear un objeto para
        //leer datos ingresados desde la consola
        Scanner objScanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = objScanner.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = objScanner.nextInt();

        System.out.println("Ingresa tu altura: ");
        double altura = objScanner.nextDouble();

        //Shorcut para imprimir en consola = sout
        System.out.println("Datos " + " nombre: " + nombre + " edad: "+ edad+ " altura: "+ altura );

        objScanner.close();

        if (edad >= 18){
            System.out.println(nombre + " Eres mayor de edad");
            if (altura >= 1.80){
                System.out.println(" Eres una persona alta");
            }else if (altura < 1.80 && altura > 1.70){
                System.out.println(" Eres una persona de estatura promedio");
            }else {
                System.out.println(" Eres una persona de estatura baja");
            }
        }else {
            System.out.println(nombre + " Eres menor de edad");
        }

        */
        //Ejericio 1
        //Calculadora basica

        Scanner objScanner1 = new Scanner(System.in);

        String option = JOptionPane.showInputDialog(null,"MENU DE OPERACIONES \n 1. Sumar \n 2.Restar \n 3.Multiplicar \n 4.Dividir");

        //Obtener los dos número a operar
        String num1 = JOptionPane.showInputDialog(null,"Ingrese el primer número:");
        String num2 = JOptionPane.showInputDialog(null,"Ingrese el segundo número");

        //Convertir los números que estan en String a enteros

        double a = Double.parseDouble(num1);
        double b = Double.parseDouble(num2);

        switch (option){
            case "1":
                JOptionPane.showMessageDialog(null, a + " + "+ b +" = "+ (a+b));

                break;
            case "2":
                JOptionPane.showMessageDialog(null, a + " - "+ b +" = "+ (a-b));

                break;
            case "3":
                JOptionPane.showMessageDialog(null, a + " x "+ b +" = "+ (a*b));

                break;

            case "4":
                 if (b == 0){
                     JOptionPane.showMessageDialog(null,"El número b debe ser diferente de 0.");
                 }else {

                    JOptionPane.showMessageDialog(null, a + " / "+ b +" = "+ (a/b));
                 }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");

        }

    }
}