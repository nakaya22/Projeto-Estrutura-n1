package lab;

public class Main {
	
	public static void main(String[] args) {
		
		TadFila radio = new TadFila(10);
	
		//==============================================================
		//Artistas
		
		Artista Matue = new Artista("Matue", "Ceara", "28");
		Artista Teto = new Artista("Teto", "Bahia", "20");
		Artista Wiu = new Artista("WIU", "Ceara", "19");
		Artista Dfideliz = new Artista("Dfideliz", "São Paulo", "23");
		Artista YunkVino = new Artista("Yunk Vino", "São Paulo", "25");
		Artista Derek = new Artista("Derek", "São Paulo", "22");
		Artista KayBlack = new Artista("kayBlack", "São Paulo", "21");
		Artista JeSant = new Artista("Jé Santiago", "São Paulo", "25");
		Artista YungBuda = new Artista("Yung Buda", "São Paulo", "24");
		Artista Travis = new Artista("Travis Scott", "Texas", "31");
		
		
		//===============================================================
		//Musicas
		
		
		Musica Vampiro = new Musica("Vampiro", "2022", Matue );
		Slot s1 = new Slot(1,1, Vampiro);
		
		Musica SemDo = new Musica("Sem Do", "2021", Matue );
		Slot s2 = new Slot(1,2, SemDo);
		
		Musica Groupies = new Musica("Groupies", "2021", Matue );
		Slot s3 = new Slot(1,3, Groupies);
			
		Musica QuerVoar = new Musica("Quer Voar", "2021", Matue );
		Slot s4 = new Slot(1,4, QuerVoar);
	
		Musica M4 = new Musica("M4", "2021", Matue );
		Slot s5 = new Slot(1,5, M4);
		
		Musica FimDeSemanaNoRio = new Musica("Fim de Semana no Rio", "2022", Teto);
		Slot s6 = new Slot(1,6, FimDeSemanaNoRio);
		
		Musica MustangPreto = new Musica("Mustang Preto", "2021", Teto);
		Slot s7 = new Slot(1, 7, MustangPreto);
		
		Musica PayPal = new Musica("PayPal", "2021", Teto);
		Slot s8 = new Slot(', 8, PayPal);
		
		
		//================================================================
		
		
		radio.inserir(s1);
		radio.inserir(s2);
		radio.inserir(s3);
		radio.inserir(s4);
		radio.inserir(s5);
		
		
		//================================================================
		
		System.out.println(s1.dscrição());
		System.out.println(s2.dscrição());
		System.out.println(s3.dscrição());
		System.out.println(s4.dscrição());
		System.out.println(s5.dscrição());
		
		System.out.println("===========");
		
		
		radio.buscarDia(1);
		
		
	
		
	}
}
