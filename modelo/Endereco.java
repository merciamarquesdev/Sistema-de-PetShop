package modelo;

public class Endereco {
    private int id;
    private String rua;
    private String numero;
    private String cep;
    private String bairro;
    private String estado;

    //construtores
    public Endereco(){

    }

    public Endereco(String rua, String numero, String cep, String bairro, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.estado = estado;
    }

    //getters e setters
    public int getId(){
        return id;
    }
    public void setId(int id){ this.id = id;}
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String  getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
