//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean cine = true;
        int elegir;

        /**
         * @param Cine Es el objeto cine que tiene sus clases que son el nombre del cine el aforo y las salas
         */
        Cine nombreCine = new Cine("Cinesa", 120);


        /**
         * @param Pelicula Es la clase donde metemos todas las pelis que hay
         */
        Pelicula pelicula1 = new Pelicula("El Rey León", 90);
        Pelicula pelicula2 = new Pelicula("Enredados", 100);
        Pelicula pelicula3 = new Pelicula("Gru mi villano favorito", 95);
        Pelicula pelicula4 = new Pelicula("A tres metros sobre el cielo", 120);
        Pelicula pelicula5 = new Pelicula("Frozen", 102);
        Pelicula pelicula6 = new Pelicula("La Sociedad de la nieve", 144);
        Pelicula pelicula7 = new Pelicula("Toc Toc", 90);
        Pelicula pelicula8 = new Pelicula("Wonder", 120);
        Pelicula pelicula9 = new Pelicula("Los peores años de mi vida", 92);
        Pelicula pelicula10 = new Pelicula("Culpa mia", 120);

        /**
         * @param Sala Es la clase donde metemos todas las salas que hay en el cine
         */
        Sala sala1 = new Sala(1, pelicula1, 8, 10);
        Sala sala1_1 = new Sala(2,pelicula2, 8, 10);
        Sala sala2 = new Sala(2, pelicula3, 13, 6);
        Sala sala2_1 = new Sala(2,pelicula4, 13, 6);
        Sala sala3 = new Sala(3, pelicula5, 11, 14);
        Sala sala3_1 = new Sala(3, pelicula6, 11, 14);
        Sala sala4 = new Sala(4, pelicula7, 9, 5);
        Sala sala4_1 = new Sala(4, pelicula8, 9, 5);
        Sala sala5 = new Sala(5, pelicula9, 8, 20);
        Sala sala5_1 = new Sala(5, pelicula10, 8, 20);

        nombreCine.agregarSala(sala1);
        nombreCine.agregarSala(sala2);
        nombreCine.agregarSala(sala3);
        nombreCine.agregarSala(sala4);
    }
}