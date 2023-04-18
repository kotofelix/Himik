package himik;

public abstract class NatureElement {

    public NatureElement(String name) {
        name = name;
    }

  //  public void connect(NatureElement element);
  public abstract NatureElement connect(NatureElement element);

    public static NatureElement create(String name) {
        switch (name.toLowerCase()) {
            case "fire":
                return new Fire();
            case "air":
                return new Air();
            case "earth":
                return new Earth();
            case "water":
                return new Water();
            default:
                System.out.println("Неизвестный элемент");
                return null;
        }
    }

}
