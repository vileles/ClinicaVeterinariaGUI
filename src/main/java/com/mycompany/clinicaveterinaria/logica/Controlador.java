
package com.mycompany.clinicaveterinaria.logica;

import com.mycompany.clinicaveterinaria.persistencia.ControladorPersistencia;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Controlador {
    
   ControladorPersistencia controlPersis = new ControladorPersistencia();

    public void guardar(String color, String DNI, String direccion, String nombreDuenio, String edad, 
            String especie, String nombre, String peso, String raza, String sexo, String telefono) {
        //Creamos el dueño y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombreDuenio(nombreDuenio);
        duenio.setTelefono(telefono);
        duenio.setDNI(DNI);         
        duenio.setDireccion(direccion);
        
        //Creamos la mascota y asignamos sus valores
        Mascota masco = new Mascota();
        masco.setColor(color);
        masco.setEdad(0);
        masco.setEspecie(especie);
        masco.setNombre(nombre);
        masco.setPeso(0);
        masco.setRaza(raza);
        masco.setSexo(sexo);
        masco.setUnduenio(duenio);
        
        controlPersis.guardar(duenio, masco);
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int id_duenio) {
        controlPersis.borrarMascota(id_duenio);
    }

  

    public Mascota traerMascota(int id_duenio) {
        return controlPersis.traerMascota(id_duenio);
        
    }

    public void modificarMascota(Mascota masco, String color, String DNI, String direccion, String nombreDuenio, String edad, 
            String especie, String nombre, String peso, String raza, String sexo, String telefono) {
        
        masco.setColor(color); 
        masco.setEdad(0);
        masco.setEspecie(especie);
        masco.setNombre(nombre);
        masco.setPeso(0);
        masco.setRaza(raza);
        masco.setSexo(sexo);
        //modificamos mascota
        controlPersis.modificarMascota(masco);
        //Seteamos nuevos valores del dueño
        Duenio dueno = this.buscarDuenio(masco.getUnduenio().getId_duenio());
        dueno.setDNI(DNI);
        dueno.setDireccion(direccion);
        dueno.setNombreDuenio(nombreDuenio);
        dueno.setTelefono(telefono);
        //llamar a modificar dueño
        this.modificarDuenio(dueno);
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }
}
