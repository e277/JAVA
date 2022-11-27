public class LinkedHashSet {
    java.util.Set<String> hobbies = new java.util.LinkedHashSet<>();

    public void add(String hobby) {
        hobbies.add(hobby);
    }

    public boolean contains(String hobby) {
        return hobbies.contains(hobby);
    }

    public void remove(String hobby) {
        hobbies.remove(hobby);
    }

    public int size() {
        return hobbies.size();
    }

    public void clear() {
        hobbies.clear();
    }

    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("Hunting");
        linkedHashSet.add("Fishing");
        linkedHashSet.add("Skiing");
        linkedHashSet.add("Running");

        System.out.println("\nAll Hobbies: " + linkedHashSet.hobbies + "\n");
        for (int i = 0; i < linkedHashSet.size(); i++) {
            System.out.println((i + 1) + ". " + linkedHashSet.hobbies.toArray()[i]);
        }

        System.out.println("\nIs 'Running' present: " + linkedHashSet.contains("Running"));
        System.out.println("Is 'Racing' present: " + linkedHashSet.contains("Racing"));
        System.out.println("Set size: " + linkedHashSet.size());

        System.out.println("Removing Fishing");
        linkedHashSet.remove("fishing");
        System.out.println("Set size after removing Fishing: " + linkedHashSet.size());

        System.out.println("Clearing set");
        linkedHashSet.clear();
        System.out.println("Set size after clearing set: " + linkedHashSet.size());

    }
}
