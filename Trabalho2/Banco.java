package Trabalho2;

public class Banco {
  public static void main(String [] args){
  
  ContaBanco conta1 = new ContaBanco(0001, "CC", "João Silva", 0, false );
  ContaBanco conta2 = new ContaBanco(0002, "CP", "Maria Silva", 0, false );

  conta1.abrirConta();
  conta1.depositar(300);
  conta1.mostrarDadosConta();
   
  System.out.println();

  conta2.abrirConta();
  conta2.depositar(400);
  conta2.mostrarDadosConta();
 }    
}
