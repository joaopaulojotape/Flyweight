import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();
    public static Flyweight getFlyweight(String Chave, String valor) {
        
        if (Chave.startsWith("Nao Distribuido")) {
            flyweights.put(Chave, new ConcNaoDistribuido(valor));
        } else {
            if (!flyweights.containsKey(Chave)) {
                flyweights.put(Chave, new ConFlyweight(valor));
            }
        }

        return (Flyweight) flyweights.get(Chave);
    }
}