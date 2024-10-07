package classe;

public class Refeicao {
    Alimento salada;
    Alimento pratoPrincipal;
    Alimento acompanhamento;

    Refeicao(Alimento salada, Alimento pratoPrincipal, Alimento acompanhamento) {
        this.salada = salada;
        this.pratoPrincipal = pratoPrincipal;
        this.acompanhamento = acompanhamento;
    }

    public String toString() {
        return "Salada: " + salada.obterNome() + ", Prato Principal: " + pratoPrincipal.obterNome() + ", Acompanhamento: " + acompanhamento.obterNome();
    }
}
