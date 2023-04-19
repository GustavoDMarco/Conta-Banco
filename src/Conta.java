public class Conta {
    
    public int numConta;
    protected String tipo;
    private String nome;
    private float saldo;
    private boolean status;

    public Conta() {
        status = false;
        saldo = 0;
    }

    public int getNumConta(){
        return numConta;
    }

    public void setNumConta(int numConta){
        this.numConta= numConta;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo)
    {
        this.saldo= saldo;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status= status;
    }

    public void abrirConta(String tipo, String nome){
        setTipo(tipo);
        setNome(nome);
        setStatus(true);

        if (getTipo() == "CC") {
            setSaldo(50);
            System.out.println("Conta Corrente de " +getNome() + " aberta!");
        }else if (getTipo() == "CP" || getTipo() == "cp") {
            setSaldo(150);
            System.out.println("Conta Poupança de " +getNome() + " aberta!");
        }
    }

    public void fecharConta(){
        if (getSaldo() > 0) {
            System.out.println("Saque todo seu dinheiro para fechar a conta!");
        }else if (getSaldo()==0) {
            setStatus(false);
            System.out.println("Conta de "+getNome() + " fechada");
        }else{
            System.out.println("Pague seus debitos para fechar a conta!");
        }
        
    }

    public void depositar(float valor){
        if (getStatus()==true) {
            setSaldo(getSaldo()+valor);
            System.out.println("Deposito realizado. Seu saldo é: " +getSaldo());
        } else {
            System.out.println("Abra sua conta antes de depositar!");
        }
    }

    public void sacar(float valor){

        if (getStatus()==true) {

            if (getSaldo()<valor) {
                System.out.println("Valor de saque indisponivel. Seu Saldo atual é: "+getSaldo());
            }else{
                setSaldo(getSaldo()-valor);
                System.out.println("Saldo atual: "+getSaldo());
            }

        }else{
            System.out.println("Abra sua conta antes de sacar!");
        }
    }

    public void pagarMensal(){
        if (getStatus()==true) {

            if (getTipo() == "cc" || getTipo()== "CC") {
                setSaldo(getSaldo()-12);
                System.out.println("Mensalidade paga. Saldo atual: "+getSaldo());
            } else if(getTipo() == "cp" || getTipo()== "CP"){
                setSaldo(getSaldo()-20);
                System.out.println("Mensalidade paga. Saldo atual: "+getSaldo());
            }
        }else{
            System.out.println("A conta não está aberta.");
        }
    }

}   

