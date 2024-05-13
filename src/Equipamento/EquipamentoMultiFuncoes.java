package Equipamento;

import Funcoes.AparelhoTelefonico;
import Funcoes.NavegadorInternet;
import Funcoes.ReprodutorMusical;

public class EquipamentoMultiFuncoes implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	// FUNÇÕES DO NAVEGADOR
	public void exibirPagina() {
		System.out.println("EXIBINDO PÁGINA");
	}

	public void adicionarNovaAba() {
		System.out.println("ADICIONADO NOVA ABA");
	}

	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA");
	}

	// FUNÇÕES DO APARELHO TELEFÔNICO
	public void ligar() {
		System.out.println("REALIZANDO A CHAMADA");
	}

	public void atender() {
		System.out.println("ATENDENDO CHAMADA");
	}

	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}

	// FUNÇÕES DO REPRODUTOR MUSICAL
	public void tocar() {
		System.out.println("REPRODUZINDO MÚSICA");
	}

	public void pausar() {
		System.out.println("MÚSICA PAUSADA");
	}

	public void selecionarMusica() {
		System.out.println("SELECIONANDO MÚSICA");
	}

}
