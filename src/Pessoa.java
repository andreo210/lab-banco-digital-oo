public class Pessoa {
    private Long codigo;
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Long getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getRg() {
        return rg;
    }
    public String getTelefone() {
        return telefone;
    }
}
