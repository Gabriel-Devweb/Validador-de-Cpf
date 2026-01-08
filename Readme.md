# Validador de CPF em Java

Projeto em Java para validar CPF via terminal, aplicando boas práticas de organização e separação de responsabilidades.

O foco é estudar lógica, orientação a objetos e estrutura de projeto, sem frameworks.

---

## 📌 O que o projeto faz

- Recebe um CPF digitado pelo usuário
- Remove pontos, traços e qualquer caractere inválido
- Verifica:
  - se o CPF tem 11 dígitos
  - se não possui todos os números iguais
  - se os dígitos verificadores são válidos
- Informa se o CPF é válido ou inválido

---

## 🧱 Estrutura do projeto
Cpf/ ├── app/ │   └── App.java └── src/ ├── Cpf.java └── CpfValidador.java
Copiar código

### Responsabilidades

- **App**
  - Entrada e saída de dados
  - Leitura do CPF via `Scanner`
  - Exibição do resultado no terminal

- **Cpf**
  - Limpeza do CPF
  - Validações estruturais
  - Armazena o estado do CPF limpo

- **CpfValidador**
  - Cálculo dos dígitos verificadores
  - Validação matemática do CPF

---

## ▶️ Como compilar e executar

Acesse a pasta raiz do projeto:

```bash
cd Cpf
Compile os arquivos:
Copiar código
Bash
javac src/*.java app/App.java
Execute o programa:
Copiar código
Bash
java app.App