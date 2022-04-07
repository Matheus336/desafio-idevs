# desafio-idevs

*Tecnologias Utilizadas:*

Linguagem de Programação: Java

IDE: Netbeans


_________________________________________________________________________________________________________________________________________________________________________


*Como rodar a aplicação:*

- Eclipse
- - No repositório do desafio clica-se em code e copia o link disponibilizado. Já no eclipse, clica-se no icone clone "git repository", cola-se o link na aba "url" e clica-se em next/next/finish. Clica-se em File/Import, seleciona a opção git/projects from git/existing local repository/next seleciona-se a opção "use the new project wizard" e finish, depois a tela padrão de um novo projeto do eclipse se abre, então clica-se em java project/next, desmarca-se a opção default location, e seleciona a pasta do git no computador, depois e next e finish e é só rodar a aplicação.

- Netbeans
- - No repositório do desafio clica-se em code e baixamos o repositório no arquivo .zip. Já no Netbeans, abrimos a opção File/Import Project/From ZIP. Depois, na opção ZIP file, clicamos em Browse, procuramos a pasta onde o arquivo .zip foi baixado, clicamos nele e depois em abrir.


_______________________________________________________________________________________________________________________________________________________________________


*Instruções*

Atividade 1: Se aberta de maneira correta, clicamos em run project.
             No console da IDE, irá aparecer uma frase, dizendo "Insira uma palavra:", ali podemos digitar qualquer palavra (inclusive sem diferenciação entre maiúsculas e minúsculas) e ao teclar enter, a aplicação deverá exibir: "A palavra digitada foi: XXXXXXX. A pontuação obtida foi XX."



Atividade 2: Se aberta de maneira correta, clicamos em run project.
             No console da IDE, irá aparecer a resposta do desafio 2, onde teremos todos os números n no intervalo 1 a 10000, cujo n e n+1 possuem o mesmo número de divisores. 
             PS: No console aparece uma exception "ArrayIndexOutOfBoundsException" que infelizmente não consegui remover, porém essa se refere a linha 27 do código, onde possue o acesso dos índices do array para impressão no console, sendo um deles um div[m+1], porém, quando m chega a 10000, essa expressão tenta acessar um índice fora dos limites do array declarado             



Atividade 3 Se aberta de maneira correta, clicamos em run project.
            No console da IDE, irá aparecer uma frase dizendo "Insira um número:", ali poderemos inserir algum número e teclar enter. A aplicação deverá exibir o número primo n mais próximo abaixo do número inserido anteriormente e um conjunto de números primos consecutivos que, se somados devem totalizar o numero n citado anteriormente. O console irá exibir no seguinte modelo: "XX = XX + XX + XX + XX".
