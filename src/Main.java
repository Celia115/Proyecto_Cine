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

        while (true) {
            System.out.println("\nBienvenido al Cine " + nombreCine.getNombre());
            System.out.println("1. Ver las salas y sus pel�culas");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Ver disponibilidad de asientos en una sala");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    nombreCine.mostrarSalas();
                    break;
                case 2:
                    System.out.print("Ingrese el número de sala: ");
                    int numSala = entrada.nextInt();
                    Sala salaSeleccionada = nombreCine.getSalas().get(numSala -1);

                    if (salaSeleccionada != null) {
                        System.out.println("Ha seleccionado la sala " + salaSeleccionada.getNumero() + ": " + salaSeleccionada.getPelicula().getTitulo());
                        System.out.print("Ingrese la fila del asiento: ");

                        int fila = entrada.nextInt() -1 ;
                        System.out.print("Ingrese la columna del asiento: ");

                        int columna = entrada.nextInt() -1;
                        entrada.nextLine();
                        System.out.print("Ingrese su email: ");

                        String email = entrada.nextLine();
                        salaSeleccionada.reservarButacas(fila, columna, email);
                    } else {
                        System.out.println("La sala seleccionada no existe.");
                    }

                    break;
                case 3:
                    System.out.print("Ingrese el n�mero de sala para ver disponibilidad de asientos: ");

                    int numSalaConsulta = entrada.nextInt();
                    Sala salaConsulta = nombreCine.getSalas().get(numSalaConsulta -1);

                    if (salaConsulta != null) {
                        System.out.println("Disponibilidad de asientos en la sala " + salaConsulta.getNumero() + ":");
                        boolean[][] butacas = salaConsulta.getButacas();

                        for (int i = 0; i < butacas.length; i++) {
                            for (int j = 0; j < butacas[i].length; j++) {

                                if (butacas[i][j] == true) {
                                    System.out.print("[L]");
                                }else {
                                    System.out.print("[O]");
                                }
                            }
                            System.out.println();
                        }

                    } else {
                        System.out.println("La sala seleccionada no existe.");
                    }

                    break;
                case 4:
                    System.out.println("Gracias por usar nuestro servicio. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}