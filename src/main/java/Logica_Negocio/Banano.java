/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1061688186
 */
public class Banano extends Producto{

    public Banano() {
        super();
    }
    
    

    public Banano(int precio) {
        super(precio);
    }
    
    
    @Override
    public String InformacionProducto() {
        return "El valor del producto bbanano es: "+"\t"+this.getPrecio();
    }

    
    
    
}
