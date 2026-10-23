# Projeto Calculadora — FinançApp

> Projeto acadêmico desenvolvido com foco em qualidade de software, testes, refatoração, documentação e versionamento.

## 1. Identificação do Projeto

| Campo | Informação |
|---|---|
| Projeto | Projeto Calculadora |
| Contexto | FinançApp |
| Aluno / RA | Preencher antes da entrega |
| Curso / Disciplina / Professor | Preencher antes da entrega |
| Semestre | 2026.2 |

## 2. Visão geral e objetivo

Este projeto implementa em Java um módulo reutilizável de cálculos básicos para apoiar orçamento mensal, divisão de despesas e projeções financeiras. A atividade pratica testes funcionais e unitários, tratamento de erros, refatoração sem mudança de comportamento, JavaDoc e versionamento.

## 3. Operações e regras

`Calculadora.calc(int a, int b, String op)` aceita `+`, `-`, `*` e `/`. Como a assinatura usa inteiros, divisão trunca a parte fracionária. Operador não suportado exibe uma mensagem e retorna zero. Divisão por zero lança `ArithmeticException` com mensagem explicativa, permitindo que o chamador trate a falha sem encerrar inesperadamente a aplicação.

## 4. Tecnologias

- Java / JDK 24 e JavaDoc;
- Git e GitHub;
- testes executáveis em Java, usando verificações e asserções sem dependências externas.

## 5. Estrutura

```text
projeto_calculadora/
├── src/calculadora/Calculadora.java
├── test/calculadora/TesteCalculadora.java
├── docs/                  # documentação JavaDoc gerada
├── images/testes/         # evidências de execução
├── images/javadoc/        # evidências da documentação
├── images/refatoracao/    # evidências do processo
└── README.md
```

## 6. Compilar e executar os testes

Requer JDK 24 (ou versão compatível). No PowerShell, a partir da raiz:

```powershell
New-Item -ItemType Directory -Force out | Out-Null
javac -encoding UTF-8 -d out src/calculadora/Calculadora.java test/calculadora/TesteCalculadora.java
java -ea -cp out calculadora.TesteCalculadora
```

A suíte cobre soma, subtração, multiplicação, divisão exata, divisão com resto, divisão por zero e operador inválido. Cada caso mostra entrada no código, resultado esperado e obtido (ou exceção esperada). Resultado atual: **7/7 testes aprovados**.

### Evidência dos testes

A saída reproduzível do comando acima está registrada como texto no terminal; salve uma captura de tela em `images/testes/` antes da entrega, conforme solicitado na atividade.

## 7. Refatoração

A branch `Refatoracao` contém a versão reorganizada, com operação de divisão extraída para método privado, mensagem de validação centralizada e JavaDoc. Os testes são executados novamente nesta versão e precisam continuar aprovados.

## 8. JavaDoc

Gere ou atualize a documentação HTML com:

```powershell
javadoc -encoding UTF-8 -d docs-nova src/calculadora/Calculadora.java test/calculadora/TesteCalculadora.java`nCopy-Item docs-nova/* docs/ -Recurse -Force
```

Abra `docs/index.html` no navegador. A pasta `docs/` deste projeto contém a documentação gerada.

### Evidência da documentação

Salve uma captura de `docs/index.html` aberto no navegador em `images/javadoc/` antes da entrega.

## 9. Versionamento e repositório

Branches locais: `main` (implementação inicial) e `Refatoracao` (versão refatorada). O endereço fornecido na atividade (`https://github.com/dr-ohata/calculadora_refatoracao`) é o repositório de referência do modelo README, não o repositório remoto deste aluno.

**Link do repositório do aluno:** adicionar após criar/publicar o repositório pessoal no GitHub.

## 10. Requisitos atendidos

| ID | Requisito | Status |
|---|---|---|
| RF01–RF04 | Quatro operações básicas | Implementado |
| RF05 | Proteção contra divisão por zero | Implementado |
| RF06 | Mensagem para operação inválida | Implementado |
| RNF02 | Testes automatizados reproduzíveis | Implementado |
| RNF04 | JavaDoc HTML | Gerado em `docs/` |
| RNF05 | Git e branches | Branches locais criadas |

