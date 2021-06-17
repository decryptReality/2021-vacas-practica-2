package src.peliculas;

import src.tienda.IngresoDatos;

public class VectorPeliculas
{
    private Pelicula[] peliculas = new Pelicula[50];
    private int id;

    VectorPeliculas()
    {
        id = 1;
    }

    void agregarPeliculas(String nombre, int anio, String categoria)
    {
        if (id<=50)
        {
            peliculas[id-1] = new Pelicula(id, nombre, anio, categoria);
            if (id != 50)
            {
                id = id + 1;
            }
        }
        else
        {
            System.out.println("limite de 50 peliculas alcanzado");
        }
    }

    void ingresarPelicula()
    {
        String nombre = IngresoDatos.getNext("ingrese nombre de pelicula");
        int anio = IngresoDatos.getNextInt("ingrese anio de pelicula");
        String categoria = IngresoDatos.getNext("ingrese categoria de pelicula");
        agregarPeliculas(nombre, anio, categoria);
    }

    void mostrarPeliculas()
    {
        System.out.println("Peliculas de memorabilia");
        int i = 0;
        while (i < id)
        {
            System.out.println("-"+i+") "+peliculas[i].getInformacion());
            i = i + 1;
        }

    }
}
