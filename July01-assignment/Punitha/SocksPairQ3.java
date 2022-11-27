public class SocksPairQ3 {
    public static void main(String[] args) {
        int[] array_of_socks = { 1, 2, 1, 2, 1, 3, 2 };
        int count = 0, color;

        for (int i = 0; i < array_of_socks.length; i++) {
            for (int j = i + 1; j < array_of_socks.length; j++) {
                if (array_of_socks[i] == array_of_socks[j]) {
                    count++;
                }
            }
            if (count == 2) {
                color = array_of_socks[i];
                // System.out.println("Color " + color + " is repeated " + count + "times");
                System.out.println("Color " + color + " is a " + "pair");
            }
            count = 0;
        }
    }
}