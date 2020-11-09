import java.util.function.Function;
interface Somme {
    Function<A, B> SommInt;
    Function<Double, Double> SommeDouble;
    Function<Long, Long> SommeLong;
    Function<String, String> SommeString;

}