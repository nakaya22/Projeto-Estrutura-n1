package lab;

public class TadFila {
	
	private	Slot[] fila;
	private int inicio;
	private int fim;
	private int TAMANHO;
	private int quantidade;
	
	public TadFila(int tam) {
		fila = new Slot[tam];
		inicio = -1;
		fim = -1;
		TAMANHO = tam;
		quantidade = 0;
	}
	
	public int getTAMANHO() {
		return TAMANHO;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public boolean vazia() {
		return quantidade == 0;
	}
	
	public boolean cheia() {
		return quantidade == TAMANHO;
	}
	
	public String inserir(Slot slot) {
		if(cheia()) {
			return "Fila Cheia!";
		} else {
			if(vazia()) {
				inicio = 0;
				fim = 0;
			} else {
				fim = (fim + 1) % TAMANHO;
			}
			fila[fim] = slot;
			quantidade++;
			return "\t ELemento inserido";
			
		}
	}
	
	public String buscarDia(int dia) {
		
		for(int i =0; i < quantidade; i++) {
			if(fila[i].getDia() == dia) {
				
				System.out.println(fila[i].dscrição());
				
			}
			i++;
		} return " ";
		
	}
	
}
