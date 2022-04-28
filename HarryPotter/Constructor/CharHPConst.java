package Trabajos.HarryPotter.Constructor;

public class CharHPConst {
    public static void main(String[] args) {
        harry();
        lily();
        ron();
        luna();
        newt();
    }

    private static void harry() {
        PersonajeHPConst harry = new PersonajeHPConst("Harry Potter", "Masculino", "Gryffindor", "Dementor", "Ciervo");
        System.out.println(harry.printCharacterConst());
    }

    private static void lily() {
        PersonajeHPConst lily = new PersonajeHPConst("Lily J. Potter", "Femenino", "Gryffindor", "Su hermana petunia(posiblemente)", "Cierva");
        System.out.println(lily.printCharacterConst());
    }

    private static void ron() {
        PersonajeHPConst ron = new PersonajeHPConst("Ronald Bilius Weasley", "Masculino", "Gryffindor", "La araña Aragog", "Perro(Jack Russell terrier)");
        System.out.println(ron.printCharacterConst());
    }

    private static void luna() {
        PersonajeHPConst luna = new PersonajeHPConst("Luna Lovegood", "Femenino", "Ravenclaw", "Ver morir a su padre.(posiblemente)", "Liebre");
        System.out.println(luna.printCharacterConst());
    }

    private static void newt() {
        PersonajeHPConst newt = new PersonajeHPConst("Newton Artemis Fido Scamander", "Masculino", "Hufflepuff", "Trabajo de oficina", "Cuerpoespin(posiblemente)");
        System.out.println(newt.printCharacterConst());
    }

}
