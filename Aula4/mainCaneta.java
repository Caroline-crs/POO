package Aula4;
public class mainCaneta {
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = false;
        // c1.status = false;
        c1.rabiscar(); 

        Caneta c2 = new Caneta();
        c2.cor = "Azul";
        c2.modelo = "Bic";
        c2.ponta = 0.7f;
        c2.carga = 98;
        // c2.status = true;

        Caneta c3 = new Caneta();
        c3.cor = "Vermelho";
        c3.modelo = "Lux";
        c3.ponta = 0.5f;
        c3.carga = 90;
        // c3.status = false;

        Caneta c4 = new Caneta();
        c4.cor =  "Verde";
        c4.modelo = "Bic";
        c4.ponta = 0.7f;
        c4.carga = 98;
        // c4.status = true;
    }   
}
