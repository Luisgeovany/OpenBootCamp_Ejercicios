package packagePrincipal;

public class Main {
    public static void main(String[] args) {
        // Llamar la funcion suma
        System.out.println(suma(1,2,3));

        // creamos el objeto miCoche de la clase Coche
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.puertas);
    }

    // funcion con tres parametros que sean numeros y se sumen entre si
    public static int suma(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

}
class Coche {
    public int puertas = 2;

    public void incrementarPuertas(){
        this.puertas++;
    }
}