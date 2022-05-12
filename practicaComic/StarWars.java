package Trabajos.practicaComic;

import imonsh.Colors;
import imonsh.Screen;

public class StarWars extends comic {
    public StarWars (String franquicia, String titulo, String fechaPublicacion){
        super(franquicia, titulo, fechaPublicacion);
    }

    public void ejec(Screen scr){
        scr.setVisible(true);
        scr.setBounds(200,0,550,700);
        for (int i=1; i <=26; i++){
            scr.cls();
            scr.out(showMessage(),"Helvetica",28, Colors.BalticSea);
            scr.showImage(""+i+".jpeg");
            try{
                Thread.sleep(3000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
