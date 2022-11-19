package BusinessObject;

import modelo.Cachorro;
import modelo.CachorroRepository;
import modelo.Dono;
import modelo.Endereco;

import java.util.Scanner;

public class TesteDinamicoPetShop {
    private static final CachorroRepository cachorroRepository = new CachorroRepository();

    public static void main(String[] args) {
        final int SAIR_DO_SISTEMA = 4;
        int opcaoSelecionada = 0;
        do{
            System.out.println("Seleciona a opção desejada: ");
            System.out.println("Digite 1 para Cadastrar");
            System.out.println("Digite 2 para ver Cadastrados");
            System.out.println("Digite 3 para limpar Cadastros");
            System.out.println("Digite 4 para sair");

            Scanner scanner = new Scanner(System.in);
            opcaoSelecionada = scanner.nextInt();

            switch (opcaoSelecionada){
                case 1:
                    cadastra(scanner, cachorroRepository);
                    break;
                case 2:
                    cachorroRepository.exibeCachorrosCadastrados();
                    break;
                case 3:
                    cachorroRepository.limpaCadastro();
                case 4:
                    System.out.println("Saindo do sistema...");
                default:
                    System.out.println("Opção inválida");
            }
        }
        while (opcaoSelecionada != SAIR_DO_SISTEMA);
    }
    private static void cadastra(Scanner scanner, CachorroRepository cachorroRepository){
        System.out.println("\n------------ Cadastro de Cães ---------------");
        System.out.println("----- Informe seus dados pessoais");
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("\n----- Informe os dados do seu endereço");
        System.out.println("Digite sua rua: ");
        String rua = scanner.next();
        System.out.println("Digite o numero: ");
        String numero = scanner.next();
        System.out.println("Digite o cep: ");
        String cep = scanner.next();
        System.out.println("Digite o bairro: ");
        String bairro = scanner.next();
        System.out.println("Digite o estado: ");
        String estado = scanner.next();

        System.out.println("\n----- Informe os dados do seu cãozinho");
        System.out.println("Digite o nome do seu cão: ");
        String nomeCachorro = scanner.next();
        System.out.println("Digite a raça: ");
        String raca = scanner.next();
        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setCep(cep);
        endereco.setBairro(bairro);
        endereco.setEstado(estado);

        Dono dono = new Dono(nome, endereco);

        Cachorro cachorro = new Cachorro(dono);
        cachorro.setNome(nomeCachorro);
        cachorro.setRaca(raca);
        cachorro.setIdade(idade);

        cachorroRepository.cadastra(cachorro);
        System.out.println("Cadastro finalizado com sucesso! Acesse a opção 2 para consultar. ");

    }
}
