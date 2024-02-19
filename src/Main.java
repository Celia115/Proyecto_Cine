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
    }
}