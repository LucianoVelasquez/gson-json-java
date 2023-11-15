package com.jsontest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.jsontest.der.Countries;
import com.jsontest.der.Country;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException
    {
        //Funciona con la clase clientes.
        /* Gson gson = new Gson(); //Creamos ojbeto para serealizar
        FileReader file = new FileReader("src\\main\\db.json"); //Cargamos el Json

        Clientes datoClientes = gson.fromJson(file, Clientes.class);

        for(Integer i = 0; i < datoClientes.clientes.size();i++){

            System.out.println(datoClientes.clientes.get(i));
            
        } */

        //Instancia para la transformacion.
        Gson gson = new Gson();
        //Ruta del archivo
        FileReader file = new FileReader("C:\\Users\\lucia\\Desktop\\Peoyects\\jsontest\\db.json");
        //De Json a Objeto
        Countries datos = gson.fromJson(file, Countries.class); 

        for(Integer i = 0; i < datos.getCountries().size(); i++){
            //System.out.println(datos.getCountries().get(i));
            System.out.println("Id: "+datos.getCountries().get(i).getTld());
            System.out.println("Name: "+datos.getCountries().get(i).getName().getCommon());
            System.out.println("capital: "+datos.getCountries().get(i).getCapital());
            System.out.println("Population: "+datos.getCountries().get(i).getPopulation());
            System.out.println("Area: "+datos.getCountries().get(i).getArea());
            System.out.println("region: "+datos.getCountries().get(i).getRegion());
            System.out.println("subregion: "+datos.getCountries().get(i).getSubregion());
            System.out.println("Continents: "+datos.getCountries().get(i).getContinents().get(0));
            System.out.println("Flags: "+datos.getCountries().get(i).getFlags().getPng());
            System.out.println("-------------------------------------------------------------------------------");
        }

        System.out.println( "Fin programa" );
    }
}
