import org.junit.Test;
import static org.junit.Assert.*;
public class FlyweightTest {

    @Test
    public void testFlyweight() {
        Flyweight flyweight1 = FlyweightFactory.getFlyweight("chave1", "valor1");
        Flyweight flyweight2 = FlyweightFactory.getFlyweight("chave2", "valor2");
        Flyweight flyweight3 = FlyweightFactory.getFlyweight("chave1", "valor3");

        Flyweight NaoDistribuido1 = FlyweightFactory.getFlyweight("Nao Distribuido1",
                "valor1");
        Flyweight NaoDistribuido2 = FlyweightFactory.getFlyweight("Nao Distribuido2",
                "valor2");
        Flyweight NaoDistribuido3 = FlyweightFactory.getFlyweight("Nao DistribuidoKey1",
                "valor3");

        assertNotEquals(flyweight1, flyweight2);
        assertEquals(flyweight1, flyweight3);
        assertNotEquals(flyweight2, flyweight3);

        assertNotEquals(NaoDistribuido1, NaoDistribuido2);
        assertNotEquals(NaoDistribuido1, NaoDistribuido3);
        assertNotEquals(NaoDistribuido2, NaoDistribuido3);

    }
}