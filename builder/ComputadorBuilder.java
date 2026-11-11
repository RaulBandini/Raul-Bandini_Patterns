public class ComputadorBuilder {
    private String processador;
    private int memoriaRamGb;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;

    public ComputadorBuilder processador(String processador) {
        this.processador = processador;
        return this;
    }

    public ComputadorBuilder memoriaRamGb(int memoriaRamGb) {
        if (memoriaRamGb <= 0) {
            throw new IllegalArgumentException("A memoria RAM precisa ser maior que zero.");
        }
        this.memoriaRamGb = memoriaRamGb;
        return this;
    }

    public ComputadorBuilder armazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    public ComputadorBuilder placaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
        return this;
    }

    public ComputadorBuilder sistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
        return this;
    }

    public Computador build() {
        if (processador == null || processador.isBlank()) {
            throw new IllegalStateException("Informe o processador do computador.");
        }
        if (memoriaRamGb <= 0) {
            throw new IllegalStateException("Informe a memoria RAM do computador.");
        }
        if (armazenamento == null || armazenamento.isBlank()) {
            throw new IllegalStateException("Informe o armazenamento do computador.");
        }

        return new Computador(
                processador,
                memoriaRamGb,
                armazenamento,
                placaDeVideo,
                sistemaOperacional);
    }
}
