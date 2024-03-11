package ejercicio_04;

public class Rectangulo  extends  Figura{
   private double alto ;
   private double ancho ;

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea(){
        return this.ancho * this.alto;
    }
}
