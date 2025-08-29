public abstract class Usuario {
    protected String nome;
    protected String login;
    protected String senha;
    protected boolean ativo;
    
    public Usuario() {
        this.ativo = true;
    }
    
    public Usuario(String nome, String login, String senha) {
        this();
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean isAtivo() {
        return ativo;
    }
    
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    // Métodos abstratos conforme UML
    public abstract boolean efetuarLogin();
    
    public abstract void recuperarSenha();
    
    // Métodos comuns para todas as classes filhas (sem implementação)
    public boolean alterarSenha(String senhaAtual, String novaSenha) {
        // Implementação será feita posteriormente
        return false;
    }
    
    public boolean validarCredenciais(String login, String senha) {
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
