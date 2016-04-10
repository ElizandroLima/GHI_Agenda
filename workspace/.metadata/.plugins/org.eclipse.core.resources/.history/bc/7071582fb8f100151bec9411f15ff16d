package modelo;

import java.io.*;

import controle.ControlePessoa;

public class CadastroPessoa{

  public static void main(String[] args) throws IOException{
    //burocracia para leitura de teclado
    InputStream entradaSistema = System.in;
    InputStreamReader leitor = new InputStreamReader(entradaSistema);
    BufferedReader leitorEntrada = new BufferedReader(leitor);
    String entradaTeclado;

    //instanciando objetos do sistema
    ControlePessoa umControle = new ControlePessoa();
    Pessoa umaPessoa = new Pessoa();
	
	double opcao = 5.0;
	
			do{
				System.out.println("O que deseja fazer? \n1) Adicionar pessoa. \n2) Pesquisar pessoa. \n3) Remover pessoa.");
				entradaTeclado = leitorEntrada.readLine();
				String numeroOpcao = entradaTeclado;
				opcao = Double.parseDouble(numeroOpcao);
				
					if(opcao == 1.0){
						System.out.println("Digite o nome da Pessoa:");
						entradaTeclado = leitorEntrada.readLine();
						String umNome = entradaTeclado;
						umaPessoa.setNome(umNome);

						System.out.println("Digite o telefone da Pessoa:");
						entradaTeclado = leitorEntrada.readLine();
						String umTelefone = entradaTeclado;
						umaPessoa.setTelefone(umTelefone);

						String mensagem = umControle.adicionar(umaPessoa);
						
						System.out.println("=================================");
						System.out.println(mensagem);
							
						System.out.println("Deseja adicionar mais informacoes do cadastro?\n 2 = sim \n 1 = nao");
						entradaTeclado = leitorEntrada.readLine();
						String opcaoCadastroString = entradaTeclado;
						double opcaoCadastro = Double.parseDouble(opcaoCadastroString);
						
						
							
							if(opcaoCadastro == 1.0){
								System.out.println("Digite a Idade da pessoa:");
								entradaTeclado = leitorEntrada.readLine();
								String umaIdade = entradaTeclado;
								umaPessoa.setIdade(umaIdade);
								
								System.out.println("Digite o email:");
								entradaTeclado = leitorEntrada.readLine();
								String umEmail = entradaTeclado;
								umaPessoa.setEmail(umEmail);
								
								System.out.println("Digite o Endereco:");
								entradaTeclado = leitorEntrada.readLine();
								String umEndereco = entradaTeclado;
								umaPessoa.setEndereco(umEndereco);
								
								System.out.println("Digite o RG:");
								entradaTeclado = leitorEntrada.readLine();
								String umRg = entradaTeclado;
								umaPessoa.setRg(umRg);
								
								System.out.println("Digite o CPF:");
								entradaTeclado = leitorEntrada.readLine();
								String umCpf = entradaTeclado;
								umaPessoa.setCpf(umCpf);
							}else{
								opcao = 5.0;
							}
						
					}else if(opcao == 2.0) {
						System.out.println("Digite a pessoa que deseja pesquisar:");
						entradaTeclado = leitorEntrada.readLine();
						String nome = entradaTeclado;
						Pessoa retorno = umControle.pesquisar(nome);
						System.out.println(retorno);
						
					}else if(opcao == 3.0){
						System.out.println("Digite o nome da pessoa a remover:\n");
						entradaTeclado = leitorEntrada.readLine();
						String removePessoa = entradaTeclado;
						String alerta = umControle.remover(umaPessoa);
						System.out.println(alerta);
					}
			
			}while(opcao != 0);


		  }

}
