package modelo;

import java.util.Objects;

public class CachorroRepository {
    private int contador = 0;
    Cachorro[] cachorrosCadastrados = new Cachorro[2];
    private static int sequence = 1;

    public void cadastra(Cachorro cachorro) {
        cachorro.setId(sequence);
        cachorro.getDono().setId(sequence);
        cachorro.getDono().getEndereco().setId(sequence);
        sequence++;

        redimensionaArray();

        if (Objects.nonNull(cachorro) && Objects.nonNull(cachorro.getDono())) {
            cachorrosCadastrados[contador] = cachorro;
            contador++;
        } else {
            System.out.println("Cachorro nao pode ser null ou sem Dono.");
        }
    }
    public void redimensionaArray() {
        //verifica se tem posicao livre
        boolean temPosicaoLivre = false;

        for (int i = 0; i < cachorrosCadastrados.length; i++) {
            if (Objects.isNull(cachorrosCadastrados[i])) {
                temPosicaoLivre = true;
            }
        }

        //se nao tem posicao livre, redimensiona o array
        if (!temPosicaoLivre) {
            Cachorro[] cachorrosCadastrados2 = new Cachorro[cachorrosCadastrados.length + 1];
            for (int i = 0; i < cachorrosCadastrados.length; i++) {
                cachorrosCadastrados2[i] = cachorrosCadastrados[i];
            }
            cachorrosCadastrados = cachorrosCadastrados2;
        }
    }

    public void exibeCachorrosCadastrados(){
        boolean existeCaoCadastrado = false;
        for(Cachorro cachorro: cachorrosCadastrados){
            if(Objects.nonNull(cachorro)){
                existeCaoCadastrado = true;
                System.out.println(cachorro);
            }
        }
        if (!existeCaoCadastrado){
            System.out.println("------ Não há cães cadastrados! -------");
        }
    }

    public void limpaCadastro(){
        System.out.println("------- Limpando Cadastro -------");
        this.cachorrosCadastrados = new Cachorro[2];
        this.contador = 0;
    }
}
