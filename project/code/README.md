# Histórias de Usuário: Sistema de Matrículas

Esta seção descreve as funcionalidades do sistema sob a perspectiva dos diferentes usuários e do próprio sistema, seguindo o formato padrão de Histórias de Usuário.

### Para o Aluno

* **HU01: Autenticação de Usuário**
    * **Como um** aluno,
    * **Eu quero** fazer login no sistema com meu usuário e senha,
    * **Para que** eu possa acessar minhas funcionalidades de matrícula de forma segura.

* **HU02: Realizar Matrícula em Disciplinas**
    * **Como um** aluno,
    * **Eu quero** poder selecionar 4 disciplinas obrigatórias como 1ª opção e mais 2 disciplinas optativas,
    * **Para que** eu possa montar minha grade curricular para o próximo semestre.

* **HU03: Cancelar Matrícula em Disciplinas**
    * **Como um** aluno,
    * **Eu quero** poder cancelar matrículas feitas anteriormente durante o período permitido,
    * **Para que** eu possa ajustar minha grade de horários caso mude de ideia.

* **HU04: Receber Confirmação de Matrícula**
    * **Como um** aluno,
    * **Eu quero** ser informado quando minha matrícula for processada e minhas turmas confirmadas,
    * **Para que** eu tenha a certeza de quais disciplinas irei cursar.

### Para a Secretaria

* **HU05: Autenticação de Usuário (Secretaria)**
    * **Como um** membro da secretaria,
    * **Eu quero** fazer login no sistema com meu usuário e senha,
    * **Para que** eu possa realizar as tarefas administrativas de forma segura.

* **HU06: Gerenciar Currículo do Semestre**
    * **Como um** membro da secretaria,
    * **Eu quero** gerar e manter o currículo de cada semestre, incluindo cursos, disciplinas e o número de créditos correspondente,
    * **Para que** os alunos tenham a oferta de disciplinas correta para se matricularem.

* **HU07: Manter Informações de Alunos e Professores**
    * **Como um** membro da secretaria,
    * **Eu quero** poder cadastrar, atualizar e consultar as informações dos alunos e professores,
    * **Para que** a base de dados do sistema se mantenha íntegra e atualizada.

### Para o Professor

* **HU08: Autenticação de Usuário (Professor)**
    * **Como um** professor,
    * **Eu quero** fazer login no sistema com meu usuário e senha,
    * **Para que** eu possa acessar as informações das minhas turmas.

* **HU09: Consultar Alunos Matriculados**
    * **Como um** professor,
    * **Eu quero** poder consultar a lista de todos os alunos matriculados em cada uma das minhas disciplinas,
    * **Para que** eu possa ter o controle da minha turma e iniciar as atividades do semestre.

### Para o Sistema (Requisitos Funcionais)

* **HU10: Ativar Disciplinas com Quórum Mínimo**
    * **Como o** sistema,
    * **Eu quero** verificar, ao final do período de matrícula, todas as disciplinas que atingiram o mínimo de 3 alunos inscritos,
    * **Para que** estas disciplinas sejam ativadas e possam ocorrer no semestre seguinte.

* **HU11: Cancelar Disciplinas sem Quórum Mínimo**
    * **Como o** sistema,
    * **Eu quero** cancelar automaticamente as disciplinas com menos de 3 alunos inscritos ao final do período de matrículas,
    * **Para que** os recursos da universidade não sejam alocados para turmas que não ocorrerão.

* **HU12: Encerrar Inscrições de Turmas Cheias**
    * **Como o** sistema,
    * **Eu quero** encerrar as inscrições para uma disciplina assim que o número de 60 alunos matriculados for atingido,
    * **Para que** o limite máximo de vagas por turma seja respeitado.

* **HU13: Notificar o Sistema de Cobranças**
    * **Como o** sistema de matrículas,
    * **Eu quero** notificar o sistema de cobranças após um aluno ter sua inscrição para o semestre confirmada,
    * **Para que** o processo de faturamento das mensalidades possa ser iniciado.
