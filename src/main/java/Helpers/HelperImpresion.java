/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Banano;
import Logica_Negocio.Naranja;
import Logica_Negocio.Producto;
import java.util.ArrayList;

/**
 *
 * @author 1061688186
 */
public class HelperImpresion {
    public static void ImprimirInformacionProducto(ArrayList<Producto> listaproductos) {
        for (int i = 0; i < listaproductos.size(); i++) {
            if (listaproductos.get(i)instanceof Naranja) {
                System.out.println(listaproductos.get(i).InformacionProducto());
            }
            
            if (listaproductos.get(i)instanceof Banano) {
                System.out.println(listaproductos.get(i).InformacionProducto());
            }
            
        }
    }
}
