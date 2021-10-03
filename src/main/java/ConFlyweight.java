public class ConFlyweight implements Flyweight {

    private Object pertencente;

    public ConFlyweight(Object pertencente) {
        this.pertencente = pertencente;
    }


    public void op(Object externo) {
    }


    public Object getPertencente() {
        return pertencente;
    }
}
