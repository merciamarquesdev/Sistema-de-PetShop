package modelo;

public class Cachorro extends Dono{
    private int id;
    private String nome;
    private String raca;
    private int idade;
    private boolean estaDoente;
    private Dono dono;

    /* atributo estatico, que pertence somente a classe
    havera somente uma instancia, compartilhada entre os objetos
     */
    private static int contador;

    // construtores
    public Cachorro(){
    }
    public Cachorro(Dono dono){
        this.dono = dono;
    }
    public Cachorro(String nome, String raca, int idade, boolean estaDoente, Dono dono){
        super(dono.getNome(), dono.getCpf(), dono.getEmail(),dono.getEndereco());
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.estaDoente = estaDoente;
        this.dono = dono;
    }

    // metodos de consulta (get) e metodos de configuração (set)
    public int getId(){return id;}
    public void setId(int id){this.id = id;}
    public boolean isEstaDoente() {
        return estaDoente;
    }
    public void setEstaDoente(boolean estaDoente) {this.estaDoente = estaDoente;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {this.raca = raca;}
    public int getIdade() {
        return idade;
    }
    // encapsulando regra de negócio no setter
    public void setIdade(int idade) {
        if(idade < 0){
            System.err.println("Cachorro não pode ter idade negativa");
        } else if(idade > 29) {
            System.err.println("Não é permitido cachorros com idades superiores a 29 anos");
        } else {
            this.idade = idade;
        }
    }
    public Dono getDono() {
        return dono;
    }
    public void setDono(Dono dono){
        this.dono = dono;
    }
    public static int getContador() {
        return contador;
    }

    // metodo usado para imprimir mais informações (estado) sobre os valores dos atributos do objeto

    @Override
    public String toString() {
        return "Cachorro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                ", estaDoente=" + estaDoente +
                ", dono=" + dono +
                '}';
    }
}