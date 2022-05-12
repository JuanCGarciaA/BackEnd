package Trabajos.practicaComic;

import imonsh.Screen;

public class comic {
    private String franquicia, titulo, fechaPublicacion;

    public comic(String franquicia, String titulo, String fechaPublicacion){
        this.franquicia = franquicia;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getFranquicia() { return franquicia; }
    public String getTitulo(){ return titulo; }
    public String getFechaPublicacion(){ return fechaPublicacion; }

    public boolean setFranquicia(){
        if (!franquicia.isEmpty()){
            this.franquicia = franquicia;
            return true;
        }else
            return false;
    }

    public boolean setTitulo(){
        if (!titulo.isEmpty()){
            this.titulo = titulo;
            return true;
        }else
            return false;
    }

    public boolean setFechaPublicacion(){
        if (!fechaPublicacion.isEmpty()){
            this.fechaPublicacion = fechaPublicacion;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                "Franquicia: "+franquicia+"\n"+
                        "Título: "+titulo+"\n"+
                        "Fecha de publicación: "+fechaPublicacion+"\n";
    }

}
