/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.doniajuana;

/**
 *
 * @author Manuel
 */
public class Producto {
    
        private int id, cant, cantmax, cantmin;
        private float precio;
        private String clasificacion, descripcion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getCantmax() {
        return cantmax;
    }

    public void setCantmax(int cantmax) {
        this.cantmax = cantmax;
    }

    public int getCantmin() {
        return cantmin;
    }

    public void setCantmin(int cantmin) {
        this.cantmin = cantmin;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nID: ");
        sb.append(id);
        sb.append("\nDescripcion: ");
        sb.append(descripcion);
        sb.append("\nClasificacion: ");
        sb.append(clasificacion); 
        sb.append("\nPrecio: ");
        sb.append(precio);
        sb.append("\nCantidad: ");
        sb.append(cant);
        sb.append("\nCantdad Maxima: ");
        sb.append(cantmax);
        sb.append("\nCantidad Minima: ");
        sb.append(cantmin);
        return sb.toString();
    }
}
