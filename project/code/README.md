# Histórias de Usuário: Sistema Acadêmico

Esta seção descreve as funcionalidades do sistema sob a perspectiva dos diferentes usuários e integrações, com base no diagrama de caso de uso e seguindo o formato padrão de Histórias de Usuário.

## Para o Usuário (Geral)

### HU01: Recuperação de Senha
- **Como um** usuário do sistema (aluno, professor, etc.),
- **Eu quero** poder recuperar minha senha caso a tenha esquecido,
- **Para que** eu possa restabelecer meu acesso à plataforma.

---

## Para o Aluno

### HU02: Autenticação de Usuário (Aluno)
- **Como um** aluno,
- **Eu quero** fazer login no sistema com minhas credenciais,
- **Para que** eu possa acessar minhas funcionalidades de forma segura.

### HU03: Realizar Matrícula em Disciplinas
- **Como um** aluno,
- **Eu quero** poder me matricular nas disciplinas obrigatórias e optar pelas disciplinas optativas disponíveis,
- **Para que** eu possa montar minha grade curricular para o semestre.

### HU04: Cancelar Matrícula
- **Como um** aluno,
- **Eu quero** poder cancelar a matrícula em uma disciplina,
- **Para que** eu possa ajustar minha grade de horários, se necessário.

---

## Para o Professor

### HU05: Autenticação de Usuário (Professor)
- **Como um** professor,
- **Eu quero** fazer login no sistema com minhas credenciais,
- **Para que** eu possa acessar as informações das minhas turmas de forma segura.

### HU06: Consultar Alunos Matriculados
- **Como um** professor,
- **Eu quero** poder consultar a lista de alunos matriculados em minhas disciplinas,
- **Para que** eu possa gerenciar a turma e realizar o controle de frequência e notas.

---

## Para a Secretaria

### HU07: Autenticação de Usuário (Secretaria)
- **Como um** membro da secretaria,
- **Eu quero** fazer login no sistema com minhas credenciais,
- **Para que** eu possa realizar as tarefas administrativas de forma segura.

### HU08: Gerenciar Alunos
- **Como um** membro da secretaria,
- **Eu quero** poder cadastrar, consultar, atualizar e remover alunos do sistema,
- **Para que** a base de dados de estudantes se mantenha sempre íntegra e atualizada.

### HU09: Gerar Currículo do Aluno
- **Como um** membro da secretaria,
- **Eu quero** poder gerar o currículo (histórico escolar) de qualquer aluno,
- **Para que** eu possa emitir o documento oficial quando solicitado.

---

## Para o Administrador

### HU10: Autenticação de Usuário (Administrador)
- **Como um** administrador,
- **Eu quero** fazer login no sistema com minhas credenciais,
- **Para que** eu possa acessar as funcionalidades de configuração geral do sistema.

### HU11: Gerenciar Professores
- **Como um** administrador,
- **Eu quero** poder gerenciar o cadastro de professores (adicionar, editar, remover),
- **Para que** o corpo docente da instituição esteja corretamente registrado na plataforma.

### HU12: Gerenciar Disciplinas
- **Como um** administrador,
- **Eu quero** poder gerenciar o cadastro das disciplinas (criar, editar, excluir),
- **Para que** a oferta de matérias para os alunos esteja sempre correta.

### HU13: Gerenciar Cursos
- **Como um** administrador,
- **Eu quero** poder gerenciar os cursos da instituição (criar, editar, associar disciplinas),
- **Para que** a estrutura acadêmica do sistema esteja bem definida.

---

## Para o Sistema (Requisitos de Integração)

### HU14: Notificar o Sistema de Cobrança
- **Como o** sistema acadêmico,
- **Eu quero** notificar o sistema de cobrança quando uma matrícula de aluno for efetivada,
- **Para que** o processo de faturamento seja iniciado corretamente.
