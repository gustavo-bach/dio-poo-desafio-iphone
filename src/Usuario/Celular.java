package Usuario;

import java.util.Scanner;

import Equipamento.EquipamentoMultiFuncoes;

public class Celular {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		EquipamentoMultiFuncoes celular = new EquipamentoMultiFuncoes();

		System.out.println("Digite 'telefone', 'internet' ou 'musica' para saber suas funções");

		String user = sc.nextLine();

		if (user.equals("telefone")) {
			celular.ligar();
			celular.atender();
			celular.iniciarCorreioVoz();
		} else if (user.equals("internet")) {
			celular.exibirPagina();
			celular.adicionarNovaAba();
			celular.atualizarPagina();
		} else if (user.equals("musica")) {
			celular.tocar();
			celular.pausar();
			celular.selecionarMusica();
		} else {
			System.out.println("Comando desconhecido.");
		}

		sc.close();
		
	}

}
