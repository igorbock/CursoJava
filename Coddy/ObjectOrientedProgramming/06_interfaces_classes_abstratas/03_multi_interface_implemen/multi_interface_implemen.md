Vamos criar um sistema de dispositivos inteligentes em que os dispositivos podem ter várias capacidades. Você criará uma SmartTV que pode ser ligada/desligada e também ter seu volume controlado, demonstrando como uma única classe pode implementar várias interfaces para cumprir diferentes funções.

Você organizará seu código em quatro arquivos:

Powerable.java: Defina uma interface para dispositivos que podem ser ligados. Ela deve declarar dois métodos: powerOn() e powerOff(), ambos retornando void.
VolumeControl.java: Defina uma interface para dispositivos com controle de volume. Ela deve declarar um método setVolume(int level) que retorna void e um método getVolume() que retorna um int.
SmartTV.java: Crie uma classe que implemente as interfaces Powerable e VolumeControl. Sua SmartTV deve ter um campo brand (String), um campo isOn (boolean, inicialmente false) e um campo volume (int, inicialmente 0). Inclua um construtor que receba o nome da marca. Implemente todos os métodos obrigatórios:
powerOn() deve definir isOn como true e imprimir: [brand] TV is now ON
powerOff() deve definir isOn como false e imprimir: [brand] TV is now OFF
setVolume(int level) deve atualizar o volume e imprimir: [brand] TV volume set to [level]
getVolume() deve retornar o volume atual
Main.java: Reúna tudo para demonstrar a implementação de várias interfaces. Você receberá duas entradas: um nome de marca (String) e um nível de volume (int). Crie uma SmartTV com a marca fornecida e, em seguida:
Chame powerOn()
Chame setVolume() com o nível fornecido
Imprima: Current volume: [volume] usando getVolume()
Chame powerOff()
Você receberá duas entradas: a marca da TV (String) e o nível de volume (int).

Sua saída deve mostrar quatro linhas demonstrando como sua SmartTV cumpre os contratos de ambas as interfaces. Ela pode ser ligada como qualquer dispositivo Powerable e ter seu volume controlado como qualquer dispositivo VolumeControl!