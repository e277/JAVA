public class Q1ShortestSubStr {
    // set the default value of the variable
    protected String str, minStr = "";
    protected int minLen, count = 0;

    // constructor
    public Q1ShortestSubStr(String str) {
        this.str = str;
        minLen = str.length();
    }

    // method to find the shortest substring
    public void findShortestSubStr() {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String subStr = str.substring(i, j);
                if (isUnique(subStr) && subStr.length() < minLen) {
                    minLen = subStr.length();
                    minStr = subStr;
                }
            }
        }
    }

    // method to check if the string is unique
    public boolean isUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    // getter
    public String getMinStr() {
        return minStr;
    }

    // getter
    public int getMinLen() {
        return minLen;
    }

    // main method
    public static void main(String[] args) {
        Q1ShortestSubStr q1 = new Q1ShortestSubStr("redblueredblue");
        q1.findShortestSubStr();
        System.out.println("Shortest Substring is: " + q1.getMinStr());
        System.out.println("Length of Shortest Substring is: " + q1.getMinLen());
    }
}