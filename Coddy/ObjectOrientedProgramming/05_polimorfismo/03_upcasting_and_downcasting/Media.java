// Classe base para todos os tipos de mídia
class Media {
    // TODO: Declare o campo title (String)
    private String title;

    // TODO: Crie um construtor que inicializa o title
    public Media(String title) {
        this.title = title;
    }

    // TODO: Crie um método getter getTitle()
    public String getTitle() {
        return this.title;
    }
    
    // TODO: Crie um método play() que imprime: Playing: [title]
    public void play() {
        System.out.println("Playing: " + this.title);
    }
}
