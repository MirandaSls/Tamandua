import java.util.List;
import java.util.ArrayList;

public class Administrador extends Usuario {
    private String nivelAcesso;
    private List<Professor> professoresGerenciados;
    private List<Disciplina> disciplinasGerenciadas;
    private List<Curso> cursosGerenciados;
    
    public Administrador() {
        super();
        this.professoresGerenciados = new ArrayList<>();
        this.disciplinasGerenciadas = new ArrayList<>();
        this.cursosGerenciados = new ArrayList<>();
    }
    
    public Administrador(String nome, String login, String senha) {
        super(nome, login, senha);
        this.professoresGerenciados = new ArrayList<>();
        this.disciplinasGerenciadas = new ArrayList<>();
        this.cursosGerenciados = new ArrayList<>();
    }
    
    public Administrador(String nome, String login, String senha, String nivelAcesso) {
        super(nome, login, senha);
        this.nivelAcesso = nivelAcesso;
        this.professoresGerenciados = new ArrayList<>();
        this.disciplinasGerenciadas = new ArrayList<>();
        this.cursosGerenciados = new ArrayList<>();
    }
    
    // Getters e Setters
    public String getNivelAcesso() {
        return nivelAcesso;
    }
    
    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    public List<Professor> getProfessoresGerenciados() {
        return professoresGerenciados;
    }
    
    public void setProfessoresGerenciados(List<Professor> professoresGerenciados) {
        this.professoresGerenciados = professoresGerenciados;
    }
    
    public List<Disciplina> getDisciplinasGerenciadas() {
        return disciplinasGerenciadas;
    }
    
    public void setDisciplinasGerenciadas(List<Disciplina> disciplinasGerenciadas) {
        this.disciplinasGerenciadas = disciplinasGerenciadas;
    }
    
    public List<Curso> getCursosGerenciados() {
        return cursosGerenciados;
    }
    
    public void setCursosGerenciados(List<Curso> cursosGerenciados) {
        this.cursosGerenciados = cursosGerenciados;
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
    public boolean gerenciarProfessor(Professor prof) {
        // Implementação será feita posteriormente
        return false;
    }
    
    public boolean gerenciarDisciplina(Disciplina disc) {
        // Implementação será feita posteriormente
        return false;
    }
    
    public boolean gerenciarCurso(Curso curso) {
        // Implementação será feita posteriormente
        return false;
    }
    
    // Métodos de relacionamento
    public boolean removerProfessorGerenciado(Professor prof) {
        // Implementação será feita posteriormente
        return false;
    }
    
    public boolean removerDisciplinaGerenciada(Disciplina disc) {
        // Implementação será feita posteriormente
        return false;
    }
    
    public boolean removerCursoGerenciado(Curso curso) {
        // Implementação será feita posteriormente
        return false;
    }
    
    public int getQuantidadeProfessoresGerenciados() {
        // Implementação será feita posteriormente
        return 0;
    }
    
    public int getQuantidadeDisciplinasGerenciadas() {
        // Implementação será feita posteriormente
        return 0;
    }
    
    public int getQuantidadeCursosGerenciados() {
        // Implementação será feita posteriormente
        return 0;
    }
    
    @Override
    public String toString() {
        // Implementação será feita posteriormente
        return "";
    }
}
