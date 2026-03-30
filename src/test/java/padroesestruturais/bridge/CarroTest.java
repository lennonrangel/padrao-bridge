package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveCalcularCustoCarroComGasolina() {
        Combustivel combustivel = new Gasolina();
        Carro carro = new Carro(50.0f);
        carro.setCombustivel(combustivel);
        assertEquals(294.5f, carro.calcularCustoAbastecimento(), 0.01f);
    }

    @Test
    void deveCalcularCustoCarroComEtanol() {
        Combustivel combustivel = new Etanol();
        Carro carro = new Carro(50.0f);
        carro.setCombustivel(combustivel);
        assertEquals(199.5f, carro.calcularCustoAbastecimento(), 0.01f);
    }

    @Test
    void deveCalcularCustoCarroComDiesel() {
        Combustivel combustivel = new Diesel();
        Carro carro = new Carro(50.0f);
        carro.setCombustivel(combustivel);
        assertEquals(324.5f, carro.calcularCustoAbastecimento(), 0.01f);
    }

    @Test
    void deveCalcularCustoCarroComGNV() {
        Combustivel combustivel = new GNV();
        Carro carro = new Carro(50.0f);
        carro.setCombustivel(combustivel);
        assertEquals(214.5f, carro.calcularCustoAbastecimento(), 0.01f);
    }
}
