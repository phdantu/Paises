

public class Pais {

    String nome;
    int populacao;
 
   public Pais(String nome, int populacao){
       this.setNome(nome);
       this.setPopulacao(populacao);
   }      
   
   public void setNome(String nome){
       this.nome = nome;
   }

   public String getNome(){
       return this.nome;
   }

   public void setPopulacao(int Populacao){
       this.populacao = populacao;
   }

   public int getPopulacao (){
       return this.populacao;
   }

}