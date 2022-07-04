package Controlador;
public class ControleRemoto {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Construtor
    public static void Construtor(){
        volume = 0;
        ligado = false;
        tocando = false;
    }
    //Métodos Essenciais
    @Override
    private static int getVolume(){
        int volume = 0;

        if(volume == 0 || tocando == false){
            return volume;
        } else {
            for (int i = 0; i < volume; i++){
                volume += 
            }
        }
        return volume;
    }
    private static void getLigado(){
        return volume;
    }
    private static void getTocando(){
        return volume;
    }
    private static void setVolume(int v){
        volume = v;
    }
    private static void setLigado(boolean l){
        volume = l;
    }
    private static void setTocando(boolean t){
        tocando = t;
    }

}
