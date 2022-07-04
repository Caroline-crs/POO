package Trabalho2;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo, String dono, double saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo = 0;
        this.status = status = false;
    }

    public void mostrarDadosConta() {
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Tipo da conta: " + getTipo());
        System.out.println("Dono da conta: " + getDono());
        System.out.println("Saldo da conta: " + getSaldo());
        System.out.println("Status da conta: " + isStatus());
    }

    public void abrirConta() {
        if (this.tipo == "CC") {
            this.status = true;
            double saldoInicialCC = 50;
            this.saldo += saldoInicialCC;
            System.out.println("Conta corrente criada com: " + this.saldo + " de saldo");
        } else if (this.tipo == "CP") {
            this.status = true;
            double saldoInicialCP = 150;
            this.saldo += saldoInicialCP;
            System.out.println("Conta corrente criada com: " + this.saldo + " de saldo");
        } else {
            System.out.println("O Tipo da conta não é válida");
        }
    }

    public void fecharConta() {
        if (this.saldo == 0) {
            this.status = false;
            System.out.println("A conta foi fechada");
        } else if (saldo > 0) {
            System.out.println("Impossivél fechar a coonta, pois ela tem saldo");
        } else if (saldo < 0) {
            System.out.println("Impossivél fechar a conta, pois ela tem divida");
        }
    }

    public void depositar(double novoSaldo) {
        if (this.status == true) {
            this.saldo += novoSaldo;
            System.out.println("Seu novo saldo eh: " + this.saldo);
        } else {
            System.out.println("Impossivel sacar pois a conta está fechada");
        }

    }

    public void sacar(double dinheiroSacado) {
        if (this.status == true && this.saldo >= dinheiroSacado) {
            this.saldo -= dinheiroSacado;
            System.out.println("Seu saldo agora eh: " + this.saldo);
        } else {
            System.out.println("Impossivél sacar");
        }
    }

    public void pagarMensal() {
        if (this.status == true && this.tipo == "CC") {
            double valorAPagar = 12.00;
            this.saldo -= valorAPagar;
        } else if (this.status == true && this.tipo == "CP") {
            double valorAPagar = 20.00;
            this.saldo -= valorAPagar;
        } else {
            System.out.println("Impossivél pagar, vai a sua agência");
        }

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
