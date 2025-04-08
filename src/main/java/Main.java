import java.util.ArrayList;

/**
 * PROGRAM: Main
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class Main {

    private static ArrayList<Editor> editors = new ArrayList<>();

    public static void main(String[] args) {

        process();

    }

    private static void process() {

        loadInitValues();

        int answer = 0;
        MnuOptMain idMenu = null;

        do {
            MnuOptMain.viewMenu();
            answer = Utils.valueInt("");
            try {
                idMenu = MnuOptMain.values()[answer - 1];
                switch (idMenu) {
                    case EXIT -> System.out.println("Bye...");
                    case AUTOMATIC -> automatic();
                    case EDITOR_CRE -> editorCreate();
                    default -> {
                        if (editors.isEmpty()) {
                            System.out.println("No editors registered into the system.");
                        } else {
                            menu(idMenu);
                        }
                    }
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: The value is wrong.");
            }

        } while (idMenu != MnuOptMain.EXIT);

        Utils.closeScanner();
    }

    private static void menu(MnuOptMain idMenu) {

        switch (idMenu) {
            case EDITOR_DEL -> editorDelete();
            case EDITOR_LIST -> editorsList();
            case NEWS_LIST -> newsList();
            case EDITOR_SAL -> editorIntroSalary();
            case NEWS_MNGMT -> newsMngm();

            default -> System.out.println("Error: The value is wrong.");
        }
    }

    private static void loadInitValues() {

        Editor.setSalary(35000);

        ListsPricesPoints.loadTablePricesSoccer();
        ListsPricesPoints.loadTablePointsSoccer();
        ListsPricesPoints.loadTablePricesBasket();
        ListsPricesPoints.loadTablePointsBasket();
        ListsPricesPoints.loadTablePricesTennis();
        ListsPricesPoints.loadTablePointsTennis();
        ListsPricesPoints.loadTablePricesF1();
        ListsPricesPoints.loadTablePointsF1();
        ListsPricesPoints.loadTablePricesMotorCycle();
        ListsPricesPoints.loadTablePointsMotorCycle();
    }

    private static void newsMngm() {

        System.out.println(System.lineSeparator() + "MANAGEMENT NEWS.................." + System.lineSeparator());

        editorsListNum();
        int id = 0;
        boolean exit = false;
        do {
            id = Utils.valueInt("Type editor's id: ") - 1;

            if (id >= 0 && id < editors.size()) {
                MnuOptNewsMain menu = new MnuOptNewsMain(editors.get(id));
                exit = true;
            } else {
                System.out.println("The editor's id is wrong.");
            }
        } while (!exit);
    }


    private static void automatic() {
        editors = Test.editorsLoad();
        System.out.println("Load data test ok.");
    }

    private static void editorCreate() {

        System.out.println(System.lineSeparator() + "CREATE EDITOR.................." + System.lineSeparator());

        String name = Utils.valueString("Type editor's name: ");
        String dni = Utils.valueString("Type editor's dni: ");

        editors.add(new Editor(name, dni));
        System.out.println("New editor registered into the system.");
    }

    private static void editorDelete() {

        System.out.println(System.lineSeparator() + "DELETE EDITOR.................." + System.lineSeparator());

        String name = Utils.valueString("Type editor's name to delete: ");

        Editor search = editorSearch(name);

        if (search == null) {
            System.out.println("The editor named: " + name + " not into the system.");
        } else {
            System.out.println(
                    "The editor is deleted from the system: " + System.lineSeparator() + search);
            editors.remove(search);
        }
    }

    private static void editorIntroSalary() {

        System.out.println(System.lineSeparator() + "EDITOR INTRO SALARY.................." + System.lineSeparator());

        double salary = Utils.valueDouble("Type editor's salary: ");

        Editor.setSalary(salary);

        System.out.println("The new editors' salary is: " + salary + "€.");
    }

    private static Editor editorSearch(String s) {

        for (Editor search : editors) {
            if (search.getName().equalsIgnoreCase(s)) {
                return search;
            }
        }
        return null;
    }

    private static void editorsList() {

        System.out.println(System.lineSeparator() + "EDITORS LIST..................");

        System.out.println("  \t" + makeFirstEditors());

        for (Editor e : editors) {
            System.out.println("**\t" + makeLineEditors(e.listEditor()));
        }
    }

    private static void newsList() {

        System.out.println(System.lineSeparator() + "NEWS LIST..................");

        System.out.println(Utils.formatToChars("Editor", 16) + " \t " + MnuOptNewsMain.makeFirstNews());

        for (Editor e : editors) {
            if (!e.getNews().isEmpty()) {
                for (News n : e.getNews()) {
                    System.out.println(Utils.formatToChars(e.getName(), 16) + " \t " + MnuOptNewsMain.makeLineNews(n.listNews()));
                }
            }

        }
    }

    private static void editorsListNum() {

        System.out.println(System.lineSeparator() + "EDITORS LIST WITH ID..................");
        System.out.println("Index \t" + makeFirstEditors());
        for (int i = 0; i < editors.size(); i++) {
            System.out.println((i + 1) + ".- " + editors.get(i).getName());
        }
    }

    private static String makeFirstEditors() {

        ArrayList<String> l = new ArrayList<>();

        l.add("Name");
        l.add("DNI");
        l.add("Salary");
        l.add("Points");
        l.add("Prices");

        return makeLineEditors(l);
    }

    private static String makeLineEditors(ArrayList<String> w) {

        int i = 0;

        return Utils.formatToChars(w.get(i++), 16) + " \t " +
                Utils.formatToChars(w.get(i++), 15) + " \t " +
                Utils.formatToChars(w.get(i++), 10) + " \t " +
                Utils.formatToChars(w.get(i++), 10) + " \t " +
                Utils.formatToChars(w.get(i), 10);
    }
}