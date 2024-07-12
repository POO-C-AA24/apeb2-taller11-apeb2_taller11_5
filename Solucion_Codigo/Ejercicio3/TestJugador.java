package proyecto_final2;

import java.util.ArrayList;
import java.util.Arrays;

public class TestJugador {

    public static void main(String[] args) {
        ArrayList<Jugador> equipo = new ArrayList<>();
        ArrayList<Jugador> listaJugador = new ArrayList<>(
            Arrays.asList(new Atacante(70, 10, "Lionel Messi", 10, "121312321", 70),
                          new Defensor(35, 30, "Sergio Ramos", 4, "23323221", 10),
                          new Portero(80, "David de Gea", 1, "12311231", 1))
        );

        for (Jugador jugador : listaJugador) {
            equipo.add(jugador);
        }

        for (Jugador jugador : equipo) {
            System.out.println("Nombre: " + jugador.nombre + ", Valoración: " + jugador.valoracionJugador()
                    + " / Valoracion Goles : " + jugador.ValoracionGoles());
        }
    }
}

abstract class Jugador {

    public String nombre;
    public int dorsal;
    public String rut;
    public int goles;
    public int valorGoles;

    public Jugador(String nombre, int dorsal, String rut, int goles) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.rut = rut;
        this.goles = goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int ValoracionGoles() {
        this.valorGoles = this.goles * 30;
        return this.valorGoles;
    }

    public abstract int valoracionJugador();
}

class Atacante extends Jugador {

    public int pases;
    public int recuperaciones;

    public Atacante(int pases, int recuperaciones, String nombre, int dorsal, String rut, int goles) {
        super(nombre, dorsal, rut, goles);
        this.pases = pases;
        this.recuperaciones = recuperaciones;
    }

    @Override
    public int valoracionJugador() {
        return super.ValoracionGoles() * 30 + this.pases * 2 + this.recuperaciones * 3;
    }
}

class Defensor extends Jugador {

    public int pases;
    public int recuperaciones;

    public Defensor(int pases, int recuperaciones, String nombre, int dorsal, String rut, int goles) {
        super(nombre, dorsal, rut, goles);
        this.pases = pases;
        this.recuperaciones = recuperaciones;
    }

    @Override
    public int valoracionJugador() {
        return super.ValoracionGoles() * 30 + this.pases + this.recuperaciones * 4;
    }
}

class Portero extends Jugador {

    public int paradas;

    public Portero(int paradas, String nombre, int dorsal, String rut, int goles) {
        super(nombre, dorsal, rut, goles);
        this.paradas = paradas;
    }

    @Override
    public int valoracionJugador() {
        return super.ValoracionGoles() * 30 + this.paradas * 5;
    }
}
