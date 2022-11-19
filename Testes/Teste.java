package Testes;

import BusinessObject.Internacoes;
import modelo.Cachorro;
import modelo.CachorroRepository;
import modelo.Dono;
import modelo.Endereco;

public class Teste {
    public static void main(String[] args) {
        /**Endereco endereco1 = new Endereco("Rua Barata Ribeiro", "500", "20200-20", "Copacabana", "RJ");
        Dono dono1 = new Dono("Joao", "111.111.111-11", "joao@gmail.com", endereco1);
        Cachorro cachorro1 = new Cachorro("Bidu","poodle", 10, true, dono1);

        Endereco endereco2 = new Endereco("Rua Barbosa da Silva", "120", "Riachuelo", "10100-10", "RJ");
        Dono dono2 = new Dono("Maria", "222.222.222-22", "maria@gmail.com", endereco2);
        Cachorro cachorro2 = new Cachorro("Luna","pinscher", 8, true, dono2);
         */

        //outra forma de instanciar os objetos
        Endereco endereco3 = new Endereco();
        endereco3.setRua("Rua Linda");
        endereco3.setNumero("100");
        endereco3.setCep("20000-20");
        endereco3.setBairro("Azul");
        endereco3.setEstado("SP");

        Dono dono3 = new Dono();
        dono3.setNome("Clara");
        dono3.setCpf("333.333.333-33");
        dono3.setEmail("clara@gmail.com");
        dono3.setEndereco(endereco3);

        Cachorro cachorro3 = new Cachorro();
        cachorro3.setNome("Lupi");
        cachorro3.setRaca("vira lata");
        cachorro3.setIdade(2);
        cachorro3.setEstaDoente(false);
        cachorro3.setDono(dono3);

        Endereco endereco4 = new Endereco();
        endereco4.setRua("Rua Luz");
        endereco4.setNumero("10");
        endereco4.setCep("20001-20");
        endereco4.setBairro("Rosa");
        endereco4.setEstado("RJ");

        Dono dono4 = new Dono();
        dono4.setNome("Luana");
        dono4.setCpf("333.111.333-33");
        dono4.setEmail("luana@gmail.com");
        dono4.setEndereco(endereco4);

        Cachorro cachorro4 = new Cachorro();
        cachorro4.setNome("Bingo");
        cachorro4.setRaca("vira lata");
        cachorro4.setIdade(5);
        cachorro4.setEstaDoente(true);
        cachorro4.setDono(dono4);

        //Imprimindo doguinhos
        System.out.println("\n------------------- Imprimindo doguinhos ------------------- ");
        System.out.println(cachorro3);
        System.out.println(cachorro4);

        // Internando doguinhos doentes
        Internacoes internacoes = new Internacoes();
        internacoes.internar(cachorro4);

        //Imprimindo doguinhos
        System.out.println("\n--------------- Imprimindo doguinhos doentes --------------- ");
        internacoes.mostraCachorrosInternados();

        //Cadastrando doguinhos
        CachorroRepository cachorroRepository = new CachorroRepository();
        cachorroRepository.cadastra(cachorro3);
        cachorroRepository.cadastra(cachorro4);

        //Imprimindo doguinhos cadastrados
        System.out.println("\n-------------- Imprimindo doguinhos cadastrados -------------- ");
        cachorroRepository.exibeCachorrosCadastrados();

    }
}
