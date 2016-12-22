package com.webs.infocristian;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Tema {

	private String nome;
	private Color corDeFundo;
	private Color corDaFonte;
	
	private static Map <String, Tema> temas = new HashMap<String, Tema>();
	 public static final String SKY = "SKY";
	 public static final String FIRE = "Fire";
	 
	 static {
		 Tema tema1 = new Tema();
		 tema1.setnome (Tema.SKY);
		 tema1.setcorDeFundo (Color.BLUE);
		 tema1.setcorDaFonte(Color.BLACK);
		 
		 Tema tema2 = new Tema ();
		 tema2.setnome (Tema.FIRE);
		 tema2.setcorDeFundo (Color.RED);
		 tema2.setcorDaFonte (Color.WHITE);
		 
		 temas.put(tema1.getnome(), tema1);
		 temas.put(tema2.getnome(), tema2);
		 
		 
	 }
	 private Tema(){
		 
	 }
	
	 private void setnome(String nome) {
		// TODO Auto-generated method stub
this.nome = nome;		
	}
	 

	private void setcorDaFonte(Color corDaFonte) {

		this.corDaFonte = corDaFonte;
	}
	
	public Color getcorDaFonte(){
		
		return corDaFonte;
	}

	private void setcorDeFundo(Color corDeFundo) {

		this.corDeFundo = corDeFundo;
	}
	
	public Color getcorDeFundo(){
		
		return corDeFundo;
	}

	public static Tema getInstance(String nomeDoTema){
		 
		 return Tema.temas.get(nomeDoTema);
	 }
	 
	 public String getnome(){
		 return nome;
	 }
}
