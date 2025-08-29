import java.util.List;
import java.util.ArrayList;

public class Professor extends Usuario {
    private List<Turma> turmas;
    private String especialidade;
    private String titulacao;
    
    public Professor() {
        super();
        this.turmas = new ArrayList<>();
    }
    
    public Professor(String nome, String login, String senha) {
        super(nome, login, senha);
        this.turmas = new ArrayList<>();
    }
    
    public Professor(String nome, String login, String senha, String especialidade, String titulacao) {
        super(nome, login, senha);
        this.turmas = new ArrayList<>();
        this.especialidade = especialidade;
        this.titulacao = titulacao;
    }
    
    // Getters e Setters
    public List<Turma> getTurmas() {
        return turmas;
    }
    
    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
    
    public String getEspecialidade() {
        return especialidade;
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public String getTitulacao() {
        return titulacao;
    }
    
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    // Implementação dos métodos abstratos
    @Override
    public boolean efetuarLogin() {
        // Implementação será feita posteriormente
        return false;
    }
    
    @Override
    public void recuperarSenha() {
        // Implementação será feita posteriormente
    }
    
    // Método específico conforme UML
    public List<Aluno> consultarAlunos(Turma turma) {
        // Implementação será feita posteriormente
        return new ArrayList<>();
    }
    
    // Métodos de relacionamento
    public boolean adicionarTurma(Turma turma) {
        // Implementação será feita posteriormente
        return false;
    }
    
    public boolean removerTurma(Turma turma) {
        // Implementação será feita posteriormente
        return false;
    }
    
    public int getQuantidadeTurmas() {
        // Implementação será feita posteriormente
        return 0;
    }
    
    public boolean possuiTurma(Turma turma) {
        // Implementação será feita posteriormente
        return false;
    }
    
    @Override
    public String toString() {
        // Implementação será feita posteriormente
        return "";
    }
}
