public class Animal {
    // overriden method
    public String makeSound() {
        return ("The animal makes a sound.");
    }
}

class Eagle extends Animal {
    // overriding method
    public String makeSound() {
        return ("Eagle says: chirp chirp");
    }

    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        System.out.println(eagle.makeSound());
    }
}

class Fox extends Animal {
    // overriden method
    public String makeSound() {
        return ("Fox says: waa-waa");
    }

    public static void main(String[] args) {
        Fox fox = new Fox();
        System.out.println(fox.makeSound());
    }
}