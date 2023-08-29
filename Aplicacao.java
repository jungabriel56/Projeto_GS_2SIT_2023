import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;




public class Aplicacao {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		List<InformacoesLocal>listaInfo= new LinkedList<>();
		
		int opcao;
		
		do {
			System.out.println("Escolha uma opcao:");
			System.out.println("0 - Encerrar programa");
			System.out.println("1 - Cadastro");
			System.out.println("2 - Lista");
			
			opcao = teclado.nextInt();
			 
			switch (opcao) {
			case 0:
				System.out.println("Encerrando programa...");
				break;
			case 1: 
				
				System.out.println("Pessoa fisica (1) ou juridica(2): ");
				int pfpj= teclado.nextInt();
				
				if (pfpj == 1) {
				System.out.println("Insira o seu nome: ");
				teclado.nextLine();
				String nm = teclado.nextLine();
				System.out.println("Insira o seu cpf: ");
				String cpfC = teclado.nextLine();
				
				System.out.println("Insira o seu email: ");
				String mail = teclado.nextLine();
				
				System.out.println("Insira a sua cidade: ");
				String cidadeC = teclado.nextLine();
				
				System.out.println("Insira o seu estado: ");
				String estadoC = teclado.nextLine();
				
				PessoaFisica pf = new PessoaFisica (nm, cpfC, mail, cidadeC, estadoC);
				
				} else {
					
					System.out.println("Insira o seu nome: ");
					teclado.nextLine();
					String nm = teclado.nextLine();
					System.out.println("Insira o seu cnpj: ");
					String cnpjC = teclado.nextLine();
					
					System.out.println("Insira o seu email: ");
					String mail = teclado.nextLine();
					
					System.out.println("Insira a sua cidade: ");
					String cidadeC = teclado.nextLine();
					
					System.out.println("Insira o seu estado: ");
					String estadoC = teclado.nextLine();
					
					PessoaJuridica pj = new PessoaJuridica(nm, cnpjC, mail, cidadeC, estadoC);
				}
		
				
				System.out.println("Informações do local --> ");
				
				
				System.out.println("Insira o nome do projeto: ");
				String nome = teclado.nextLine();
				
				
				LocalDate diaA= LocalDate.now();
				
				System.out.println("Insira a cordenada: ");
				String cord = teclado.nextLine();
				
				System.out.println("Insira a temperatura media em graus Celcius: ");
				int tempM = teclado.nextInt();

				System.out.println("Insira o tamanho de area disponivel em metros: ");
				int areaA = teclado.nextInt();
				
				
				
				InformacoesLocal infolocal = new InformacoesLocal (diaA, cord, tempM, areaA, nome);
				listaInfo.add(infolocal);
				
				
				System.out.println();
				
				break; 
				
		case 2:
			
		
			if (listaInfo.isEmpty()) {
				System.out.println("Lista vazia!");
			
			} else 
				System.out.println(listaInfo);
			
			System.out.println();
			break; }
			
	 
				
			} while (opcao != 0);{
				
			}
			
				
	
		teclado.close();
		

		}

}
