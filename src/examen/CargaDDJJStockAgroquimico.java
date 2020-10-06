/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class CargaDDJJStockAgroquimico {
    private static String[][] agroquimicos= {{"1001","2EC JEBAGRO","A"},{"1002","D 60 GREEN CROPS","V"},
                          {"1003","ESTER 97","A"},{"1004","AMINA ICONA SL","A"},{"1005","ABAMECTINA AGRO","A"},
                          {"1006","FURACARB 31 TS","R"},{"1007","FURAFARM 48 F","R"},{"1008","ACETOCLOR ASSA", "A"},
                          {"1009","GLIFOSATO ACTIVE SIL","R"},{"1010","ABRIGO PLUS","V"}};
    
    public static void main(String[] args) {
        DDJJStockAgroquimico stockAgroquimico = new DDJJStockAgroquimico();
        boolean datosEstado,cantidadEstado;
        do{
            datosEstado = llenarDatosAgroquimico(stockAgroquimico);
            if(!datosEstado){
                System.out.println("ingrese los datos nuevamente");
            }
        }while (!datosEstado);
        
        do{
            cantidadEstado = pedirCantidadDeAgroquimicos(stockAgroquimico);
            if(!cantidadEstado){
                System.out.println("ingrese la cantidad nuevamente");
            }
        }while (!cantidadEstado);
        
        
        
    }

    public static boolean llenarDatosAgroquimico(DDJJStockAgroquimico stockAgroquimicos){
        Scanner scanner = new Scanner(System.in);
        Date fechaActual = new Date();
        long cuit;
        int anio;
        int mes;
        String empresa;
        System.out.println("*************************************");
        System.out.println("Ingrese los datos de la empresa");
        
        
        System.out.print("cuit:");
        cuit = scanner.nextLong();
        
        if(!(cuit >= 10000000000L && cuit <= 99999999999L)){
            return false;
        }
                              
        System.out.print("año:");
        anio = scanner.nextInt();
        System.out.print("mes:");
        mes = scanner.nextInt();
        if(mes >= 12 && mes <=0){
            return false;
        }
        stockAgroquimicos.setCuit(cuit);
        stockAgroquimicos.setMesDeclaracion(mes);
        stockAgroquimicos.setAnionDeclaracion(anio);
        return true;
    }

    public static boolean pedirCantidadDeAgroquimicos(DDJJStockAgroquimico stockAgroquimicos){
        Scanner scanner = new Scanner(System.in);
        int cantidad;
        System.out.println("ingrese la cntidad de agroquimicos");
        System.out.print("cantidad:");
        cantidad = scanner.nextInt();
        if(cantidad > 0 && cantidad <= 10){
            String[][] detallesagroquimico = new String[cantidad][6];
            stockAgroquimicos.setDetallesAgroquimico(detallesagroquimico);
            return true;
        }else{
            return false;
        }
    }
    
    public static int buquedaDelCodigoAgroqimico(int numero){
        for(int i = 0; i < agroquimicos.length; i++){
            int numeroAgroquimico = Integer.parseInt(agroquimicos[i][0]);
            if(numero == numeroAgroquimico){
                return i;
            }
        }
        return -1;
    }
    
    public static boolean ingresarAgroquimico(DDJJStockAgroquimico stockAgroquimicos){
        Scanner scanner = new Scanner(System.in);
        stockAgroquimicos.getDetallesAgroquimico();
        
        int codigo;
        System.out.print("codigo del agroquimico:");
        codigo = scanner.nextInt();
        int lugar = buquedaDelCodigoAgroqimico(codigo);
        if(lugar == -1){
            return false;
        }else{
            System.out.print("ingrese la capacidad del envase:");
            int capacidad = scanner.nextInt();
            System.out.print("ingrese la cantidad:");
            int cantidad = scanner.nextInt();
            if(agroquimicos[lugar].equals("R")){
                System.out.print("ingrese el numero de lote:");
                int lote = scanner.nextInt();
                
            }else{
                
            }
            int subTotal = capacidad * cantidad;
            stockAgroquimicos.setCantidadAgroquimico(i, cantidad);
        }
        
    }
}
