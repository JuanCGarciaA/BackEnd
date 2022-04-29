package Trabajos.practicaHarry.SettersYGetters;

//Setter y getters
public class CharHP {
    public static void main(String[] args) {
        Harry();
        Albus();
        Hagrid();
        Snape();
        Hermione();
    }


    public static void Harry(){
        PersonajesHP HarryPotter = new PersonajesHP();
        HarryPotter.setNombre("Harry James Potter");
        HarryPotter.setCasa("Gryffindor");
        HarryPotter.setGenero("Masculino");
        HarryPotter.setPatronus("Ciervo");
        HarryPotter.setBoggart("Dementores");

        System.out.print(HarryPotter.printCharacter());
    }

    public static void Albus(){
        PersonajesHP AlbusDumbledore = new PersonajesHP();
        AlbusDumbledore.setNombre("Albus Percival Wulfric Brian Dumbledore");
        AlbusDumbledore.setCasa("Gryffindor");
        AlbusDumbledore.setGenero("Masculino");
        AlbusDumbledore.setPatronus("Phoenix");
        AlbusDumbledore.setBoggart("El cuerpo muerto de su hermana Ariana.");

        System.out.print(AlbusDumbledore.printCharacter());
    }

    public static void Hagrid(){
        PersonajesHP hagrid = new PersonajesHP();
        hagrid.setNombre("Rubeus Hagrid");
        hagrid.setCasa("Gryffindor");
        hagrid.setGenero("Masculino");
        hagrid.setPatronus("No tiene");
        hagrid.setBoggart("Lord Voldemort");

        System.out.print(hagrid.printCharacter());
    }

    public static void Snape(){
        PersonajesHP snape = new PersonajesHP();
        snape.setNombre("Severus Snape");
        snape.setCasa("Slytherin");
        snape.setGenero("Masculino");
        snape.setPatronus("Cierva");
        snape.setBoggart("Lord Voldemort");

        System.out.print(snape.printCharacter());
    }

    public static void Hermione(){
        PersonajesHP hermione = new PersonajesHP();
        hermione.setNombre("Hermione Jean Granger");
        hermione.setCasa("Gryffindor");
        hermione.setGenero("Femenino");
        hermione.setPatronus("Nutria");
        hermione.setBoggart("El fracaso");

        System.out.print(hermione.printCharacter());
    }


}
