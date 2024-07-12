package taller11_ejercicio1;

import java.util.ArrayList;

public class Ejecutar_JuegoRoles {
    public static void main(String[] args) {
        ArrayList<Personaje> personajes = new ArrayList<>();
        personajes.add(new Guerrero(100, 0, 1, 20));
        personajes.add(new Mago(80, 0, 1, 30));
        personajes.add(new Arquero(120, 0, 1, 25));

        for (Personaje personaje1 : personajes) {
            for (Personaje personaje2 : personajes) {
                if (personaje1 != personaje2) {
                    System.out.println("Batalla: " + personaje1.getClass().getSimpleName() + " vs " + personaje2.getClass().getSimpleName());
                    personaje1.atacar(personaje2);
                    System.out.println("Vida del " + personaje2.getClass().getSimpleName() + ": " + personaje2.getVida());
                    personaje2.atacar(personaje1);
                    System.out.println("Vida del " + personaje1.getClass().getSimpleName() + ": " + personaje1.getVida());
                    System.out.println();
                }
            }
        }
    }
}



 abstract class Personaje {
    public int vida;
    public int experiencia;
    public int nivel;

    public Personaje(int vida, int experiencia, int nivel) {
        this.vida = vida;
        this.experiencia = experiencia;
        this.nivel = nivel;
    }

    public abstract void atacar(Personaje otro);
    public abstract void defender(int dato);

    public void subirNivel() {
        experiencia += 10;
        if (experiencia >= nivel * 10) {
            nivel++;
            vida += 10;
        }
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }
}


class Guerrero extends Personaje {
    public int fuerza;

    public Guerrero(int vida, int experiencia, int nivel, int fuerza) {
        super(vida, experiencia, nivel);
        this.fuerza = fuerza;
    }

    @Override
    public void atacar(Personaje otro) {
        System.out.println("Ataque cuerpo a cuerpo");
        otro.defender(fuerza);
    }

    @Override
    public void defender(int dato) {
        vida -= dato;
        System.out.println("Defendiendo con fuerza");
    }

    public int getFuerza() {
        return fuerza;
    }
}


 class Mago extends Personaje {
    public int magia;

    public Mago(int vida, int experiencia, int nivel, int magia) {
        super(vida, experiencia, nivel);
        this.magia = magia;
    }

    @Override
    public void atacar(Personaje otro) {
        System.out.println("Lanzando hechizo");
        otro.defender(magia);
    }

    @Override
    public void defender(int dato) {
        vida -= dato;
        System.out.println("Defendiendo con magia");
    }

    public int getMagia() {
        return magia;
    }
}


class Arquero extends Personaje {
    public int precision;

    public Arquero(int vida, int experiencia, int nivel, int precision) {
        super(vida, experiencia, nivel);
        this.precision = precision;
    }

    @Override
    public void atacar(Personaje otro) {
        System.out.println("Disparando flecha");
        otro.defender(precision);
    }

    @Override
    public void defender(int dato) {
        vida -= dato;
        System.out.println("Defendiendo a distancia");
    }

    public int getPrecision() {
        return precision;
    }
}
