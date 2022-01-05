public class Spotify extends TelaDecorator {

    public Spotify(Tela tela) {
        super(tela);
    }

    @Override
    public String getWidget() {
        return super.getWidget() + "Toque personalizado com Spotify.";
    }
}
