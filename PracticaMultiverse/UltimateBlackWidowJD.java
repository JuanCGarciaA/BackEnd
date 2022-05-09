package Trabajos.PracticaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class UltimateBlackWidowJD extends SpiderMan implements UltimateBlackWidowCallbacks{

    public UltimateBlackWidowJD (String nombre, String genero, String alias, String universo){
        super(nombre, genero, alias, universo);
    }

    @Override
    public void TelarañaOrganica(Screen sc) {
        sc.setVisible(true);
        sc.out(showMessage(),"Helvetica",28, Colors.BlueGrey);
        sc.out("Telaraña Organica\n");
        sc.showImage("TelaranaOrganica.jpg");
        sc.setBounds(100,100,500,500);
    }

    @Override
    public void DurabilidadSobrehumana(Screen sc) {
        sc.cls();
        sc.repaint();
        sc.out(showMessage(),"Helvetica",28, Colors.BlueGrey);
        sc.out("Durabilidad Sobre Humana\n");
        sc.showImage("DurabilidadSobreHum(Jessica_Drew.png");
        sc.setBounds(100,100,500,500);

    }

    @Override
    public void Trepamuros(Screen sc) {
        sc.cls();
        sc.repaint();
        sc.out(showMessage(),"Helvetica",28, Colors.BlueGrey);
        sc.out("Trepamuros\n");
        sc.showImage("TrepamurosJD.jpg");
        sc.setBounds(100,100,500,500);
    }
}
