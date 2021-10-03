public class ConcNaoDistribuido implements Flyweight {

    private Object estado;

    public ConcNaoDistribuido(Object estado) {
        this.estado = estado;
    }

    public void op(Object externo) {

    }

    public Object getEstado() {
        return estado;
    }
}