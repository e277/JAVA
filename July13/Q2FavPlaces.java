public class Q2FavPlaces {
    public static void main(String[] args) {
        // LinkedList
        java.util.LinkedList<String> my_favourite_places_to_visit_jamaica = new java.util.LinkedList<>();
        my_favourite_places_to_visit_jamaica.addFirst("Blue and John Crow Mountains National Park");
        my_favourite_places_to_visit_jamaica.add("Negril Beaaches");
        my_favourite_places_to_visit_jamaica.add("Port Antonio");
        my_favourite_places_to_visit_jamaica.add("Martha Brae River");
        my_favourite_places_to_visit_jamaica.addLast("Doctor's Cave Beach, Montego Bay");

        System.out.println("====================================================================================");
        System.out.println("Places to visit in Jamaica: ");
        for (int i = 0; i < my_favourite_places_to_visit_jamaica.size(); i++) {
            System.out.println("Place " + (i + 1) + ": " + my_favourite_places_to_visit_jamaica.get(i));
        }
        System.out.println("====================================================================================");

        // ArrayList
        java.util.ArrayList<String> my_favourite_places_to_visit_india = new java.util.ArrayList<>();
        my_favourite_places_to_visit_india.add("Dhanushkodi – Beautiful Abandoned Town");
        my_favourite_places_to_visit_india.add("Kanyakumari – Southernmost Tip Of India");
        my_favourite_places_to_visit_india.add("Trichy – Historical Temples");
        my_favourite_places_to_visit_india.add("Madurai – Stunning Architecture ");
        my_favourite_places_to_visit_india.add("Mahabalipuram – Magnificent Carved Temples");
        System.out.println("_Places to visit in India: ");
        for (int i = 0; i < my_favourite_places_to_visit_india.size(); i++) {
            System.out.println("Place " + (i + 1) + ": " + my_favourite_places_to_visit_india.get(i));
        }
        System.out.println("====================================================================================");
        System.out.println("====================================================================================");

        // joining LinkedList to ArrayList
        my_favourite_places_to_visit_india.addAll(my_favourite_places_to_visit_jamaica);
        System.out.println("All my favourite places to visit: ");
        for (int i = 0; i < my_favourite_places_to_visit_india.size(); i++) {
            System.out.println("Place " + (i + 1) + ": " + my_favourite_places_to_visit_india.get(i));
        }
        System.out.println("====================================================================================");
    }
}