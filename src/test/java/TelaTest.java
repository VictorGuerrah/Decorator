import org.junit.Test;
import static org.junit.Assert.assertEquals;

class TelaTest {

    @Test
    void deveRetornarDespertador() {
        Tela tela = new Despertador();
        assertEquals(tela.getWidget(), "Despertador está ativo.");
    }

    @Test
    void deveRetornarSpotify() {
        Tela tela = new Spotify(new Despertador());
        assertEquals(tela.getWidget(), "Despertador está ativo. Toque personalizado com Spotify.");
    }

}