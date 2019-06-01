package lab6_miguelblancoo;

import java.util.ArrayList;

public class Pelicula {

    private String nombre;
    private int duracion;
    private String categoria;
    private String actores;
    private String directores;
    private String compania;
    private String idioma;
    private boolean doblaje;
    private boolean subtitulos;

    public Pelicula() {
    }

    public Pelicula(String nombre, int duracion, String categoria, String actores, String directores, String compania, String idioma, boolean doblaje, boolean subtitulos) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.categoria = categoria;
        this.actores = actores;
        this.directores = directores;
        this.compania = compania;
        this.idioma = idioma;
        this.doblaje = doblaje;
        this.subtitulos = subtitulos;
    }

    

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getDirectores() {
        return directores;
    }

    public void setDirectores(String directores) {
        this.directores = directores;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isDoblaje() {
        return doblaje;
    }

    public void setDoblaje(boolean doblaje) {
        this.doblaje = doblaje;
    }

    public boolean isSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(boolean subtitulos) {
        this.subtitulos = subtitulos;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", duracion=" + duracion + ", categoria=" + categoria + ", actores=" + actores + ", directores=" + directores + ", compania=" + compania + ", idioma=" + idioma + ", doblaje=" + doblaje + ", subtitulos=" + subtitulos + '}';
    }

}
