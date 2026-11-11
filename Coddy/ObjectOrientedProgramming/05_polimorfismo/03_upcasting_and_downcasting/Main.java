import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String songTitle = scanner.nextLine();
        String artistName = scanner.nextLine();
        String podcastTitle = scanner.nextLine();
        int episodeNumber = scanner.nextInt();
        
        // TODO: Crie um Song e faça upcast para uma referência Media
        Media media = new Song(songTitle, artistName);
        
        // TODO: Chame play() na referência Media (demonstra polimorfismo)
        media.play();
        
        // TODO: Faça downcast da referência Media de volta para Song
        Song song = (Song) media;
        
        // TODO: Chame showArtist() na referência Song
        song.showArtist();
        
        // TODO: Crie um Podcast e faça upcast para uma referência Media
        Media podMedia = new Podcast(podcastTitle, episodeNumber);
        
        // TODO: Chame play() na referência Media
        podMedia.play();
        
        // TODO: Faça downcast da referência Media de volta para Podcast
        Podcast mediaCast = (Podcast) podMedia;
        
        // TODO: Chame showEpisode() na referência Podcast
        mediaCast.showEpisode();
    }
}
