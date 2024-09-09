
package com.mycompany.practico5_laboratorio;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;


public class Directorio {

private TreeMap<Long, Contacto> contactos;
///private TreeSet<Long> listaTelefono;

    public Directorio(TreeMap<Long, Contacto> contactos) {
        this.contactos = contactos;
    }

public void agregarContacto(Long dni,String nombre, String apellido, String direccion, String ciudad, Long tell){

    Contacto chaval = new Contacto(dni,nombre,apellido,direccion,ciudad);
    contactos.put(tell, chaval);
    for(Entry<Long, Contacto> entry : contactos.entrySet()){
        System.out.println("Clave: "+ entry.getKey()+" ---------- "+ entry.getValue() );
        
    }
}
    
public void buscarContacto(){}

public void buscarTelefono(){}

public void buscarContactos(){}

public void borrarContacto(){}


}
