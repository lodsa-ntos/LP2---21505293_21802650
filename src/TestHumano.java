import org.junit.Test;
import pt.ulusofona.lp2.theWalkingDEISIGame.Humano;

import static org.junit.Assert.assertEquals;

public class TestHumano {

    public TestHumano() {
    }

    @Test
    public void test01GetImagePNG() {
        Humano humano = new Humano();
        String imageEsperada = "hum.png";
        String imageObtida = humano.getImagePNG();
        assertEquals (imageEsperada, imageObtida);

    }

    @Test
    public void test02GetIdEquipa() {
        Humano humano = new Humano(2, 1, "Freddy M.", 3, 4);
        int idEsperado = 2;
        int idObtido = humano.getId();
        assertEquals(idEsperado, idObtido);
    }
}
