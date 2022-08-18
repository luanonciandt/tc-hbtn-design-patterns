public class NanoBotsDecorator extends NaveEspacialDecorator {

    public NanoBotsDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial);
    }

    @Override
    public int getAtaque() {
        return naveDecorada.getAtaque() + 25;
    }
}
