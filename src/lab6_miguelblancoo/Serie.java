package lab6_miguelblancoo;

import java.util.ArrayList;

public class Serie {

    private String nombre;
    private int duracion;
    private String categorias;
    private String actores ;
    private int temporadas;
    private String productora;
    private String idiomaor;
    private boolean doblaje;
    private boolean subtitulos;

    public Serie() {
    }

    public Serie(String nombre, int duracion, String categorias, String actores, int temporadas, String productora, String idiomaor, boolean doblaje, boolean subtitulos) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.categorias = categorias;
        this.actores = actores;
        this.temporadas = temporadas;
        this.productora = productora;
        this.idiomaor = idiomaor;
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

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getIdiomaor() {
        return idiomaor;
    }

    public void setIdiomaor(String idiomaor) {
        this.idiomaor = idiomaor;
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
        return "Series{" + "nombre=" + nombre + ", duracion=" + duracion + ", categorias=" + categorias + ", actores=" + actores + ", temporadas=" + temporadas + ", productora=" + productora + ", idiomaor=" + idiomaor + ", doblaje=" + doblaje + ", subtitulos=" + subtitulos + '}';
    }

}
