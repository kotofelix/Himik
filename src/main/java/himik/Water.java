package himik;

public class Water extends NatureElement {
    public Water() {
        super("Water");
    }

    @Override
    public NatureElement connect(NatureElement element) {
        if (element instanceof Air) {
            System.out.println("Water + Air = Rain");
            return new Rain();
        } else if (element instanceof Earth) {
            System.out.println("Water + Earth = Mud");
            return new Mud();
        } else if (element instanceof Fire) {
            System.out.println("Water + Fire = Steam");
            return new Steam();
        } else if (element instanceof Water) {
            System.out.println("Water + Water = Sea");
            return new Sea();
        } else {
            System.out.println("Нет нового элемента");
            return null;
        }
    }

}
