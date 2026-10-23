# Projeto Calculadora — FinançApp

> Projeto acadêmico desenvolvido com foco em qualidade de software, testes, refatoração, documentação e versionamento.

## 1. Identificação do Projeto

| Campo | Informação |
|---|---|
| Projeto | Projeto Calculadora |
| Contexto | FinançApp |
| Aluno | Matheus Saraiva Veloso |
| RA | 240651 |
| Curso / Disciplina / Professor | Preencher os dados que faltarem antes da entrega |
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

A saída reproduzível está registrada como transcript abaixo. A captura de tela real do terminal ainda precisa ser adicionada em `images/testes/` antes da entrega.

## 7. Refatoração

A branch `Refatoracao` contém a versão reorganizada, com operação de divisão extraída para método privado, mensagem de validação centralizada e JavaDoc. Os testes são executados novamente nesta versão e precisam continuar aprovados.

## 8. JavaDoc

Gere ou atualize a documentação HTML com:

```powershell
javadoc -encoding UTF-8 -d docs-gerada src/calculadora/Calculadora.java test/calculadora/TesteCalculadora.java
Copy-Item docs-gerada/* docs/ -Recurse -Force
```

Abra `docs/index.html` no navegador. A pasta `docs/` deste projeto contém a documentação gerada.

### Evidência da documentação

A atividade também solicita capturas de tela da saída dos testes e do JavaDoc. O transcript reproduzível dos testes está abaixo. As capturas de tela reais do terminal e da documentação aberta no navegador ainda precisam ser adicionadas em `images/testes/` e `images/javadoc/`.

## 9. Versionamento e repositório

Branches locais: `main` (implementação inicial) e `Refatoracao` (versão refatorada). O endereço fornecido na atividade (`https://github.com/dr-ohata/calculadora_refatoracao`) é o repositório de referência do modelo README, não o repositório remoto deste aluno.

**Perfil GitHub do aluno:** [MatheusVelosoDEV](https://github.com/MatheusVelosoDEV)

**Link do repositório deste projeto:** pendente de criação/publicação; o perfil fornecido não identifica um repositório da calculadora.

## 10. Requisitos atendidos

| ID | Requisito | Status |
|---|---|---|
| RF01–RF04 | Quatro operações básicas | Implementado |
| RF05 | Proteção contra divisão por zero | Implementado |
| RF06 | Mensagem para operação inválida | Implementado |
| RNF02 | Testes automatizados reproduzíveis | Implementado |
| RNF04 | JavaDoc HTML | Gerado em `docs/` |
| RNF05 | Git e branches | Branches locais criadas |



### Saída dos testes

```text
[PASSOU] soma | esperado=7 | obtido=7
[PASSOU] subtração | esperado=6 | obtido=6
[PASSOU] multiplicação | esperado=42 | obtido=42
[PASSOU] divisão inteira | esperado=4 | obtido=4
[PASSOU] divisão com resto | esperado=2 | obtido=2
[PASSOU] divisão por zero | exceção=ArithmeticException
[PASSOU] operação inválida | esperado=0 | obtido=0
Resultado: 7/7 testes aprovados.
```


