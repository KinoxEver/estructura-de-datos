package pkg7502310015_ever_palomo_estructura_de_datos_act1_2024_1;

import java.util.Arrays;
import java.util.Random;

public class ClaseVenta {
    
    int [] venta;
    
    public ClaseVenta (int [] venta){
        this.venta = venta;
            
    }
    
    public int sumaV (){
        int suma = 0;
        
        for(int v: venta){
            suma += v;
            
        }
        return suma;    
    }
    
    public int VentaAlta (){
        int VentaAlta = Integer.MIN_VALUE;
        
        for(int VA: venta){
            if(VA > VentaAlta){
                VentaAlta = VA;
            }
        }
        return VentaAlta;
    }
    
    public int VentaBaja(){
        int VentaBaja = Integer.MAX_VALUE;
        
        for(int VB: venta){
            if(VB < VentaBaja){
                VentaBaja = VB;
            }
        }
        return VentaBaja;
    }
    public double PromedioVenta(){
        int PromedioVenta = sumaV ();
        
        return (double) PromedioVenta / venta.length;
    }
    public int NumeroMasCercanoAlPromedio(){
        double Promedio = PromedioVenta();
        
        int NMCAP = venta [0];
        
        double DiferenciaMenor = Math.abs(venta[0] - Promedio);
        
        for(int NP : venta){
            double diferencia = Math.abs(NP - Promedio);
            if(diferencia < DiferenciaMenor){
                DiferenciaMenor = diferencia;
                NMCAP = NP;
            }
        }
        return NMCAP;
    }
    public void OrdenarAsendente(){
        Arrays.sort(venta);
    }
    public void OrdenarDesendente(){
        Arrays.sort(venta);
        reverseArray(venta);
    }
    public void reverseArray(int [] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int rA = arr [left];
            arr [left] = arr [right];
            arr [right] = rA;
            left++;
            right--;
        }
    }
    public void Desordenar(){
        Random JATPM = new Random();
        for(int i = venta.length - 1; i > 0; i --){
            int j = JATPM.nextInt(i + 1);
            int x = venta [i];
            venta [i] = venta [j];
            venta [j] = x;
        }
        
    }
    public void ParesImpares(){
        Arrays.sort(venta);
        int [] pares = new int [venta.length];
        int [] impares = new  int [venta.length];
        int indPares = 0;
        int indImpares = 0;
        for(int v : venta){
            if(v % 2 == 0){
                pares [indPares ++] = v;
                
            }
            else{
                impares [indImpares ++] = v;
            }
        }
        System.arraycopy(impares, 0, venta, indPares, indImpares);
        System.arraycopy(pares, 0, venta, 0, indPares);
        
    }
}
