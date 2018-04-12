public class Continente {
	
	private String continente;
    private Pais[] paises;
    private int qtdepaises;
    
    private int totalpessoas;
    
    public Continente(String continente){
        this.continente = continente;
        this.paises = new Pais[10];
        qtdepaises = 0;
    }

    public void addPais(Pais pais){
        this.paises[qtdepaises] = pais;
        this.qtdepaises++; 
        
        this.totalpessoas = this.totalpessoas + pais.getPopulacao();
    }
    
    public void totalPaisPorContinente() {
    	System.out.println("Total de Paises deste continente eh: "+this.qtdepaises);
    }
    
    public void totalPopulacaoNoContinente() {
    	int count =0;
    	for(int i=0;i<this.paises.length;i++) {
    		if(this.paises[i] == null) {
    			break;
    		}else {
    			count += this.paises[i].getPopulacao();
    		}
    	}
    	System.out.println("Total de Populacao deste continente eh: "+count);
    }
    
    public void paisComMaiorPopulacaoNoContinente() {
    	Pais temp = new Pais("Oi",0);
    	for(int i=0;i<this.paises.length;i++) {
    		if(this.paises[i] == null) {
    			break;
    		}else {
    			if(this.paises[i].getPopulacao() > temp.getPopulacao()) {
    				temp = paises[i];
    			}
    		}
    	}
    	System.out.println("Pais com maior populacao eh: "+temp.getNome());
    }
    
    public void paisComMenorPopulacaoNoContinente() {
    	Pais temp = new Pais("Oi",1000);
    	for(int i=0;i<this.paises.length;i++) {
    		if(this.paises[i] == null) {
    			break;
    		}else {
    			if(this.paises[i].getPopulacao() < temp.getPopulacao()) {
    				temp = paises[i];
    			}
    		}
    	}
    	System.out.println("Pais com menor populacao eh: "+temp.getNome());
    }
}
