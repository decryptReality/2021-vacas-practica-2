package src.peliculas;

public class Pelicula
{
    private int id;
    private String nombre;
    private int anio;
    private String categoria;

    public Pelicula(int id, String nombre, int anio, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
        this.categoria = categoria;
    }

    String getInformacion()
    {
        return "nombre: " + nombre + " anio: " + anio + " categoria: " + categoria + " id: " + id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
