package Trabajos.practicaComic;

import imonsh.Screen;

public class TestComic {
    public static void main(String[] args) throws InterruptedException {
        swComic();
    }

    public static void swComic() throws InterruptedException{
        Screen screen = new Screen();
        StarWars sw = new StarWars(
                "Star Wars",
                "Anakin´s race for freedom",
                "01/Enero/1999"
        );

        Runnable ejecutar = new Runnable() {
            @Override
            public void run() {
                sw.ejec(screen);
            }
        };
        Thread ejecutarSW = new Thread(ejecutar);
        ejecutarSW.start();
    }
}
