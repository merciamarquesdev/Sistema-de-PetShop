package modelo;

public class Dono extends Endereco {
    private int id;
    private String nome;
    private String cpf;
    private String email;

    private Endereco endereco;

    //construtores
    public Dono() {

    }

    public Dono(String nome, String cpf, String email, Endereco endereco) {
        super(endereco.getRua(), endereco.getNumero(), endereco.getCep(), endereco.getBairro(), endereco.getEstado());
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Dono(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    //getters e setters
    public int getId() {return id;}
    public void setId(int id) {
        if(this.id == 0){
            this.id = id;
        }}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Endereco getEndereco() {return endereco;}
    public void setEndereco(Endereco endereco) {this.endereco = endereco;}

    @Override
    public String toString() {
        return "Dono{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
