Complete as classes Employee e Manager. Manager extends Employee e sobrescreve dois métodos, estendendo a versão da classe pai em vez de substituí-la.

O construtor de Manager recebe um nome, um salário-base e um bônus, passa o nome e o salário-base para a classe pai com super e armazena o bônus por conta própria
O describe() de Manager chama o describe() da classe pai com super e acrescenta " (Manager)"
O getPaySummary() de Manager chama o getPaySummary() da classe pai com super e acrescenta ", bonus $" + bonus + ", total $" + total, em que total é o salário-base mais o bônus