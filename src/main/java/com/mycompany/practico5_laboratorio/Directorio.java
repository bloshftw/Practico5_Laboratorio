
package com.mycompany.practico5_laboratorio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
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

    
public Contacto buscarContacto(long input_telefono){
     Iterator<Long> keyIterator = contactos.keySet().iterator();
        
        while (keyIterator.hasNext()) {
            Long key = keyIterator.next();
            if (key.equals(input_telefono)) {
                System.out.println("Clave " + key + " encontrada");
                System.out.println("DNI: "+contactos.get(key).getDni());
                System.out.println("Nombre: "+contactos.get(key).getNombre());
                System.out.println("Apellido: "+contactos.get(key).getApellido());
                System.out.println("Direccion: "+contactos.get(key).getDireccion());
                System.out.println("Ciudad: "+contactos.get(key).getCiudad());
                return contactos.get(key);
            } else {
                return null;
            }
        }
        return null;
}

public Set<Long> buscarTelefono(String apellido){

    Set<Long> telefonosEncontrados = new HashSet<>();
    
    for (Entry<Long, Contacto> entry : contactos.entrySet()){
    
    Contacto contacto = entry.getValue();
    
    if (contacto.getApellido().equalsIgnoreCase(apellido)){
    
        telefonosEncontrados.add(entry.getKey());
    
    }
        
    }
    return telefonosEncontrados;
    
}
   
   


 


public ArrayList<Contacto> buscarContactos(String ciudad) {
    ArrayList<Contacto> contactosEncontrados = new ArrayList<>();

    // Iteramos sobre los valores del TreeMap (que son objetos de tipo Contacto)
    for (Contacto contacto : contactos.values()) {
        if (contacto.getCiudad().equalsIgnoreCase(ciudad)) {
            contactosEncontrados.add(contacto);
        }
    }

    return contactosEncontrados;
}



public void borrarContacto(long input_telefono){
    Iterator<Long> keyIterator = contactos.keySet().iterator();
        
        while (keyIterator.hasNext()) {
            Long key = keyIterator.next();
            if (key.equals(input_telefono)) {
                contactos.remove(key);
                
            } 
        }
}
}
