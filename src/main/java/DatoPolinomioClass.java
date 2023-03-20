public class DatoPolinomioClass implements DatoPolinomio{

    private int valor;
    private int termino;

    public DatoPolinomioClass(int valor, int termino){
        this.valor = valor;
        this.termino = termino;
    }

    @Override
    public double getValor(){
        return this.valor;
    }

    @Override
    public int getTermino(){
        return this. termino;
    }

    @Override
    public void setValor(int valor){
        this.valor = valor;
    }
    @Override
    public void setTermino(int termino){
        this.termino = termino;
    }
}
