package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Filme;

public class CalculadoraDeTempo {
    private int tempoTotal;


    public void inclui(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }
}
