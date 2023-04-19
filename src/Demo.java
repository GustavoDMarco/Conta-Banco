public class Demo{
    public static void main (String[] args){
       
        Conta c1 = new Conta();
        c1.pagarMensal();
        c1.abrirConta("CP","Gustavo");
        c1.depositar(500);
        c1.pagarMensal();
        c1.fecharConta();
        c1.sacar(650);
        c1.sacar(630);
        c1.fecharConta();

        System.out.println("\n");

        Conta c2 = new Conta();
        c2.pagarMensal();
        c2.abrirConta("CC","Ana");
        c2.depositar(500);
        c2.pagarMensal();
        c2.fecharConta();
        c2.sacar(650);
        c2.sacar(538);
        c2.fecharConta();
    }
}