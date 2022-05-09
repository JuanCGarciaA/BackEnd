package Trabajos.PracticaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class MilesMorales extends SpiderMan implements MilesMoralesCallbacks{
    public MilesMorales (String nombre, String genero, String alias, String universo){
        super(nombre, genero, alias, universo);
    }

    @Override
    public void rayoVenenoso(Screen sc) {
        sc.setVisible(true);
        sc.out(showMessage(),"Helvetica",28, Colors.BlueGrey);
        sc.out("Rayo Venenoso\n");
        sc.showImage("Miles_Rayo.jpg");
        sc.setBounds(100,100,500,500);
    }

    @Override
    public void explosionDeEnergia(Screen sc) {
        sc.cls();
        sc.repaint();
        sc.out(showMessage(),"Helvetica",28, Colors.BlueGrey);
        sc.out("Explosion de energia\n");
        sc.showImage("ExplosionMiles.jpg");
        sc.setBounds(100,100,500,500);
    }
}
