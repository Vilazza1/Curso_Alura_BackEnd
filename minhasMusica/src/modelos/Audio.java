package modelos;

public class Audio {

    private String titulo;
    private int totalDeVisualizacao;
    private int totalCurtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalDeVisualizacao() {
        return totalDeVisualizacao;
    }

    public void curti () {
        this.totalCurtidas++;
    }

    public void reproduz() {
        this.totalDeVisualizacao++;
    }

}
