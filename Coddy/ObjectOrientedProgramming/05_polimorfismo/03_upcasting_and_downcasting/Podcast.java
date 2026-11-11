// Classe Podcast que estende Media
class Podcast extends Media {
    // TODO: Declare o campo episode (int)
    private int episode;
    
    // TODO: Crie um construtor que recebe title e episode
    // Use super() para inicializar a classe pai
    public Podcast(String title, int episode) {
        super(title);
        this.episode = episode;
    }
    
    // TODO: Override play() to print: Playing podcast: [title] - Episode [episode]
    @Override
    public void play() {
        System.out.println("Playing podcast: " + super.getTitle() + " - Episode " + this.episode);
    }
    
    // TODO: Adicione o método showEpisode() que imprime: Episode: [episode]
    public void showEpisode() {
        System.out.println("Episode: " + this.episode);
    }
}
