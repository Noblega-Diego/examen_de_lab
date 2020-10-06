/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author diego
 */
public class DDJJStockAgroquimico {
    private int anionDeclaracion;
    private int mesDeclaracion;
    private double totalKilosLitros;
    private String empresa;
    private long cuit;
    private String[][] detallesAgroquimico;

    
    
    
    
    
    public void setNumeroAgroquimico(int espacio, int numero){
        detallesAgroquimico[espacio][0] = String.valueOf(numero);
    }
    public void setNombreAgroquimico(int espacio, String nombre){
        detallesAgroquimico[espacio][1] = nombre;
    }
    public void setCapacidadAgroquimico(int espacio, double capacidad){
        detallesAgroquimico[espacio][2] = String.valueOf(capacidad);
    }
    public void setCantidadAgroquimico(int espacio, int cantidad){
        detallesAgroquimico[espacio][3] = String.valueOf(cantidad);
    }
    
    public int getAnionDeclaracion() {
        return anionDeclaracion;
    }

    public void setAnionDeclaracion(int anionDeclaracion) {
        this.anionDeclaracion = anionDeclaracion;
    }

    public int getMesDeclaracion() {
        return mesDeclaracion;
    }

    public void setMesDeclaracion(int mesDeclaracion) {
        this.mesDeclaracion = mesDeclaracion;
    }

    public double getTotalKilosLitros() {
        return totalKilosLitros;
    }

    public void setTotalKilosLitros(double totalKilosLitros) {
        this.totalKilosLitros = totalKilosLitros;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String[][] getDetallesAgroquimico() {
        return detallesAgroquimico;
    }

    public void setDetallesAgroquimico(String[][] detallesAgroquimico) {
        this.detallesAgroquimico = detallesAgroquimico;
    }
    
}
