public class AudioPlayer implements MediaPlayer {
    @Override
    public void reproduzir(TipoMedia midia, String nome) {
        if (midia.equals(TipoMedia.MP3)) {
            System.out.print("Reproduzindo MP3: " + nome);
        } else {
            MediaPlayerAdapter adapter = new MediaPlayerAdapter(midia);
            adapter.reproduzir(midia, nome);
        }
    }
}
