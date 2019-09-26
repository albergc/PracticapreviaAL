/**
 * Created by bp0413 on 26/09/2019.
 */
public class Entero {
    private int valor;
    public Entero(int v){
        this.valor=v;
    }
    public Entero(){
        this.valor=0;
    }
    public void setValor(int v){
        this.valor=v;
    }
    public int getValor(){
        return valor;
    }
    public String toString(){
        String dato=new String();
        dato+=valor;
        return dato;
    }
}
