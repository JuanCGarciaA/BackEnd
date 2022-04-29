package Trabajos.practicaHarry.Constructor;

//Constructor
public class PersonajeHPConst {
    public String casa,genero,nombre,boggart,patronus;

    public PersonajeHPConst(String nombre, String genero, String casa, String boggart, String patronus) {
        this.nombre = nombre;
        this.genero = genero;
        this.casa = casa;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public String printCharacterConst(){
        return "Nombre: "+nombre+"\n"+
                "Genero: "+genero+"\n"+
                "Casa: "+casa+"\n"+
                "Boggart: "+boggart+"\n"+
                "Patronus: "+patronus+"\n"+
                "~> ~> ~> ~> ~> ~> ~> ~>\n";

    }

}
