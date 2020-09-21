<h1> Analisador Léxico Linguagem LA </h1>

<h2> Membros do Grupo </h2>
<ol>
  <li> Daniel Lamounier Heringer, RA: 743524 </li>
  <li> João Gabriel Damasceno, RA: 726545 </li>
  <li> Sergio Ricardo Hideki Nisikava, RA: 551848 </li>
</ol>
<h2> Dependencias </h2>

<ol>
  <li> Netbeans 12.0 </li>
  <li> JDK 11.0.8 </li>
  <li> Maven 11 </li>
  <li> ANTLR 4.8 </li>
</ol>

<h2> Compilação </h2>

No Netbeans utilizar a ferramenta Clean and Build para o projeto.

<h2> Execução </h2>

O projeto possui o arquivo executável alguma-lexico/target/alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar que deverá ser executado da seguinte forma: 

```
java -jar arquivo_executavel entrada saida.txt
```
Onde:

<ol>
  <li> arquivo_executavel: caminho do arquivo .jar contendo as dependências </li>
  <li> entrada: caminho do caso de teste de entrada </li>
  <li> saida.txt: caminho para o arquivo de saída ser gerado</li>
</ol>
 
 exemplo: 
 ```
java -jar C:\Users\joaog\Documents\NetBeansProjects\LA-Sintatico\target\LA-Sintatico-1.0-SNAPSHOT-jar-with-dependencies.jar C:\Users\joaog\Desktop\programa.txt C:\temp\saida.txt
 ```
