package hebertesteves;

public class CarroEsportivo implements Carro {
    private String modelo;

    /* Metodo de entrada
    public static void main(String[] args) {
        System.out.println("Teste");
    }
     */

    public CarroEsportivo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro " + this.modelo);
    }

    @Override
    public void freiar() {
        System.out.println("Freiando o carro " + this.modelo);
    }

    @Override
    public void parar() {
        System.out.println("Parando o carro " + this.modelo);
    }
}
