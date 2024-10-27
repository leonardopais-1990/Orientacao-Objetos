# DESAFIO

Crie uma classe para representar Datas.

a. Represente uma data usando três atributos do tipo inteiro: o dia, o
mês, e o ano;

b. Crie um construtor que inicializa os três atributos (Exemplo: public
Data(int dia, int mes, int ano)) e verifica a validade dos valores fornecidos
(valor de dia entre 1 e 30 e valor de mês entre 1 e 12);

c. Crie um construtor sem parâmetros (Exemplo: public Data()) que
inicializa os valores dos atributos dia, mes e ano, com a data atual fornecida
pelo sistema operacional;

d. Crie os métodos getters e setters para cada atributo;

e. Crie um método chamado apresentaData() que retorna uma
representação da data como string. Considere que a data deve ser formatada
mostrando o dia, o mês e o ano separados por barra (/). Exemplo:
13/03/2024;

f. Crie uma método chamado apresentaData(boolean estacao) para
retornar uma representação da data como string, além de mostrar a estação
do ano. Nesse método, deve ser passado um valor booleano referente a
estação do ano como parâmetro (boolean estacao). Se o parâmetro estação
do ano passado for verdadeiro, imprima a data em formato completo e a
estação do ano correta. Por exemplo: 13 de março de 2024 – Estação
Outorno. Caso contrário, somente a data em formato completo (exemplo: 13
de março de 2024). 

Para facilitar a programação, considere as estações da seguinte forma:

Verão - Dezembro a Fevereiro
Outono - Março a Maio
Inverno - Junho a Agosto
Primavera - Setembro a Novembro

g. Crie um método (avancarData()) para avançar uma data para o dia
seguinte (Verifique a possibilidade de mudança de mês ou ano).

h. Crie um método (avancarData(int dias)) para avançar uma
quantidade específica de dias, passado por parâmetro (Verifique a
possibilidade de mudança de mês ou ano).

i. Escreva a classe principal para demonstrar as capacidades da
classe.
