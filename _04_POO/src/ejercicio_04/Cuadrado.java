package ejercicio_04;

public class Cuadrado extends Rectangulo{

    public  Cuadrado(double lado){
        super(lado,lado);
    }
    //No es necesario sobrescrbir calcularArea(); porque al implementar
    //de Rectangulo ya estamos obteniendo la funcionalidad
}
