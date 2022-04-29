package Trabajos.practicaHarry.SettersYGetters;

public class PersonajesHP {
    public String casa,genero,nombre,boggart,patronus;

    public String getCasa(){ return casa;}
    public String getGenero(){ return genero;}
    public String getNombre(){ return nombre;}
    public String getBoggart(){return boggart;}
    public String getPatronus(){ return patronus;}

    public boolean setCasa(String casa){
        if (!casa.isEmpty()){
            this.casa = casa;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }

    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart){
        if (!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus){
        if (!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

    public String printCharacter(){
        return "Nombre: "+nombre+"\n"+
                "Genero: "+genero+"\n"+
                "Casa: "+casa+"\n"+
                "Boggart: "+boggart+"\n"+
                "Patronus: "+patronus+"\n"+
                "~> ~> ~> ~> ~> ~> ~> ~>\n";

    }
}
