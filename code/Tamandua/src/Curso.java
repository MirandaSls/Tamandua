import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String nome;
    private int numeroCreditos;
    private List<Disciplina> disciplinas;
    
    public Curso() {
        this.disciplinas = new ArrayList<>();
    }
    
    public Curso(String nome, int numeroCreditos) {
        this.nome = nome;
        this.numeroCreditos = numeroCreditos;
        this.disciplinas = new ArrayList<>();
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getNumeroCreditos() {
        return numeroCreditos;
    }
    
    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }
    
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    // Métodos de relacionamento
    public void adicionarDisciplina(Disciplina disciplina) {
        // Implementação será feita posteriormente
    }
    
    public void removerDisciplina(Disciplina disciplina) {
        // Implementação será feita posteriormente
    }
}
