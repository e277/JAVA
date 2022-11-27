public class HashSet {
    java.util.Set<Integer> numbers = new java.util.HashSet<>();

    public void add(Integer number) {
        numbers.add(number);
    }

    public boolean contains(Integer number) {
        return numbers.contains(number);
    }

    public void remove(Integer number) {
        numbers.remove(number);
    }

    public int size() {
        return numbers.size();
    }

    public void clear() {
        numbers.clear();
    }

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);

        System.out.println("Is 3 present: " + hashSet.contains(3));
        System.out.println("Is 5 present: " + hashSet.contains(5));
        System.out.println("Set size: " + hashSet.size());

        System.out.println("Removing 3");
        hashSet.remove(3);
        System.out.println("Set size after removal: " + hashSet.size());

        System.out.println("Clearing set");
        hashSet.clear();
        System.out.println("Set size after clearing set: " + hashSet.size());

    }
}