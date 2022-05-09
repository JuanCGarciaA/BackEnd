package Trabajos.PracticaMultiverse;

public class SpiderMan {
    private String nombre, genero, alias, universo;

    public SpiderMan(String nombre, String genero, String alias, String universo){
        this.nombre = nombre;
        this.genero = genero;
        this.alias = alias;
        this.universo = universo;
    }

    public String getNombre(){ return nombre; }
    public String getGenero(){ return genero; }
    public String getAlias(){ return alias; }
    public String getUniverso(){ return universo; }

    public boolean setNombre(){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setGenero(){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        } else
            return false;
    }

    public boolean setAlias(){
        if(!alias.isEmpty()){
            this.alias = alias;
            return true;
        } else
            return false;
    }

    public boolean setUniverso(){
        if(!universo.isEmpty()){
            this.universo = universo;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return
                "Nombre: "+nombre+"\n"+
                "Genero: "+genero+"\n"+
                "Alias: "+alias+"\n"+
                "Universo: "+universo+"\n";
    }


}
