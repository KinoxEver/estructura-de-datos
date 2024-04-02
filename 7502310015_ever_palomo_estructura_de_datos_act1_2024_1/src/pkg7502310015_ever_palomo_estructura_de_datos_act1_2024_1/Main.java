
package pkg7502310015_ever_palomo_estructura_de_datos_act1_2024_1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    
    
    public static void main(String[] args) {
        
        byte [] numeros = new byte[5];
        
        numeros[0] = 100;
        numeros[1] = 27;
        numeros[2] = 11;
        numeros[3] = 1;
        numeros[4] = 38;
        
        for(int i = 0; i < numeros.length; i++)
            System.out.println("El dato en la posicion " + i + ":" + numeros[i]);
        
         System.out.println("----------------------------------------------------"); 
        
        char [] letra = new char[5];
        
        letra[0] = 'a';
        letra[1] = 'b';
        letra[2] = 'c';
        letra[3] = 'd';
        letra[4] = 'e';
        
        for(int i = 0; i < letra.length; i++) 
            System.out.println("La letra en  la posicion" + i + ":" + letra[i] );
        
        System.out.println("----------------------------------------------------");
        
        short [] numero2 = new short[5];
        
        numero2[0] = 444;
        numero2[1] = 121;
        numero2[2] = 111;
        numero2[3] = 700;
        numero2[4] = 50;
        
        for(short i = 0; i < numero2.length; i++)
            System.out.println("El dato en la posicion " + i + ":" + numero2 [i] );

        System.out.println("----------------------------------------------------");
        
        int [] numero3 = new int[5];
        
        numero3[0] = 5;
        numero3[1] = 4;
        numero3[2] = 3;
        numero3[3] = 2;
        numero3[4] = 1;
        
        for(int i = 0; i < numero3.length; i++)
            System.out.println("El dato en la posicion " + i + ":" + numero3 [i] );

        System.out.println("----------------------------------------------------");
        
        long [] numero4 = new long[5];
        
        numero4[0] = 3;
        numero4[1] = 4;
        numero4[2] = 5;
        numero4[3] = 6;
        numero4[4] = 7;
        
        for(int i = 0; i < numero4.length; i++)
            System.out.println("El dato en la posicion " + i + ":" + numero4 [i] );

        System.out.println("----------------------------------------------------");
        
        float [] numero5 = new float[5];
        
        numero5[0] = 3.1f;
        numero5[1] = 4.1f;
        numero5[2] = 5.1f;
        numero5[3] = 6.1f;
        numero5[4] = 7.1f;
                
        for(int i = 0; i < numero5.length; i++)
            System.out.println("El dato en la posicion " + i + ":" + numero5 [i] );

        System.out.println("----------------------------------------------------");
        
        double [] numero6 = new double[5];
        
        numero6[0] = 3.2;
        numero6[1] = 4.2;
        numero6[2] = 5.2;
        numero6[3] = 6.2;
        numero6[4] = 7.2;
        
        for(int i = 0; i < numero6.length; i++)
            System.out.println("El dato en la posicion " + i + ":" + numero6 [i] );

        System.out.println("----------------------------------------------------");
        
        String [] palabra = new String[5];
        
        palabra[0] = "Hola";
        palabra[1] = "adios";
        palabra[2] = "buenas";
        palabra[3] = "Hasta luego";
        palabra[4] = "Cascada";
        
         for(int i = 0; i < palabra.length; i++)
            System.out.println("La palabra en la posicion " + i + ":" + palabra [i] );

        System.out.println("----------------------------------------------------");
                
       Object [] objeto = new Object[5];
       
       objeto[0] = "mesa";
       objeto[1] = "silla";
       objeto[2] = "escaparate";
       objeto[3] = "arbol";
       objeto[4] = "avion";
       
       for(int i = 0; i < objeto.length; i++)
            System.out.println("La palabra en la posicion " + i + ":" + objeto [i] );

        System.out.println("----------------------------------------------------");
        
        String [] DataStructure = {"Listas" , "Pilas" , "Colas" , "Mapas" , "Conjuntos"};
        
        for(int i = 0; i < DataStructure.length; i++)    
            System.out.println("La palabra en la posicion " + i + ":" + DataStructure [i] );  
        
        System.out.println("----------------------------------------------------");
        
        String [] Caracteristicas = new String [5];
        
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese las caracteristicas");
        
        for(int i = 0; i < Caracteristicas.length; i++){
            System.out.println("La caracteristica numero" + (i+1) + ": ");
        Caracteristicas [i] = s.nextLine();
        }
        
        System.out.println("----------------------------------------------------");
        
        int [] Venta;
        
        Random r = new Random();
        
        int cRandom = r.nextInt(20) + 1 ;
        
        Venta = new int [cRandom];
        
        for(int i = 0; i < Venta.length; i++){
            Venta [i] = r.nextInt(1000) + 1;
        }
        System.out.println("Las ventas en total son :" + Venta.length);
        
        for(int i = 0; i < Venta.length; i++){
            System.out.println("Venta numero: " + i + ": " + Venta[i] );
        }
        
        int TotalVenta = 0;
        
        for(int v : Venta){
            TotalVenta += v;
            
        }
        System.out.println("Total de ventas:" + TotalVenta);
        
        double VentaProm = (double) TotalVenta / Venta.length;
        
        System.out.println("Promedio de venta:" + VentaProm);
        
        System.out.println("");
        
        ClaseVenta z = new ClaseVenta(Venta);
        int suma = z.sumaV();
        int VMA = z.VentaAlta();
        int VMB = z.VentaBaja();
        double PV = z.PromedioVenta();
        int NMCAP = z.NumeroMasCercanoAlPromedio();
        
        System.out.println("La suma de la ventas es :" + suma);
        System.out.println("La venta mas alta es :" + VMA);
        System.out.println("La venta mas baja es :" + VMB);
        System.out.println("El promedio de venta es :" + PV);
        System.out.println("El numero mas cercano al promedio es :" + NMCAP);
        
        z.OrdenarAsendente();
        System.out.println("Orden de venta ascendente :");  
        for(int v : Venta){
            System.out.println(v);
        }
        z.OrdenarDesendente();
        System.out.println("Orden de venta desendente:");
        for(int v : Venta){
            System.out.println(v);
        }
        z.Desordenar();
        System.out.println("Ventas desordenadas");
        for(int v : Venta){
            System.out.println(v);
        }
    }
    
}

