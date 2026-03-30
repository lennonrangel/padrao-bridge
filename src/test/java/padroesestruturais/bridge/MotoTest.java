package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void deveCalcularCustoMotoComGasolina() {
        Combustivel combustivel = new Gasolina();
        Moto moto = new Moto(20.0f);
        moto.setCombustivel(combustivel);
        assertEquals(111.91f, moto.calcularCustoAbastecimento(), 0.01f);
    }

    @Test
    void deveCalcularCustoMotoComEtanol() {
        Combustivel combustivel = new Etanol();
        Moto moto = new Moto(20.0f);
        moto.setCombustivel(combustivel);
        assertEquals(75.81f, moto.calcularCustoAbastecimento(), 0.01f);
    }

    @Test
    void deveCalcularCustoMotoComDiesel() {
        Combustivel combustivel = new Diesel();
        Moto moto = new Moto(20.0f);
        moto.setCombustivel(combustivel);
        assertEquals(123.31f, moto.calcularCustoAbastecimento(), 0.01f);
    }
}
