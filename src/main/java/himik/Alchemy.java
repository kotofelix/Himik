package himik;

public class Alchemy {
    public static void main(String[] args) {

            NatureElement[] elements = new NatureElement[args.length];

            for (int i = 0; i < args.length; i++) {
                elements[i] = NatureElement.create(args[i]);
                if (elements[i] == null) {
                    System.out.println("Не удалось создать элемент " + args[i]);
                    System.exit(1);
                }
            }

            boolean elementsChanged = true;
            while (elements.length > 1 && elementsChanged) {
                NatureElement[] newElements = new NatureElement[elements.length / 2];
                int j = 0;
                elementsChanged = false;
                for (int i = 0; i < elements.length; i += 2) {
                    if (i + 1 < elements.length) {
                        NatureElement result = elements[i].connect(elements[i + 1]);
                        if (result != null) {
                            System.out.println(elements[i].getClass().getSimpleName() + " + " + elements[i + 1].getClass().getSimpleName() + " = " + result.getClass().getSimpleName());
                            newElements[j] = result;
                            j++;
                            elementsChanged = true;
                        } else {
                            System.out.println("Нет нового элемента для " + elements[i].getClass().getSimpleName() + " + " + elements[i + 1].getClass().getSimpleName());
                            newElements[j] = elements[i];
                            j++;
                            newElements[j] = elements[i + 1];
                            j++;
                        }
                    } else {
                        newElements[j] = elements[i];
                        j++;
                    }
                }
                elements = newElements;
            }

            System.out.println("Результат: " + elements[0].getClass().getSimpleName());
        }
    }




