public class TreeSet {
    java.util.TreeSet<String> tree = new java.util.TreeSet<>();

    public void add(String hobby) {
        tree.add(hobby);
    }

    public boolean contains(String hobby) {
        return tree.contains(hobby);
    }

    public void remove(String hobby) {
        tree.remove(hobby);
    }

    public int size() {
        return tree.size();
    }

    public void clear() {
        tree.clear();
    }

    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("Hunting");
        treeSet.add("Skiing");
        treeSet.add("Running");
        treeSet.add("Racing");
        treeSet.add("Reading");
        treeSet.add("Writing");
        treeSet.add("Coding");
        treeSet.add("Swimming");
        treeSet.add("Sleeping");

        System.out.println("\nAll Hobbies: " + treeSet.tree + "\n");
        for (int i = 0; i < treeSet.size(); i++) {
            System.out.println((i + 1) + ". " + treeSet.tree.toArray()[i]);
        }

        System.out.println("\nIs 'Running' present: " + treeSet.contains("Running"));
        System.out.println("Is 'Sleeping' present: " + treeSet.contains("Sleeping"));
        System.out.println("Tree size: " + treeSet.size());

        System.out.println("Removing 'Sleeping'");
        treeSet.remove("Sleeping");
        System.out.println("Tree size after removing 'Sleeping': " + treeSet.size());

        System.out.println("\nSorting in descending order: ");
        for (int i = 0; i < treeSet.size(); i++) {
            System.out.println((i + 1) + ". " + treeSet.tree.descendingSet().toArray()[i]);
        }

        System.out.println("Polling the first element: " + treeSet.tree.pollFirst());
        System.out.println("Polling the last element: " + treeSet.tree.pollLast());
        System.out.println("Tree size after polling: " + treeSet.size());
        System.out.println("subset: " + treeSet.tree.subSet("Racing", "Skiing"));
    }
}
