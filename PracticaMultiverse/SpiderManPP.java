package Trabajos.PracticaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class SpiderManPP extends SpiderMan implements SpiderManCallbacks {
    public SpiderManPP (String nombre, String genero, String alias, String universo){
        super(nombre, genero, alias, universo);
    }
    @Override
    public void inteligenciaDeGenio(Screen sc) {
        sc.setVisible(true);
        sc.out(showMessage(),"Helvetica",28, Colors.BlueGrey);
        sc.out("Inteligencia de genio\n");
        sc.showImage("Peter_inventos.jpg");
        sc.setBounds(100,100,500,500);
    }

    @Override
    public void sentidoAracnido(Screen sc) {
        sc.cls();
        sc.repaint();
        sc.out(showMessage(),"Helvetica",28, Colors.BlueGrey);
        sc.out("Sentido aracnido\n");
        sc.showImage("Spiderman_sentido_aracnido.jpg");
        sc.setBounds(100,100,500,500);
    }

    @Override
    public void fotógrafoExperto(Screen sc) {
        sc.cls();
        sc.repaint();
        sc.out(showMessage(),"Helvetica",28, Colors.BlueGrey);
        sc.out("Fotografo experto\n");
        sc.showImage("spiderman_fotografo.jpg");
        sc.setBounds(100,100,500,500);
    }
}
