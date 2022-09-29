/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author 1146355
 */
public class Slot {
    
    private int dia;
    private int horario;
    private String descHora;
    private Musica musica;
    
    

    /**
     * @return the dia
     */
    
    public Slot(int dia, int horario, Musica musica) {
    	
    	this.dia = dia;
    	this.horario = horario;
    	this.musica = musica;
    	
    	
    	
    	if(horario == 1) {
    		this.descHora = "00:00";
    	}
    	else if(horario == 2) {
    		this.descHora = "00:05";
    	}
    	else if(horario == 3) { 
    		this.descHora = "00:10";
    	}
    	else if(horario == 4) {
    		this.descHora = "00:15";
    	}
    	else if(horario == 5) {
    		this.descHora = "00:20";
    	}
    	else if(horario == 6) {
    		this.descHora = "00:25";
    	}
    	else if(horario == 7) {
    		this.descHora = "00:30";
    	}
    	else if(horario == 8) {
    		this.descHora = "00:35";
    	}
    	
    	
    }
    
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the horario
     */
    public int getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(int horario) {
        this.horario = horario;
    }

    /**
     * @return the musica
     */
    public Musica getMusica() {
        return musica;
    }

    /**
     * @param musica the musica to set
     */
    public void setMusica(Musica musica) {
        this.musica = musica;
    }
    
    public String getDescHora() {
    	
    	return descHora;
    }
    
    
    
    public String dscrição(){
    	
    	return getDescHora() + " " + getMusica().getNome() + " " + getMusica().getNomeArtista();
    	
    }
}
