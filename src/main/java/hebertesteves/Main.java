package hebertesteves;

public class Main {

    public static void main(String[] args) {
        // Casting

        double resultado = 0.0;
        int resultadoInt = (int) resultado; // Explicito

        int meuInt = 10;
        double meuDouble = meuInt; // Implicito

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString); // Explicito

        String minhaString = String.valueOf(meuInt2); // Explicito

        // POO

        Carro meuCarroEsportivo1 = new CarroEsportivo("Fusca");
        // meuCarro1.modelo = "Fusca novo";

        Carro meuCarroEsportivo2 = new CarroEsportivo("BMW");

        Carro meuCarroEsportivo3 = new CarroEsportivo("Audi");

        meuCarroEsportivo1.acelerar();
        meuCarroEsportivo2.acelerar();
        meuCarroEsportivo3.acelerar();

        SerVivo meuSer = new Humano(18);
        meuSer.respirar();

        Carro meuCarroFurado = null;

        try {
            meuCarroFurado.acelerar();
        } catch (NullPointerException exception) {
            System.out.println("Vende carro furado");
        }

    }
}