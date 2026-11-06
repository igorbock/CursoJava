Modele uma pequena hierarquia de empresa: um Intern estende Employee diretamente (herança simples), enquanto um Director estende Manager, que estende Employee, com quatro níveis de profundidade contando Object (herança multinível).

Employee(String name, double salary) armazena ambos os campos; describe() retorna name + " earns " + salary
Intern(String name, double stipend) passa 0 como salário para Employee e sobrescreve describe() para retornar name + " is an intern earning a stipend of " + stipend
Manager(String name, double salary, int teamSize) estende Employee e adiciona bonus(), que retorna teamSize * 100.0
Director(String name, double salary, int teamSize, int regions) estende Manager e adiciona totalCompensation(), que retorna getSalary() + bonus() + regions * 500.0