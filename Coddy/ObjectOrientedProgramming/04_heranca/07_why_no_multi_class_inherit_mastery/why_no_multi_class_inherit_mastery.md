Java não permite que Duck estenda tanto Bird quanto uma classe Aquatic separada; portanto, Duck estende apenas Bird (continuando uma cadeia de herança única a partir de Animal) e implementa duas interfaces para adicionar as capacidades extras sem qualquer ambiguidade do diamante.

Animal(String name) armazena o nome; describe() retorna name + " is an animal"
Bird extends Animal adiciona chirp(), que retorna name + " chirps"
interface Flyable declara fly(); interface Swimmable declara swim()
Duck extends Bird implements Flyable, Swimmable: fly() retorna name + " flies over the pond", swim() retorna name + " swims across the pond"