package com.webs.infocristian;

public class Principal {

	public static void main(String[] args) {

		

		Tema temaFire = Tema.getInstance(Tema.FIRE);
		
		System.out.println("Tema"+ temaFire.getnome());
		System.out.println("Cor da fonte"+temaFire.getcorDaFonte());
		System.out.println("Cor Do Fundo:"+temaFire.getcorDeFundo());
		
		Tema temaFire2 = Tema.getInstance(Tema.FIRE);
		
		System.out.println("---------------");
		System.out.println("Comparando as referências....");
		System.out.println(temaFire == temaFire2);
	}

}
