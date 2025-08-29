import java.util.List;
import java.util.ArrayList;

public class Aluno extends Usuario {
    private String matricula;
    private String curso;
    private int semestre;
    private List<Turma> turmas;
    private SistemaCobranca sistemaCobranca;
    
    public Aluno() {
        super();
        this.turmas = new ArrayList<>();
    }
    
    public Aluno(String nome, String login, String senha) {
        super(nome, login, senha);
        this.turmas = new ArrayList<>();
    }
    
    public Aluno(String nome, String login, String senha, String matricula, String curso, int semestre) {
        super(nome, login, senha);
        this.matricula = matricula;
        this.curso = curso;
        this.semestre = semestre;
        this.turmas = new ArrayList<>();
    }
    
    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public int getSemestre() {
        return semestre;
    }
    
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public List<Turma> getTurmas() {
        return turmas;
    }
    
    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
    
    public SistemaCobranca getSistemaCobranca() {
        return sistemaCobranca;
    }
    
    public void setSistemaCobranca(SistemaCobranca sistemaCobranca) {
        this.sistemaCobranca = sistemaCobranca;
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
    
    // Métodos específicos conforme UML
    public boolean matricular(Turma turma) {
        // Implementação será feita posteriormente
        // Nota: Este método deve notificar o Sistema de Cobrança conforme UML
        return false;
    }
    
    public boolean cancelarMatricula(Turma turma) {
        // Implementação será feita posteriormente
        return false;
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
    
    public boolean estaMatriculado(Turma turma) {
        // Implementação será feita posteriormente
        return false;
    }
    
    public int getQuantidadeTurmas() {
        // Implementação será feita posteriormente
        return 0;
    }
    
    public int getCreditosCursando() {
        // Implementação será feita posteriormente
        // Calcular créditos das disciplinas das turmas matriculadas
        return 0;
    }
    
    @Override
    public String toString() {
        // Implementação será feita posteriormente
        return "";
    }
}
