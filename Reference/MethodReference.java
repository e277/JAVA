import java.util.Random;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

class MethodReference {
    public static void main(String[] args) {
        // 1
        DoubleBinaryOperator exponential = Math::pow;
        double result = exponential.applyAsDouble(3, 2);
        System.out.println(result);

        // 2
        Random random = new Random();
        IntSupplier randomNumber = random::nextInt;
        System.out.println(randomNumber);

        // 3
        Function<Random, Integer> intSupplier = Random::nextInt;
        System.out.println(intSupplier);

        // 4
        Supplier<Random> supplier = Random::new;
        System.out.println(supplier.get().nextInt());
        Random random2 = supplier.get();
    }
}