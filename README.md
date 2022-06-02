# Sprint_01
## Exercícios da Sprint 01

### 1- Baseado no Scrum Guide, qual o tempo máximo deveriam ter as seguintes cerimônias:

1. Daily;
2. Planning;
3. Review;
4. Retrospectiva;

1. 15 minutos no máximo.
2. Tempo máximo de 8 horas para uma sprint de 1 mês, para sprints menor esse tempo tende a ser menor.
3. Tempo máximo de 4 horas para uma sprint de 1 mês, para sprints de prazo menor esse tempo geralmente é menor também.
4. Tempo máximo de 3 horas para uma sprint de 1 mês, para sprints de prazo menor esse tempo é usualmente menor.


### 2- José iniciou sua jornada recentemente com o git e não está conseguindo publicar seu arquivo README e a classe Product.js que acabou de criar. O erro do git da a seguinte informação: `Untracked Files`. Por que esse erro ocorreu e como resolver.

O git possuí 4 estágios para os arquivos: Não rastreado, Não Modificado, Modificado e "Staged".
Como o arquivo foi adicionado recentemente ele não é rastreado pelo git (o git não irá monitorar suas modificações), para resolver o problema é necessário adicionar os arquivos ao git. Para isso, usasse o `git add (filename)` No caso do José, pode ser `git add README` e `git add Product.js` ou `git add .` Importante lembrar que o `git add` serve para adicionar arquivos novos, bem como adicionar arquivos modificados para o "Staged". 


### 3- O time de desenvolvimento analisou e descobriu que o projeto está gerando arquivos pesados e desnecessários para serem commitados no repositório git. Em qual arquivo você deve incluir a lista de extensões para que esses arquivos descenssários sejam desconsiderados?

O arquivo para que seja feito a exclusão é no `gitignore`. Vale observar que o gitignore não possui extensão (`.txt`, `.pdf`)

Dentro do arquivo `gitignore` basta adicionar: `*.js` Nesse exemplo todos os arquivos `.js` serão ignorados: `*.(extensão)`. Ou `ignora/` Todos os arquivos dentro da pasta `ignora` serão ignorados. Existe outros métodos para ignorar arquivos como listado aqui: <a href="https://www.atlassian.com/br/git/tutorials/saving-changes/gitignore#:~:text=Caso%20queira%20ignorar%20um%20arquivo,forma%20de%20um%20arquivo%20ignorado." target="_blank" rel="external">Lista do .gitignore</a>


### 4- Com suas palavras, descreva as vantagens de utilizar o Scrum no seu projeto.

A vantagem de se utilizar o Scrum é a constante melhoria do projeto em etapas. O modelo em cascata por exemplo, o projeto é finalizado para se ter um primeiro resultado e pode ser que o cliente não goste do resultado, sendo necessário refazer as etapas gerando custos e perda de tempo. O Scrum contempla mudanças ao longo do projeto gerando o resultado esperado.


### 5- José foi promovido de seu cargo anterior e se tornou o novo Product Owner do time, quais são suas responsabilidades como PO ?

O Product Owner é a pessoa que irá definir os product backlog, as funcionalidades, bem como ordenar em prioridade as funcionalidades. Para isso é muito importante que o Product Owner tenha uma visão clara do produto. 
O Product Owner também valida os resultados obtidos pela sprint.
