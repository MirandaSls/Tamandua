import java.util.List;
import java.util.ArrayList;

public class Disciplina {
    private String idDisciplina;
    private String nome;
    private TipoDisciplina tipo;
    private List<Turma> turmas;
    
    public Disciplina() {
        this.turmas = new ArrayList<>();
    }
    
    public Disciplina(String idDisciplina, String nome, TipoDisciplina tipo) {
        this.idDisciplina = idDisciplina;
        this.nome = nome;
        this.tipo = tipo;
        this.turmas = new ArrayList<>();
    }
    
    // Getters e Setters
    public String getIdDisciplina() {
        return idDisciplina;
    }
    
    public void setIdDisciplina(String idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public TipoDisciplina getTipo() {
        return tipo;
    }
    
    public void setTipo(TipoDisciplina tipo) {
        this.tipo = tipo;
    }
    
    public List<Turma> getTurmas() {
        return turmas;
    }
    
    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
    
    // Métodos de relacionamento
    public void adicionarTurma(Turma turma) {
        // Implementação será feita posteriormente
    }
    
    public void removerTurma(Turma turma) {
        // Implementação será feita posteriormente
    }
}
