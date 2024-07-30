import java.sql.Date;

public class Funcionario  extends Pessoa{
    private Date dataAdmissao;
    private Double salario;
    private String especialidade;
    
    public Date getDataAdmissao() {
        return dataAdmissao;
    }
    public Double getSalario() {
        return salario;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
