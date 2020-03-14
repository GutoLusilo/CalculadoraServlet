# SERVLET CALCULADORA

Projeto de Servlet simples em `JAVA` com api simples recebendo requisições http de um `HTML` e retornando um `HTML` em resposta.

## ESSA PASTA CONTÉM:

- Arquivo `index.html`: frontend da aplicação
- Arquivo `styles.css`: estilos para `index.html`
- Pasta `Desafio02_Calculadora`: servlet java com funções da aplicação

## COMO RODAR PROJETO:

1. Abra sua IDE Eclipse;
2. Importe o projeto 'Desafio02_Calculadora' dessa pasta para dentro do seu 
Eclipse;
3. Tenha certeza que há um servidor conectado ao projeto;
4. Entre no arquivo 'CalculadoraServlet.java' dentro da pasta 'src';
5. Rode o servidor apertando o botão de play;

> :warning: **Não se preocupe se der erro 500 no Eclipse neste momento, apenas continue os passos.**
O erro é devido ao Eclipse querer rodar o servlet, mas sem receber a requisição 
correta, que daremos com o arquivo 'index.html' desta pasta.

1. Com o servidor ainda rodando, abra o arquivo 'index.html' desta pasta no seu 
browser;
7. Utilize a calculadora: selecione valores númericos e um dos 4 operadores 
válidos e aperte "CALCULAR";

> :warning: **Não coloque valores inválidos nos inputs, ainda não há validação.** Apenas as operações + - * / são válidas.

8. Se ocorrer corretamente, o servlet receberá os dados da requisição enviada
pelo formulário que você preencheu agora e irá retorna um novo simples HTML, com 
a resposta da sua operação no centro da tela.
9. Para fazer um novo cálculo, retorne à página da calculadora e escolha novos
valores válidos.