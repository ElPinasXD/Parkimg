package org.ficha2902082.maven.parking.pineros;

import org.ficha2902082.maven.parking.pineros.entities.Carro;
import org.ficha2902082.maven.parking.pineros.entities.Cliente;
import org.ficha2902082.maven.parking.pineros.entities.TipoDocumento;
import org.ficha2902082.maven.parking.pineros.entities.TipoVehiculo;

public class Main {
    public static void main(String[] args) {
        //Instancias de Carro
        Carro carro1 = new Carro(); //Cree un objeto
        carro1.Placa = "SDL 123";
        carro1.tipoVehiculo = TipoVehiculo.Taxi;

        Carro carro2 = new Carro();
        carro2.Placa = "PAP 456";
        carro2.tipoVehiculo = TipoVehiculo.Carro;

        Cliente cliente1 = new Cliente();
        cliente1.nombre = "Esteban";
        cliente1.apellidos = "Piñeros Peña";
        cliente1.celular = 3028469975L;
        cliente1.numeroDocumento = 1029142018L;
        cliente1.tipoDocumento = TipoDocumento.CC;

        // Carros
        cliente1.addCar(carro2);
        cliente1.addCar("KFC 305", TipoVehiculo.Moto);
        //cliente1.addCar(carro1);

        System.out.println("Cliente: " + cliente1.nombre);
        System.out.println("Apellidos: " + cliente1.apellidos);
        System.out.println("Celular: " + cliente1.celular);
        System.out.println("Tipo de Identificacion: " + cliente1.tipoDocumento);
        System.out.println("documento: " + cliente1.numeroDocumento);
        System.out.println("Tiene un: " + carro1.tipoVehiculo);
        System.out.println("Placa: " + carro1.Placa);

        System.out.println("______________");

        for( Carro x : cliente1.losCarros ){
            System.out.println("Placa: " + x.Placa);
            System.out.println("______________");
            System.out.println("Tipo: " + x.tipoVehiculo);
    }

        }
            

}