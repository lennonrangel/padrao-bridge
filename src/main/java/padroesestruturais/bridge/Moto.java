package padroesestruturais.bridge;

public class Moto extends Veiculo {

    private float desconto;

    public Moto(float capacidadeTanque) {
        super(capacidadeTanque);
        this.desconto = 0.05f;
    }

    public float calcularCustoAbastecimento() {
        return this.capacidadeTanque * this.combustivel.precoPorLitro() * (1 - this.desconto);
    }
}
