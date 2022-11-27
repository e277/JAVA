public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> languages = new java.util.ArrayList<String>();
        languages.add("Patios");
        languages.add("Tamil");
        languages.add("English");
        languages.add("Hindi");
        languages.add("French");
        languages.add("Arabic");
        languages.add("Russian");

        System.out
                .println("====================================================================================");
        System.out.println("The list of languages is: " + languages);
        System.out
                .println("====================================================================================");
        System.out.println("Language at index 0 is: " + languages.get(0));
        System.out
                .println("====================================================================================");
        System.out.println("Language at index 1 is: " + languages.get(1));
        System.out
                .println("====================================================================================");

        languages.set(4, "Spanish");
        System.out.println("Change French to Spanish: " + languages);
        System.out
                .println("====================================================================================");

        System.out.println("Removing Arabic: " + languages.remove("Arabic"));
        System.out
                .println("====================================================================================");
        System.out.println("The list of languages is: " + languages);
        System.out
                .println("====================================================================================");
    }
}