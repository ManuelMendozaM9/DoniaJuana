/*

 */
package mx.uach.doniajuana;

import java.util.*;

/**
 *
 * @author Manuel
 */
public class Principal {
    
    static ArrayList<Producto> producto = new ArrayList<Producto>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        leerProductos();
        System.out.println("\nProductos Introducidos");
        muestra1();
        muestra2();
        muestra3();
        muestra4();
        muestra5();
        
    }
    
    public static void leerProductos() {
        int id, cant, cantmax, cantmin;
        float precio;
        String clasificacion, descripcion;
        
        Producto aux = null;
        int i, N;
        
        do{
            System.out.println("¿Cuantos productos ingresara?");
            do{
                System.out.println("Ingrese al menos 80 productos");
                N = sc.nextInt();
            }while(N>=80);
        }while(N < 0);
        sc.nextLine();
        
        for(i=1;i<=N;i++){
            System.out.println("ID: "+i);
            System.out.println("Descripcion: ");
            descripcion=sc.nextLine();
            System.out.println("Clasificacion: ");
            clasificacion=sc.nextLine();
            System.out.println("Precio: ");
            precio=sc.nextFloat();
            System.out.println("Cantidad: ");
            cant=sc.nextInt();
            System.out.println("Maxima cantidad admitida: ");
            cantmax=sc.nextInt();
            System.out.println("Cantidad minima admitida: ");
            cantmin=sc.nextInt();
            
            producto.add(aux);
        }
    }
    
    //Mostrar todos los productos
    public static void mostrarProductos() {
        for(int i=0;i<producto.size();i++){
            System.out.println(producto.get(i));
        }
    }

/*
    Cada numero es el metodo de muestra respectivamente
1) Número de productos con existencia mayor a 20.
2) Número de productos con existencia menos a 15.
3) Lista de productos con la misma clasificación y precio mayor 15.50
4) Lista de productos con precio mayor a 20.30 y menor a 45.00
5) Número de productos agrupados por su clasificación
*/
    
    public static void muestra1(){
    System.out.println("Productos con existencia mayor a 20");
        for(int i=0;i<producto.size();i++){
            if(producto.get(i).getCant()>20){
                System.out.println(producto.get(i));
            }
        }
    }
    
    public static void muestra2(){
        System.out.println("Productos con existencia menor a 15");
        for(int i=0;i<producto.size();i++){
            if(producto.get(i).getCant()<15){
                System.out.println(producto.get(i));
            }
        }
    }
    
    public static void muestra3(){
        
    }
    
    public static void muestra4(){
        
    }
    
    public static void muestra5(){
        String clasificacion;
        System.out.print("Introduce la clasificacion: ");
        clasificacion = sc.nextLine();
        System.out.println("Productos con la clsificacion " + clasificacion);
        for(int i = 0; i<producto.size(); i++){
            if(producto.get(i).getClasificacion().equalsIgnoreCase(clasificacion))
                System.out.println(producto.get(i));
        }
    }
             
}
