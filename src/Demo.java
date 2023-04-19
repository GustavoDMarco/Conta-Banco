public class Demo{
    public static void main (String[] args){
       
        Conta c1 = new Conta();
        c1.abrirConta("CP");
        c1.depositar(500);
        c1.fecharConta();
        c1.sacar(650);
        c1.fecharConta();
        c1.depositar(50);
    }
}