public class Pelicula {
    /**
     * Tenemos el titulo de la peli.
     *
     * @return El titulo de la peli
     */
    private String titulo;
    /**
     * La duracion de la peli en minutos
     *
     * @return duracion de la peli
     */
    private int duracion;

    Scanner entrada = new Scanner(System.in);

    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
