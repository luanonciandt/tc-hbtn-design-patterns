public class Impressao {
    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }

    public double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public void setValorColoridasFrenteVerso(double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }

    public void setValorPretoBrancoFrenteVerso(double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public void setValorColoridasFrenteApenas(double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }

    public void setValorPretoBrancoFrenteApenas(double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public double calcularTotal() {
        int paginasPretoBranco = paginasTotais - paginasColoridas;
        if (ehFrenteVerso) {
            return (paginasColoridas * valorColoridasFrenteVerso) + (paginasPretoBranco * valorPretoBrancoFrenteVerso);
        } else {
            return (paginasColoridas * valorColoridasFrenteApenas) + (paginasPretoBranco * valorPretoBrancoFrenteApenas);
        }
    }

    @Override
    public String toString() {
        return String.format(
                "total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f",
                paginasTotais, paginasColoridas, paginasTotais - paginasColoridas, frenteVersoOuFrenteApenas(), calcularTotal());
    }

    public String frenteVersoOuFrenteApenas() {
        return ehFrenteVerso ? "frente e verso" : "frente apenas";
    }
}
