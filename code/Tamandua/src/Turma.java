import java.util.List;
import java.util.ArrayList;

public class Turma {
    private String idTurma;
    private StatusTurma status;
    private static final int MIN_ALUNOS = 3;
    private static final int MAX_ALUNOS = 60;
    private List<Aluno> alunos;
    
    public Turma() {
        this.alunos = new ArrayList<>();
        this.status = StatusTurma.ABERTA;
    }
    
    public Turma(String idTurma) {
        this.idTurma = idTurma;
        this.alunos = new ArrayList<>();
        this.status = StatusTurma.ABERTA;
    }
    
    // Getters e Setters
    public String getIdTurma() {
        return idTurma;
    }
    
    public void setIdTurma(String idTurma) {
        this.idTurma = idTurma;
    }
    
    public StatusTurma getStatus() {
        return status;
    }
    
    public void setStatus(StatusTurma status) {
        this.status = status;
    }
    
    public static int getMinAlunos() {
        return MIN_ALUNOS;
    }
    
    public static int getMaxAlunos() {
        return MAX_ALUNOS;
    }
    
    public List<Aluno> getAlunos() {
        return alunos;
    }
    
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    // Métodos principais conforme UML
    public boolean adicionarAluno(Aluno aluno) {
        // Implementação será feita posteriormente
        return false;
    }
    
    public void verificarStatus() {
        // Implementação será feita posteriormente
    }
    
    // Métodos de relacionamento
    public boolean removerAluno(Aluno aluno) {
        // Implementação será feita posteriormente
        return false;
    }
    
    public int getQuantidadeAlunos() {
        // Implementação será feita posteriormente
        return 0;
    }
    
    public boolean estaCheia() {
        // Implementação será feita posteriormente
        return false;
    }
    
    public boolean podeAceitarAlunos() {
        // Implementação será feita posteriormente
        return false;
    }
    
    public boolean contemAluno(Aluno aluno) {
        // Implementação será feita posteriormente
        return false;
    }
    
    @Override
    public String toString() {
        // Implementação será feita posteriormente
        return "";
    }
    
    @Override
    public boolean equals(Object obj) {
        // Implementação será feita posteriormente
        return false;
    }
    
    @Override
    public int hashCode() {
        // Implementação será feita posteriormente
        return 0;
    }
}
