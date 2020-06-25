package br.com.inovation.comparator;

public class Aluno implements Comparable<Aluno> {

    private Integer codigo;
    private String nome;
    private Integer idade;
    private Character sexo;
    private Integer anoNascimento;

    public Aluno(Integer codigo, String nome, Integer idade, Character sexo, Integer anoNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.anoNascimento = anoNascimento;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", anoNascimento=" + anoNascimento +
                '}';
    }

    @Override
    public int compareTo(Aluno o) {
        return this.getAnoNascimento() - o.getAnoNascimento();
    }
}
