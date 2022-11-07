package diopraticaemjava;

import diopraticaemjavaStrategy.Comportamento;
import diopraticaemjavaStrategy.ComportamentoAgressivo;
import diopraticaemjavaStrategy.ComportamentoNormal;
import diopraticaemjavaStrategy.Robo;

public class Teste {
	

	

	public static <comportamento> void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder Lazyholder = SingletonLazyHolder.getInstancia();
		System.out.println(Lazyholder );
		lazy = SingletonLazy.getInstancia();
		System.out.println(Lazyholder );

		
		Comportamento normal 	= new ComportamentoNormal();
		ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
		ComportamentoAgressivo agressivo = new ComportamentoAgressivo();
		
		

		Robo robo =new Robo();
		robo.setComportamento(normal);
		
		robo.mover();
		robo.mover();
		
		
	}


		
	}
	

