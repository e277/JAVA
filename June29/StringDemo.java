public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello, this is a string";

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf('H'));
        System.out.println(str.indexOf('H', 5));
        System.out.println(str.substring(5, 10));
        System.out.println(str.trim());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replace('H', 'J'));
        System.out.println(str.getBytes());
        System.out.println(str.equals("Hello, this is a string"));
        System.out.println(str.equalsIgnoreCase("Hello, this is a string"));
        System.out.println(str.compareTo("Hello, this is a string"));
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.startsWith("Jello"));
        System.out.println(str.endsWith("string"));
    }
}