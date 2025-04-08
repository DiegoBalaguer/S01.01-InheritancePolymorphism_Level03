
/**
 * PROGRAM: MnuOptNews
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public enum MnuOptNews {

    NEWS_CRE_SO("Create a soccer article"),
    NEWS_CRE_BA("Create a basketball article"),
    NEWS_CRE_TE("Create a tennis article"),
    NEWS_CRE_F1("Create an F1 article"),
    NEWS_CRE_MO("Create a motorcycling article"),
    NEWS_TYP_TEXT("Type article's text"),
    NEWS_DEL("Delete article"),
    NEWS_LIST("List news"), NEWS_PUNT("Calculate points news"),
    NEWS_PRICE("Calculate price news"), EXIT("Back to menu");

    private final String description;

    // Constructor del enum
    MnuOptNews(String d) {
        this.description = d;
    }

    public String getDescription() {
        return description;
    }

    public static void viewMenu(String editor) {
        System.out.println(System.lineSeparator() + "NEWS by editor: " + editor + System.lineSeparator());
        for (MnuOptNews o : MnuOptNews.values()) {
            System.out.println(o.ordinal() + 1 + ". " + o.getDescription());
        }
        System.out.println(System.lineSeparator() + "Choose an option: ");
    }
}
