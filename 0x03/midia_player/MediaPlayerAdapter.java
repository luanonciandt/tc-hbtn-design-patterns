public class MediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia media) {
        if (!media.equals(TipoMedia.MP3)) {
            advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    @Override
    public void reproduzir(TipoMedia midia, String nome) {
        if (midia.equals(TipoMedia.VLC)) {
            advancedMediaPlayer.reproduzirVlc(nome);
        } else {
           advancedMediaPlayer.reproduzirMp4(nome);
        }
    }
}
