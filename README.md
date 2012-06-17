# Exercícios da aula 3

* Implementar os métodos `foldLeft`, `find` e `findAll` como definidos nos testes já disponíveis no projeto
* Implementar uma classe Pilha<E> usando genéricos, a pilha deve suportar as seguintes operações (testes inclusos no projeto):
  * `push` - adiciona um item no topo da pilha
  * `pop` - remove e retorna o item no topo da pilha
  * `peek` - retornar (sem remover) o item no topo da pilha
  * `size` - retornar a quantidade de itens na pilha
* Implementar uma classe Cliente com nome, cpf e data de nascimento, essa classe `Cliente` deve ter os métodos `equals`, `hashCode` deve implementar a interface `Comparable` considerando a ordem como sendo a data de nascimento de forma crescente. Além disso, deve haver uma implementação de `Comparator` de `Cliente` que tenha como ordem a data de nascimento de forma decrescente.
* Descreva qual a diferença entre `checked exceptions` e `unchecked exceptions`, quais tipos de exceção devemos tratar em programas em Java e por que existem casos onde não devemos fazer tratamento.