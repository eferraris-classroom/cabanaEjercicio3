package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args) {
        int [] numeros = {1 , 3 , 0 , 5 , 8};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (var numero: numeros){
            if (numero > max)
                max = numero;
            if (numero < min)
                min = numero;
            System.out.println(numero);
        }
        System.out.println("El máximo es: " + max);
        System.out.println("El mínimo es: " + min);
    }

}