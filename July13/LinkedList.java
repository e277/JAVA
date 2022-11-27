public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> languages = new java.util.LinkedList<>();
        languages.addFirst("Patios");
        languages.addLast("Tamil");
        languages.addLast("English");
        languages.addLast("Hindi");
        languages.addLast("French");
        languages.addLast("Arabic");
        languages.addLast("Russian");

        System.out.println("====================================================================================");
        System.out.println("The list of languages is: " + languages);
        System.out.println("====================================================================================");

        languages.removeFirst();
        System.out.println("After removing first language: " + languages);
        System.out.println("====================================================================================");

        languages.removeLast();
        System.out.println("After removing last language: " + languages);
        System.out.println("====================================================================================");

        System.out.println("Get first language: " + languages.getFirst());
        System.out.println("====================================================================================");

        System.out.println("Get last language: " + languages.getLast());
        System.out.println("====================================================================================");
    }
}
