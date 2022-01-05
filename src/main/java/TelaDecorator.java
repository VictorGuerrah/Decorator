public abstract class TelaDecorator implements Tela {
    private final Tela telaDecorator;

    public TelaDecorator(Tela tela) {
        this.telaDecorator = tela;
    }

    @Override
    public String getWidget() {
        return telaDecorator.getWidget();
    }
}
