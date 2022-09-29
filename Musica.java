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
public class Musica {
 private String nome;
    private String dataCriacao;
    private Artista artista;
    /**
     * @return the nome
     */
    
    public Musica(String nome, String dataCriacao, Artista artista) {
    	
    	this.nome = nome;
    	this.dataCriacao = dataCriacao;
    	this.artista = artista;
    }
    
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataCriacao
     */
    public String getDataCriacao() {
        return dataCriacao;
    }

    /**
     * @param dataCriacao the dataCriacao to set
     */
    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    /**
     * @return the artista
     */
    public Artista getArtista() {
        return artista;
    }
    
    public String getNomeArtista() {
    	return artista.getNome();
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
   
}
