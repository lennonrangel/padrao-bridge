package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CaminhaoTest {

    @Test
    void deveCalcularCustoCaminhaoComDieselDoisEixos() {
        Combustivel combustivel = new Diesel();
        Caminhao caminhao = new Caminhao(300.0f);
        caminhao.setCombustivel(combustivel);
        assertEquals(3894.0f, caminhao.calcularCustoAbastecimento(), 0.01f);
    }

    @Test
    void deveCalcularCustoCaminhaoComDieselTresEixos() {
        Combustivel combustivel = new Diesel();
        Caminhao caminhao = new Caminhao(300.0f);
        caminhao.setCombustivel(combustivel);
        caminhao.setNumEixos(3);
        assertEquals(5841.0f, caminhao.calcularCustoAbastecimento(), 0.01f);
    }

    @Test
    void deveCalcularCustoCaminhaoComGNV() {
        Combustivel combustivel = new GNV();
        Caminhao caminhao = new Caminhao(300.0f);
        caminhao.setCombustivel(combustivel);
        assertEquals(2574.0f, caminhao.calcularCustoAbastecimento(), 0.01f);
    }
}
