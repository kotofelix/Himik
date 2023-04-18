package himik;

public class Fire extends NatureElement {
    public Fire() {
        super("Fire");
    }

    @Override
    public NatureElement connect(NatureElement element) {
        if (element instanceof Air) {
            System.out.println("Fire + Air = Energy");
            return new Energy();
        } else if (element instanceof Earth) {
            System.out.println("Fire + Earth = Lava");
            return new Lava();
        } else if (element instanceof Water) {
            System.out.println("Fire + Water = Steam");
            return new Steam();
        } else {
            System.out.println("Нет нового элемента");
            return null;
        }
    }

}
