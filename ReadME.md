# Exercicios!
## Exercicio 1 
* Fiz as variaveis INDICE (13), SOMA (0), K(0). 
* Depois fiz um While que enquanto K for menor que o Indice o loop vai continuar executando, ele vai incremente o K + 1 e vai adicionar o novo valor de K a variavel SOMA
* E o loop ira terminar quando o K se tornar 13.

## Exercicio 2 
* Usei um scanner para pegar o numero digitada pelo usuario, mas conforme proposto no desafio você pode setar esse numero ne uma variavel.
* Acabei usando um while que vai continuar repetindo a instrução enquanto a variavel A for menor ou igual ao numero informado, e quando o numero for igual ao numero informado significa que ele está na sequencia de Fibonacci e então retorna True
* E no proximo numero se o valor de A não for igual ao Numero informado, vai calcular o proximo numeroda sequência, atualizando o valor de A para o valor de B e o valor de B para o proximo numero calculado
* Só vai retornar False se o numero A se tornar maior que o numero informado assim indicando que o numero não está na sequencia de Fibonacci

## Exercicio 3
* Nesse exercicio acabei optando por usar por usar a biblioteca Jackson, é uma biblioteca usada pra trabalhar com JSON. ObjectMapper é uma classe da biblioteca utulizada para ler e escrever dados JSON
* Optei por deixar o Json em um arquirvo .json no projeto para não ter que escrever ele em um Array
* Salvei o arquivo em uma variavel colocando o path do arquivo

## Exercicio 4
* Importei as classes Hashmap e Map
* Utilizei o Map<String,Double> para armazenar o faturamento de cada estado em uma variavel
* Em seguida fiz uma variavel chamada valorTotal que vai amarzenar o valor total do faturamento dos estados
* Usei um For para percorrer por cada entrada de chave e valor do Map (chave = Estado, Valor = Faturamento do estado) 
* Salvei o estado, valor e percentual em variaveis e fiz o calculado do percentual
* E usei o "%.2f" para sempre exibir o porcentual com 2 casas decimais.

## Exercicio 5
* Usei um scanner para pegar a palavra digitada pelo usuario, mas conforme proposto no desafio você pode setar essa palavra ne uma variavel
* Criei uma variavel para salvar o metodo que vai inverter a palavra e coloquei o parâmetro sendo a String palavra
* Em seguida criei o metodo para inverter a palavra, e criei um Array de caracters que em cada posição do array ira armazenar um caractera da palavra informada
* Criei um For que vai continuar percorrendo enquanto o I for menor que a quantidade de caracters da palavra, e vai incrimentar I em cada iteração assim movendo para a proxima posição do array
* O palavra.lenght - 1 - i vai calcular o indice do caractere a ser atribuido ao array de caracters para a posição i. 
* Exemplo: a palavra Pedro, então seria 5 (quantidade de caracteres) - 1 (o caractere) - i (o caractere que ele está) então ficaria 5 - 1 - 0 = 4 (O), 5 - 1 - 1 = 3 (R), 5 - 1 - 2 = 2 (D), 5 - 1 - 3 (E), 5 - 1 - 4 (P).  




