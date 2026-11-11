public class Main {
    public static void main(String[] args) {
        Computador basico = new ComputadorBuilder()
                .processador("Intel Core i5")
                .memoriaRamGb(8)
                .armazenamento("256GB SSD")
                .build();

        Computador gamer = new ComputadorBuilder()
                .processador("Intel Core i9")
                .memoriaRamGb(32)
                .armazenamento("1TB SSD")
                .placaDeVideo("NVIDIA RTX 4070")
                .build();

        basico.exibir("Computador Básico");
        System.out.println();
        gamer.exibir("Computador Gamer");
    }
}
