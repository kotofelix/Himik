package himik;

public class Alchemy {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Введите другие элементы");
        }
        NatureElement[] elements = new NatureElement[args.length];
        for (int i = 0; i < args.length; i++) {
            if (NatureElement.create(args[i]) == null) {
            }
            elements[i] = NatureElement.create(args[i]);
        }
        if (elements.length % 2 == 0) {
            for (int i = 0; i < elements.length; i += 2) {
                elements[i].connect(elements[i + 1]);
            }
        } else {
            for (int i = 0; i < elements.length - 1; i += 2) {
                elements[i].connect(elements[i + 1]);
            }
        }
    }
}



