public class Caes {
    //Atributos
    public String nome;
    public String raca;
    private double altura;
    private int peso;
    public boolean latir;

    //Construtor
    public Caes(String n, String r, double a, int p, boolean l){
        this.nome = n;
        this.raca = r;
        this.altura = a;
        this.peso = p;
        this.latir = l;
    }

    //Métodos
    public void latir(){
        if(latir == true){
            System.out.println("Au Au Au Au");
        }
        else {
            System.out.println("Está dormindo...");
        }
    }

    //Métodos Get e Set
    public String getRaca(){
        return this.raca;
    }
    public void setRaca(String r){
        this.raca = r;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double a){
        this.altura = a;
    }

    public int getPeso(){
        return this.peso;
    }

    public void setPeso(int p){
        this.peso = p;
    }

    public boolean getLatindo(){
        return this.latir;
    }
    
    public void setLatindo(boolean l){
        this.latir = l;
    }
}
