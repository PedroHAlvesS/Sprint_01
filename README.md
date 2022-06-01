# Sprint_01
## Exercícios da Sprint 01

### 1- Baseado no Scrum Guide, qual o tempo máximo deveriam ter as seguintes cerimônias:

1. Daily;
2. Planning;
3. Review;
4. Retrospectiva;

:point_down:

1. 15 minutos no máximo.
2. Tempo máximo de 8 horas para uma sprint de 1 mês, para sprints menor esse tempo tende a ser menor.
3. Tempo máximo de 4 horas para uma sprint de 1 mês, para sprints de prazo menor esse tempo geralmente é menor também.
4. Tempo máximo de 3 horas para uma sprint de 1 mês, para sprints de prazo menor esse tempo é usualmente menor.


### 2- José iniciou sua jornada recentemente com o git e não está conseguindo publicar seu arquivo README e a classe Product.js que acabou de criar. O erro do git da a seguinte informação: `Untracked Files`. Por que esse erro ocorreu e como resolver.

:point_down:

O git possuí 4 estágios para os arquivos: Não rastreado, Não Modificado, Modificado e "Staged".
Como o arquivo foi adicionado recentemente ele não é rastreado pelo git (o git não irá monitorar suas modificações), para resolver o problema é necessário adicionar os arquivos ao git. Para isso, usasse o `git add (filename)` No caso do José, pode ser `git add README` e `git add Product.js` ou `git add .` Importante lembrar que o `git add` serve para adicionar arquivos novos, bem como adicionar arquivos modificados para o "Staged". 
