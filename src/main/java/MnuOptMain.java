
/**
 * PROGRAM: MnuOptMain
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public enum MnuOptMain {

    EDITOR_CRE("Create editor"), EDITOR_DEL("Delete editor"),
    EDITOR_LIST("List editors"), NEWS_LIST("List news"),
    EDITOR_SAL("Type editors' salary"), NEWS_MNGMT("News utilities"),
    AUTOMATIC("Automatic process"), EXIT("Exit");

    private final String description;

    // Constructor del enum
    MnuOptMain(String d) {
        this.description = d;
    }

    public String getDescription() {
        return description;
    }

    public static void viewMenu() {
        System.out.println(System.lineSeparator() + "EDITORS" + System.lineSeparator());
        for (MnuOptMain o : MnuOptMain.values()) {
            System.out.println(o.ordinal() + 1 + ". " + o.getDescription());
        }
        System.out.println(System.lineSeparator() + "Choose an option: ");
    }
}
