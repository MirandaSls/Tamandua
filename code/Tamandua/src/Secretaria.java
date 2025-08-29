import java.util.List;
import java.util.ArrayList;

public class Secretaria extends Usuario {
    private String setor;
    private List<Aluno> alunosGerenciados;
    private List<Curso> cursosGerenciados;
    
    public Secretaria() {
        super();
        this.alunosGerenciados = new ArrayList<>();
        this.cursosGerenciados = new ArrayList<>();
    }
    
    public Secretaria(String nome, String login, String senha) {
        super(nome, login, senha);
        this.alunosGerenciados = new ArrayList<>();
        this.cursosGerenciados = new ArrayList<>();
    }
    
    public Secretaria(String nome, String login, String senha, String setor) {
        super(nome, login, senha);
        this.setor = setor;
        this.alunosGerenciados = new ArrayList<>();
        this.cursosGerenciados = new ArrayList<>();
    }
    
    // Getters e Setters
    public String getSetor() {
        return setor;
    }
    
    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public List<Aluno> getAlunosGerenciados() {
        return alunosGerenciados;
    }
    
    public void setAlunosGerenciados(List<Aluno> alunosGerenciados) {
        this.alunosGerenciados = alunosGerenciados;
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
    public boolean gerenciarAluno(Aluno aluno) {
        // Implementação será feita posteriormente
        return false;
    }
    
    public boolean gerenciarCurriculo(Curso curso) {
        // Implementação será feita posteriormente
        return false;
    }
    
    // Métodos de relacionamento
    public boolean removerAlunoGerenciado(Aluno aluno) {
        // Implementação será feita posteriormente
        return false;
    }
    
    public boolean removerCursoGerenciado(Curso curso) {
        // Implementação será feita posteriormente
        return false;
    }
    
    public int getQuantidadeAlunosGerenciados() {
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
