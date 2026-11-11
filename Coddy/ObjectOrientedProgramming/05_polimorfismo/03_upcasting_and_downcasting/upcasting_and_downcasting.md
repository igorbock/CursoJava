Vamos criar um sistema de reprodução de mídia que demonstra tanto upcasting quanto downcasting na prática. Você criará uma hierarquia de tipos de mídia e praticará a conversão entre referências de pai e de filho.

Você organizará seu código em quatro arquivos:

Media.java: Crie a classe base compartilhada por todos os tipos de mídia. Cada item de mídia possui um campo title (String). Inclua um construtor para inicializá-lo, um método getter getTitle() e um método play() que imprime: Playing: [title]
Song.java: Crie uma classe que estenda Media. As músicas possuem um campo adicional artist (String). Use super para a inicialização da classe pai. Substitua play() para imprimir: Playing song: [title] by [artist]. Adicione um método showArtist() que imprime: Artist: [artist]
Podcast.java: Crie outra classe que estenda Media. Os podcasts possuem um campo episode (int). Substitua play() para imprimir: Playing podcast: [title] - Episode [episode]. Adicione um método showEpisode() que imprime: Episode: [episode]
Main.java: Demonstre upcasting e downcasting com seus tipos de mídia. Você receberá quatro entradas: o título de uma música, o nome de um artista, o título de um podcast e um número de episódio.
Primeiro, crie um Song e faça o upcasting para uma referência Media. Chame play() nessa referência para observar o polimorfismo em tempo de execução.

Em seguida, faça o downcasting dessa referência Media de volta para Song e chame showArtist() para acessar o método específico da classe filha.

Depois, crie um Podcast e faça o upcasting para uma referência Media. Chame play() nessa referência.

Por fim, faça o downcasting dessa referência Media de volta para Podcast e chame showEpisode().

Você receberá quatro entradas: o título da música (String), o nome do artista (String), o título do podcast (String) e o número do episódio (int).

Sua saída deve mostrar quatro linhas — duas para a música (a saída de reprodução e as informações do artista) e duas para o podcast (a saída de reprodução e as informações do episódio). Observe como o upcasting permite tratar diferentes tipos de mídia de maneira uniforme, enquanto o downcasting permite acessar seus recursos exclusivos!


