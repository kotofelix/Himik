package himik;

public class Air extends NatureElement {
    public Air() {
        super("Air");
    }

    @Override
    public NatureElement connect(NatureElement element) {
        if (element instanceof Air) {
            System.out.println("Air + Air = Pressure");
            return new Pressure();
        } else if (element instanceof Earth) {
            System.out.println("Air + Earth = Dust");
            return new Dust();
        } else if (element instanceof Fire) {
            System.out.println("Air + Fire = Energy");
            return new Energy();
        } else if (element instanceof Water) {
            System.out.println("Air + Water = Rain");
            return new Rain();
        } else {
            System.out.println("Нет нового элемента");
            return null;
        }

    }

}