package gerenciador_documentos;

import java.util.Scanner;

public class Gerenciador {

	private Cliente[] lista_clientes; 
	private Documento[] lista_documentos;
	private int num_clientes;
	
	Gerenciador() {
		System.out.println("Uma sessão Gerenciador foi criada!");
		this.lista_clientes = new Cliente[15];
		this.lista_documentos = new Documento[30];
		this.num_clientes = 0;
	}
	
	Gerenciador(int n_cliente, int n_documento) {
		System.out.println("Uma sessão Gerenciador foi criada!");
		this.lista_clientes = new Cliente[n_cliente];
		this.lista_documentos = new Documento[n_documento];
		this.num_clientes = 0;
	}

	public Cliente[] getLista_clientes() {
		return lista_clientes;
	}


	public int getNum_clientes() {
		return num_clientes;
	}

	public void setNum_clientes(int num_clientes) {
		this.num_clientes = num_clientes;
	}

	public void setLista_clientes(Cliente[] lista_clientes) {
		this.lista_clientes = lista_clientes;
	}

	public Documento[] getLista_documentos() {
		return lista_documentos;
	}

	public void setLista_documentos(Documento[] lista_documentos) {
		this.lista_documentos = lista_documentos;
	}


	
	public int menu(Scanner ler) {
		System.out.println("<-------------------- MENU -------------------->");
		System.out.println("(1) Cadastrar Clientes");
		System.out.println("(2) Cadastrar Documentos");
		System.out.println("(3) Excluir Clientes");
		System.out.println("(4) Excluir Documentos individuais");
		System.out.println("(5) Excluir Documentos por período");
		System.out.println("(6) Alterar as informações sobre o Cliente");
		System.out.println("(7) Mostrar o total de Documentos de determinado Cliente");
		System.out.println("(8) Sair");
		System.out.print("R = ");
		
		int opcao = ler.nextInt();
		
		return opcao;
		
	}

	public void cadastrarCliente(Scanner ler, int max_clientes) {
		if(getNum_clientes()<max_clientes) {
			System.out.print("Nome:");
			String nome = ler.next();
			System.out.print("Código:");
			String codigo = ler.next();
			System.out.print("Fone:");
			String fone = ler.next();
			System.out.print("Endereço:");
			String endereco = ler.next();
			
			Cliente cliente = new Cliente(codigo, nome, fone, endereco);
			
			System.out.println("cadastrarCliente()");
			getLista_clientes()[getNum_clientes()] = cliente;
			setNum_clientes(getNum_clientes() + 1);
		}else {
			System.out.println("Atingiu o Número Máximo de Clientes.");
		}
	}

	public void cadastrarDocumento() {
		System.out.println("cadastrarDocumento()");
	}
	
	public void excluirClientes() {
		System.out.println("excluirClientes()");
	}
	
	public void excluirDocumentosIndividuais() {
		System.out.println("excluirDocumentosIndividuais()");
	}
	
	public void excluirDocumentosPeriodo() {
		System.out.println("excluirDocumentosPeriodo()");
	}

	public void alterarInformacoesCliente() {
		System.out.println("alterarInformacoesCliente()");
	}
	
	public void mostrarTotalDocumentosPorCliente() {
		System.out.println("mostrarTotalDocumentosPorCliente()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int max_clientes = 2;
		int max_documentos = 1000;
		Gerenciador gerenciador = new Gerenciador(max_clientes,max_documentos);
		
		int opcao = -1;
		while(opcao != 8) {
		
			opcao = gerenciador.menu(ler);
			
			switch (opcao) {
			case 1: {
				gerenciador.cadastrarCliente(ler, max_clientes);
				break;
			}case 2:{
				gerenciador.cadastrarDocumento();
				break;
			}case 3:{
				gerenciador.excluirClientes();
				break;
			}case 4:{
				gerenciador.excluirDocumentosIndividuais();
				break;
			}case 5:{
				gerenciador.excluirDocumentosPeriodo();
				break;
			}case 6:{
				gerenciador.alterarInformacoesCliente();
				break;
			}case 7:{
				gerenciador.mostrarTotalDocumentosPorCliente();
				break;
			}case 8:
				System.out.println("Usuário optou sair do sistema.");
				break;
			default:
				System.out.println("Refaça a operação. Opção Inválida!");
			}
		}
		
	}

}
