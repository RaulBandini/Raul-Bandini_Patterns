public class Computador {
    private final String processador;
    private final int memoriaRamGb;
    private final String armazenamento;
    private final String placaDeVideo;
    private final String sistemaOperacional;

    Computador(String processador, int memoriaRamGb, String armazenamento,
               String placaDeVideo, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRamGb = memoriaRamGb;
        this.armazenamento = armazenamento;
        this.placaDeVideo = placaDeVideo;
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getProcessador() {
        return processador;
    }

    public int getMemoriaRamGb() {
        return memoriaRamGb;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void exibir(String titulo) {
        System.out.println("=== " + titulo + " ===");
        System.out.println("Processador: " + processador);
        System.out.println("RAM: " + memoriaRamGb + "GB");
        System.out.println("Armazenamento: " + armazenamento);
        System.out.println("Placa de vídeo: " + (placaDeVideo == null ? "N/A" : placaDeVideo));
        System.out.println("Sistema operacional: "
                + (sistemaOperacional == null ? "N/A" : sistemaOperacional));
    }
}
