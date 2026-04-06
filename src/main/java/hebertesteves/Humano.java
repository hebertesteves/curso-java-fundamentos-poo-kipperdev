package hebertesteves;

public class Humano extends SerVivo {

    public Humano(int idade) {
        super(idade);
    }

    @Override
    public void respirar() {
        System.out.println(this.idade);
        System.out.println("Inalando e exalando C02 e Oxigenio");
    }
}
