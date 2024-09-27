/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperImpresion;
import Logica_Negocio.Banano;
import Logica_Negocio.Naranja;
import Logica_Negocio.Producto;
import java.util.ArrayList;

/**
 *
 * @author 1061688186
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Producto objBanano =  new Banano();
        Producto objnaranja = new Naranja();
        ArrayList<Producto> listapro = new ArrayList<>();
        listapro.add(objBanano);
        listapro.add(objnaranja);
        HelperImpresion.ImprimirInformacionProducto(listapro);
    }
    
}
