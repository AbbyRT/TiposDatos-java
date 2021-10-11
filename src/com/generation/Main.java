package com.generation;

public class Main {

    public static void main(String[] args) {

        //entero

        byte numE1 =10;
        short num2 = 10;
        int num3 = 10;
        long num4 = 10;

        //decimales
        float decimal1 = 10.14512f;
        double decimal2= 10.12554265421455d;

        //caracteres
        char caracter = 'f';
        String nombre = "Abby :v";

        //booleano
        boolean verdadero = true;

        //conversion de numeros
        byte num1 = 10;
        short numShort1 =num1;
        int numInt = numShort1;

        //conversion inversa:
        short numShort2 = (short) numInt;

        //conversion de un resultado
        byte numByte1 = 120;
        byte numByte2 = 120;
        short suma = (short) (numByte1 + numByte2);


//        System.out.println(numInt);
//        System.out.println(numShort2);
//        System.out.println(suma);

        //operadores aritmeticos
        //+ - * % /
        //+ sirve para sumar y para concatenar cadenas de texto
        //en la libreria math se rrealizan opercionaes de potencias, raices...
        int numeritoA = 50;
        int numeritoB = 3;

        String texto1 = "hola ";
        String texto2 = "crayola :v";
        String mensaje = texto1+texto2;

        //para el resultado de la division es necesario convertir los num :/

        int sumaE = numeritoA + numeritoB;
        int restaE = numeritoA - numeritoB;
        int multiE = numeritoA * numeritoB;
        float divE =  (float) numeritoA / (float) numeritoB;
        int modE = numeritoA % numeritoB;

        System.out.println("Números: "+numeritoA+" & "+numeritoB);
        System.out.println("suma: "+sumaE);
        System.out.println("resta: "+restaE);
        System.out.println("multiplicación: "+multiE);
        System.out.println("división: "+divE);
        System.out.println("módulo: "+modE);
        System.out.println("concatenación:"+mensaje);

    }
}
