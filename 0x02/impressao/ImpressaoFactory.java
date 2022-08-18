public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int paginasTotais, int paginasColoridas, boolean ehFrenteVerso) {
        Impressao impressao = new Impressao();

        impressao.setPaginasTotais(paginasTotais);
        impressao.setPaginasColoridas(paginasColoridas);
        impressao.setEhFrenteVerso(ehFrenteVerso);

        if (tamanhoImpressao.equals(TamanhoImpressao.A2)) {
            impressao.setValorPretoBrancoFrenteApenas(0.22);
            impressao.setValorColoridasFrenteApenas(0.32);
            impressao.setValorPretoBrancoFrenteVerso(0.18);
            impressao.setValorColoridasFrenteVerso(0.28);
        } else if (tamanhoImpressao.equals(TamanhoImpressao.A3)) {
            impressao.setValorPretoBrancoFrenteApenas(0.20);
            impressao.setValorColoridasFrenteApenas(0.30);
            impressao.setValorPretoBrancoFrenteVerso(0.15);
            impressao.setValorColoridasFrenteVerso(0.25);
        } else {
            impressao.setValorPretoBrancoFrenteApenas(0.15);
            impressao.setValorColoridasFrenteApenas(0.25);
            impressao.setValorPretoBrancoFrenteVerso(0.10);
            impressao.setValorColoridasFrenteVerso(0.20);
        }

        return impressao;
    }
}
