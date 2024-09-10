
package com.mycompany.practico5_laboratorio;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.swing.JOptionPane;


public class Directorio {

private TreeMap<Long, Contacto> contactos;
private TreeSet<Long> listaTelefono;

    public Directorio() {
        
        this.contactos = new TreeMap<>();
        this.listaTelefono = new TreeSet<>();
        
    }

    public Directorio(TreeMap<Long, Contacto> contactos, TreeSet<Long> listaTelefono) {
        this.contactos = contactos;
        this.listaTelefono = listaTelefono;
        
    }

public void agregarContacto(Long telefono, Contacto chaval){

   if (listaTelefono.contains(telefono)){
       System.out.println("El telefono ya esta registrado..");
   
   } else {
   listaTelefono.add(telefono);
       System.out.println("Se guardo el telefono en el TreeSet correctamente.");
       
       contactos.put(telefono, chaval);
   
    System.out.println("Contacto agregado correctamente con su nro de telefono.!");
       
   } 
   
      
    }

    
public void buscarContacto(long input_telefono){
     Iterator<Long> keyIterator = contactos.keySet().iterator();
        
        while (keyIterator.hasNext()) {
            Long key = keyIterator.next();
            if (key.equals(input_telefono)) {
                System.out.println("Clave " + key + " encontrada, valor: " + contactos.get(key));
                Vista x = new Vista();
                 x.jTDni.setText("DNI:" + contactos.get(key).getDni());
            } else {
                
            }
        }
}

public void buscarTelefono(){}

public void buscarContactos(){}

public void borrarContacto(){}


}
