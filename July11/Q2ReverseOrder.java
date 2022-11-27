public class Q2ReverseOrder {
    // set the default value of the variable
    protected String sentence = "A quick brown fox jumps over the lazy dog";
    protected String reversedSentence = "";

    // constructor
    public Q2ReverseOrder() {
    }

    // getter
    public String getSentence() {
        return sentence;
    }

    // setter
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    // getter
    public String getReversedSentence() {
        return reversedSentence;
    }

    // setter
    public void setReversedSentence(String reversedSentence) {
        this.reversedSentence = reversedSentence;
    }

    // print reversed string
    public void printReversedStr() {
        System.out.println("From Based class: " + getReversedSentence());
    }
}

class Main extends Q2ReverseOrder {
    // constructor
    public Main(String sentence) {
        this.sentence = sentence;
    }

    // method to reverse the string
    public final void reverseStr() {
        String[] strArray = getSentence().split(" ");
        for (int i = 0; i < strArray.length; i++) {
            reversedSentence = strArray[i] + " " + reversedSentence;
        }
    }

    // print reversed string
    public void printReversedStr() {
        System.out.println("From derived class: " + getReversedSentence());
    }

    public static void main(String[] args) {
        // create an object of the class name q2
        Main q2 = new Main("A chicken is a bird");
        // create an object of the class name q3
        Main q3 = new Main("I am a student");
        // call the method to reverse the string
        q2.reverseStr();
        q3.reverseStr();
        // print the reversed string
        q2.printReversedStr();
        q3.printReversedStr();
    }
}