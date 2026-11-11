// Classe Song que estende Media
class Song extends Media {
    // TODO: Declare o campo artist (String)
    private String artist;
    
    // TODO: Crie um construtor que recebe title e artist
    // Use super() para inicializar a classe pai
    public Song(String title, String artist) {
        super(title);
        this.artist = artist;
    }
    
    // TODO: Sobrescreva play() para imprimir: Playing song: [title] by [artist]
    @Override
    public void play() {
        System.out.println("Playing song: " + super.getTitle() + " by " + this.artist);
    }
    
    // TODO: Adicione o método showArtist() que imprime: Artist: [artist]
    public void showArtist() {
        System.out.println("Artist: " + this.artist);
    }
}
