package Trabajos.practicaMona;

class octoCat{
    String nombre, aparencia, actividad;
    int ID;
    octoCat(String nombre,String aparencia,String actividad, int ID){
        this.nombre = nombre;
        this.aparencia = aparencia;
        this.actividad = actividad;
        this.ID = ID;

        System.out.println("Nombre: "+nombre+"\n"+
                "ID: "+ID+"\n"+
                "Aparencia: "+aparencia+"\n"+
                "Actividad: "+actividad);
    }
}

class SuperOctocat extends octoCat {
    SuperOctocat(String nombre,String aparencia, String actividad, int ID){
        super(nombre,aparencia,actividad,ID);
    }
    void disfrutar(){
        System.out.println("Estamos listos comunidad Github!!!!!\n");
    }
}

class grinch extends octoCat{
    grinch(String nombre, String aparencia, String actividad, int ID){
        super(nombre,aparencia,actividad,ID);
    }
    void navid(){ System.out.println("Soy el grinch\n"); }
}

class kenobi extends octoCat{
    String bando;
    kenobi(String nombre, String aparencia, String actividad, String bando, int ID){
        super(nombre,aparencia,actividad,ID);
        this.bando = bando;
        System.out.println("Soy un: "+bando);
    }
    void force(){ System.out.println("The force be with you\n"); }
}

class iron extends octoCat{
    int trajes;
    iron(String nombre, String aparencia, String actividad, int ID, int trajes){
        super(nombre,aparencia,actividad,ID);
        this.trajes = trajes;
        System.out.println("Tengo :"+trajes+" trajes");
    }

    void pelear(){
        System.out.println("Vengadores unidos\n");
    }
}

class heisen extends octoCat{
    heisen(String nombre, String aparencia, String actividad, int ID){
        super(nombre,aparencia,actividad,ID);
    }
    void cocinar(){
        System.out.println("Nunca le mientas a un mentiroso\n");
    }
}

class miner extends octoCat{
    miner(String nombre, String aparencia, String actividad, int ID){
        super(nombre,aparencia,actividad,ID);
    }
    void oro(){ System.out.println("He encontrado oro!\n"); }

    void plata(){ System.out.println("He encontrado plata!\n");}
}

class testOctocat{
    public static void main(String[] args) {
        SuperOctocat octoOr = new SuperOctocat("Original","Estilo original","Acompañar a la comunidad",1);
        octoOr.disfrutar();

        grinch Grinch = new grinch("Grinchtocar","Tengo un traje de Santa Claus","Robar la navidad",109);
        Grinch.navid();

        kenobi Kenobi = new kenobi("Octobi Wan Catnobi","Tengo una bata cafe y un sable","Mantener el equilibrio de la fuerza","Jedi", 3);
        Kenobi.force();

        iron IronC = new iron("IronCat","Traje super poderoso","Proteger la tierra",24,85);
        IronC.pelear();

        heisen Heisen = new heisen("Heisencat","Bata amarilla","Cocinar meta",76);
        Heisen.cocinar();

        miner Miner = new miner("Minertocat","Ropa de mineria","Encontrar metales valiosos",115);
        Miner.oro();
        Miner.plata();

    }
}
