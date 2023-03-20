public class NodoDatoPoliClass implements NodoDatoPoli{
    private DatoPolinomio datoPolinomio;
    private NodoDatoPoli siguienteNodo;

    public NodoDatoPoliClass(DatoPolinomio dato){
        this.datoPolinomio = dato;
        this.siguienteNodo = null;
    }

    public DatoPolinomio getDato(){
        return this.datoPolinomio;
    }
    public NodoDatoPoli getSiguiente(){
        return this.siguienteNodo;
    }
    public void setSiguiente(NodoDatoPoli nodo){
        this.siguienteNodo = nodo;
    }
}
