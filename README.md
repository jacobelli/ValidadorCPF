## Descrição
Projeto em Java que vai validar números de CPF e CNPJ.  
Permitindo verificar se um CPF/CNPJ é válido ou inválido, incluindo testes de formato e lógica de dígitos verificadores.  
O projeto está sendo desenvolvido com foco em **QA**, incluindo testes manuais, automatizados e documentação.

---

## Funcionalidades
- Validação de CPF (11 dígitos)  
- Validação de CNPJ (14 dígitos)  
- Tratamento de entradas inválidas (letras, símbolos, todos os dígitos iguais)

---

## Estrutura do Projeto

ValidadorCPF/
│
├─ src/main/java/Validador.java # Código-fonte principal
├─ test/java/ValidadorTest.java # Testes unitários (JUnit)
├─ docs/CasosDeTeste.xlsx # Planilha de casos de teste
├─ README.md # Este arquivo
└─ .gitignore # Arquivo para ignorar arquivos desnecessários no GitHub

---

## Como rodar
1. Abra o terminal na pasta raiz do projeto.  
2. Compile o código:
```bash
javac src/main/java/Validador.java -d out
3. Execute
```bash
java -cp out Validador

Autor: T.Jacobelli
