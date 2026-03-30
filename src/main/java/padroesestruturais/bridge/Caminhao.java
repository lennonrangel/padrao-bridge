package padroesestruturais.bridge;

public class Caminhao extends Veiculo {

    private int numEixos;

    public Caminhao(float capacidadeTanque) {
        super(capacidadeTanque);
        this.numEixos = 2;
    }

    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }

    public float calcularCustoAbastecimento() {
        return this.capacidadeTanque * this.combustivel.precoPorLitro() * this.numEixos;
    }
}
