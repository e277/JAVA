import java.util.Arrays;

public class Q1Sets {
	protected Integer[] arr1 = { 3, 2, 1, 9, 6, 4, 0 };
	protected Integer[] arr2 = { 3, 1, 9, 5, 2, 0, 7 };
	protected Integer[] arr3 = { 3, 2, 1, 5, 7, 9, 11, 4 };

	java.util.Set<Integer> set1 = new java.util.HashSet<Integer>(Arrays.asList(arr1));
	java.util.Set<Integer> set2 = new java.util.HashSet<Integer>(Arrays.asList(arr2));
	java.util.Set<Integer> set3 = new java.util.HashSet<Integer>(Arrays.asList(arr3));

	public void printSet(java.util.Set<Integer> set, String msg) {
		System.out.println(msg);
		for (Integer i : set) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Q1Sets q1 = new Q1Sets();
		q1.printSet(q1.set1, "Set 1");
		q1.printSet(q1.set2, "Set 2");
		q1.printSet(q1.set3, "Set 3");

		System.out.println("\nSet 1 union Set 2: ");
		q1.printSet(q1.set1.stream().collect(java.util.stream.Collectors.toSet()), "Set 1 union Set 2");
		System.out.println("\nSet 1 intersection Set 2: ");
		q1.printSet(q1.set1.stream().filter(q1.set2::contains).collect(java.util.stream.Collectors.toSet()),
				"Set 1 intersection Set 2");
		// System.out.println("\nSet 1 difference Set 2: ");
		// q1.printSet(q1.set1.stream().filter(q1.set2::contains).collect(java.util.stream.Collectors.toSet()),
		// "Set 1 difference Set 2");
		System.out.println("\nSet 1 symmetric difference Set 2: ");
		q1.printSet(q1.set1.stream().filter(q1.set2::contains).collect(java.util.stream.Collectors.toSet()),
				"Set 1 symmetric difference Set 2");

		System.out.println("\nSet 1 union Set 3: ");
		q1.printSet(q1.set1.stream().collect(java.util.stream.Collectors.toSet()), "Set 1 union Set 3");
		System.out.println("\nSet 1 intersection Set 3: ");
		q1.printSet(q1.set1.stream().filter(q1.set3::contains).collect(java.util.stream.Collectors.toSet()),
				"Set 1 intersection Set 3");
		// System.out.println("\nSet 1 difference Set 3: ");
		// q1.printSet(q1.set1.stream().filter(q1.set3::contains).collect(java.util.stream.Collectors.toSet()),
		// "Set 1 difference Set 3");
		System.out.println("\nSet 1 symmetric difference Set 3: ");
		q1.printSet(q1.set1.stream().filter(q1.set3::contains).collect(java.util.stream.Collectors.toSet()),
				"Set 1 symmetric difference Set 3");

		System.out.println("\nSet 2 union Set 3: ");
		q1.printSet(q1.set2.stream().collect(java.util.stream.Collectors.toSet()), "Set 2 union Set 3");
		System.out.println("\nSet 2 intersection Set 3: ");
		q1.printSet(q1.set2.stream().filter(q1.set3::contains).collect(java.util.stream.Collectors.toSet()),
				"Set 2 intersection Set 3");
		// System.out.println("\nSet 2 difference Set 3: ");
		// q1.printSet(q1.set2.stream().filter(q1.set3::contains).collect(java.util.stream.Collectors.toSet()),
		// "Set 2 difference Set 3");
		System.out.println("\nSet 2 symmetric difference Set 3: ");
		q1.printSet(q1.set2.stream().filter(q1.set3::contains).collect(java.util.stream.Collectors.toSet()),
				"Set 2 symmetric difference Set 3");

	}
}
