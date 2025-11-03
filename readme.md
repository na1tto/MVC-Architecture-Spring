# ABSTRACT FACTORY

### O QUE É?

Abstract factory é um padrão de projeto **criacional**, ou seja, ele define uma lógica para criação de classes.
No caso desse padrão, ele busca definir uma lógica para a criação de famílias de classes que se relacionam ou dependem
de si através de uma **fábrica abstrata** e uma **fábrica concreta**.

### A Fábrica Abstrata e a Fábrica Concreta (Abstract Factory and Concrete Factory)

As fábricas abstrata e concreta são o ponto-chave da implementação desse padrão, a fábrica abstrata é responsável por
fornecer uma interface comum que o código cliente pode acessar. A partir disso, são definidas as fábricas concretas, que
serão responsáveis por implementar as variações das famílias de classes, com seus comportamentos específicos. Ou seja, com
esse padrão não é necessário especificar classes concretas de uma família até que sejam necessárias, isso permite uma maior
flexibilidade no projeto como um todo, já que classes pertecentes a uma determinada família podem ser facilmente inseridas ou removidas
da loja da aplicação de acordo com a necessidade do projeto em que o padrão foi implementado.
