package src.peliculas;

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
        peliculas[id-1] = new Pelicula(id, nombre, anio, categoria);
    }
}
