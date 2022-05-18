public class Caneta {
    
    //Atributos
    public String modelo;
    public float ponta;
    private String cor;
    private boolean tampada;
    private boolean destampada;

    //Construtor
    public Caneta(String m, string c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String c){
        this.cor = c;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.destampada = false;
    }

    public void status(){

        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
    }
  
}