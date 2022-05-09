package Trabajos.PracticaMultiverse;

import Semana2.Hilos.TestS;
import imonsh.Screen;

public class Multiverse {
    public static void main(String[] args) throws InterruptedException{
        TestJessicaDrew();
        testSpiderMan();
        testMiles();
    }

    public static void TestJessicaDrew() throws InterruptedException{
        Screen screen = new Screen();
        UltimateBlackWidowJD JessicaDrew = new UltimateBlackWidowJD(
                "Jessica Drew",
                "Femenino",
                "Ultimate Black Widow",
                "Tierra-1610");

        Runnable habilidad = new Runnable() {
            @Override
            public void run() {
                try{
                    JessicaDrew.TelarañaOrganica(screen);
                    Thread.sleep(3000);

                    JessicaDrew.DurabilidadSobrehumana(screen);
                    Thread.sleep(3000);

                    JessicaDrew.Trepamuros(screen);
                    Thread.sleep(3000);
                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread habilidadJD = new Thread(habilidad);
        habilidadJD.start();
    }

    public static void testSpiderMan() throws InterruptedException{
        Screen screen = new Screen();
        SpiderManPP PeterParker = new SpiderManPP(
                "Peter Benjamin Parker",
                "Masculino",
                "Spider-Man",
                "Tierra-616");

        Runnable habilidad = new Runnable() {
            @Override
            public void run() {
                try {
                    PeterParker.sentidoAracnido(screen);
                    Thread.sleep(3000);

                    PeterParker.fotógrafoExperto(screen);
                    Thread.sleep(3000);

                    PeterParker.inteligenciaDeGenio(screen);
                    Thread.sleep(3000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread habilidadPP = new Thread(habilidad);
        habilidadPP.start();
    }

    public static void testMiles() throws InterruptedException{
        Screen screen = new Screen();
        MilesMorales MilesMorales = new MilesMorales(
                "Miles Morales",
                "Masculino",
                "Spider-Man",
                "Tierra-1610");

        Runnable habilidad = new Runnable() {
            @Override
            public void run() {
                try{
                    MilesMorales.explosionDeEnergia(screen);
                    Thread.sleep(3000);

                    MilesMorales.rayoVenenoso(screen);
                    Thread.sleep(3000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread habilidadMM = new Thread(habilidad);
        habilidadMM.start();
    }

}
