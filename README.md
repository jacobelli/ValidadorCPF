## Descrição
Projeto em Java que vai validar números de CPF.
Permitindo verificar se um CPF é válido ou inválido, incluindo testes de formato e lógica de dígitos verificadores.  
O projeto está sendo desenvolvido com foco em **QA**, incluindo testes manuais, automatizados e documentação.

---

## Funcionalidades
- Validação de CPF (11 dígitos)    
- Tratamento de entradas inválidas (letras, símbolos, todos os dígitos iguais)
- Testes unitários com JUnit 5

---

## Estrutura do Projeto
```
ValidadorCPF/
│
├─ src/main/java/ValidadorNovo.java # Código-fonte principal
├─ src/test/java/ValidadorTest.java # Testes unitários (JUnit)
├─ docs/CasosDeTeste # Planilha de casos de teste
├─ libs/junit-platform-console-standalone-1.9.3.jar # JUnit 5 standalone
├─ README.md # Este arquivo
└─ .gitignore # Arquivo para ignorar arquivos desnecessários no GitHub
```
## Como rodar
1. Abra o terminal na pasta raiz do projeto.  
2. Compile o código:
```
javac -encoding UTF-8 -d out src/main/java/ValidadorNovo.java
```
3. Execute:
```
java -cp out ValidadorNovo
```
Executar os testes (JUnit 5)
1. Compile os testes incluindo o JUnit no classpath:
```
javac -cp "libs/junit-platform-console-standalone-1.9.3.jar;out" -d out src/test/java/ValidadorTest.java
```
2. Rode os testes:
```
java -jar libs/junit-platform-console-standalone-1.9.3.jar --class-path out --scan-class-path
```
---

**Autor:**  
T. Jacobelli
