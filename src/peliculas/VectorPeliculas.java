package src.peliculas;

import src.tienda.IngresoDatos;

public class VectorPeliculas
{
    private Pelicula[] peliculas = new Pelicula[50];
    private int id;

    public VectorPeliculas() {
        id = 1;
    }

    public void agregarPeliculas(String nombre, int anio, String categoria) {
        if (id <= 50) {
            peliculas[id - 1] = new Pelicula(id, nombre, anio, categoria);
            System.out.println("pelicula agregada con exito");
            if (id != 50) {
                id = id + 1;
            }
        } else {
            System.out.println("limite de 50 peliculas alcanzado");
        }
    }

    public void ingresarPelicula() {
        String nombre = IngresoDatos.getNext("ingrese nombre de pelicula");
        int anio = IngresoDatos.getNextInt("ingrese anio de pelicula");
        String categoria = IngresoDatos.getNext("ingrese categoria de pelicula");
        agregarPeliculas(nombre, anio, categoria);
    }

    public void mostrarPeliculas() {
        System.out.println("Peliculas de memorabilia");
        int i = 0;
        while (i < id) {
            System.out.println(peliculas[i].getInformacion());
            i = i + 1;
        }
    }

    public void ordenarPorNombre(boolean ascendente) {
        boolean cambio = true;
        for (int i = 1; i < (id - 1); i++) {
            for (int j = 0; j < (id - 1 - i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente)
                    cambio = (peliculas[j].getNombre().compareTo(peliculas[j + 1].getNombre()) > 0);
                else
                    cambio = (peliculas[j].getNombre().compareTo(peliculas[j + 1].getNombre()) < 0);

                if (cambio) {
                    //clientes i va antes que clientes j <0 descendente
                    Pelicula aux = peliculas[j];
                    peliculas[j] = peliculas[j + 1];
                    peliculas[j + 1] = aux;
                }
            }
        }
    }
}