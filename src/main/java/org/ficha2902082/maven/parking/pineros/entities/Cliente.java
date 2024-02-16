package org.ficha2902082.maven.parking.pineros.entities;

import java.util.ArrayList;
import java.util.List;

//import javax.security.auth.x500.X500Principal;

public class Cliente {

    public String nombre;
    public String apellidos;
    public TipoDocumento tipoDocumento;
    public Long numeroDocumento;
    public Long celular;

    public List <Carro> losCarros = new ArrayList<Carro>(); 


    // metodo: Añadir carro 
    // Definirlo: (Firma del metodo)
    // Modificar acesso
    // Tipo de dato
    // parametros (inputs): Tipo y Nombre del parametro
    public void addCar (Carro x) { // No retoner nada

        this.losCarros.add(x);

    } 

    public void addCar (String pla, TipoVehiculo TV) {
        Carro x = new Carro();
        x.Placa = pla;
        x.tipoVehiculo = TV;
        this.losCarros.add(x);

    } 

    //Sobrecarga de metodos:
    // es una clase se permiten metodos con el mismo nombre pero con mas informacion
    // Instanciar -> Construir  
}
