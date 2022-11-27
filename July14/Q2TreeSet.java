import java.util.Arrays;

public class Q2TreeSet {
    protected static String[] set1 = { "Church of God", "Seventh Day Adventist", "Baptist", "Anglican", "Jehovah" };
    protected static String[] set2 = { "Baptist", "Church of God", "Seventh Day", "Anglican" };
    protected static String[] set3 = { "Seventh Day Adventist", "Anglican", "Jehovah" };

    public static void main(String[] args) {

        java.util.TreeSet<String> church1 = new java.util.TreeSet<String>(Arrays.asList(set1));
        java.util.TreeSet<String> church2 = new java.util.TreeSet<String>(Arrays.asList(set2));
        java.util.TreeSet<String> church3 = new java.util.TreeSet<String>(Arrays.asList(set3));

        // union of set 1 and set 2
        java.util.TreeSet<String> union1 = new java.util.TreeSet<String>(church1);
        union1.addAll(church2);
        System.out.println("\nUnion of set 1 and set 2: " + union1);

        // uniion of set1 and set 3
        java.util.TreeSet<String> union2 = new java.util.TreeSet<String>(church1);
        union2.addAll(church3);
        System.out.println("\nUnion of set 1 and set 3: " + union2);

        // intersection of set 1 and set 3
        java.util.TreeSet<String> intersection1 = new java.util.TreeSet<String>(church1);
        intersection1.retainAll(church3);
        System.out.println("\nIntersection of set 1 and set 3: " + intersection1);

        // difference of set2 from set1
        java.util.TreeSet<String> difference1 = new java.util.TreeSet<String>(church2);
        difference1.removeAll(church1);
        System.out.println("\nDifference of set 2 from set 1: " + difference1);
    }
}
