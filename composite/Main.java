public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");

        Directory docs = new Directory("docs");
        docs.add(new File("projeto.pdf", File.megabytes(2)));
        docs.add(new File("relatorio.docx", File.megabytes(1)));

        Directory fotos = new Directory("fotos");
        fotos.add(new File("vacacao.jpg", File.megabytes(3)));

        Directory familia = new Directory("familia");
        familia.add(new File("casal.jpg", File.megabytes(2)));
        familia.add(new File("filhos.jpg", File.megabytes(1)));
        fotos.add(familia);

        root.add(docs);
        root.add(fotos);
        root.add(new File("readme.txt", File.megabytes(0.5)));

        root.display("");
        System.out.println();
        System.out.println("Tamanho total: " + File.formatSize(root.getSize()));
        System.out.println("Tamanho da pasta 'docs': " + File.formatSize(docs.getSize()));
        System.out.println("Tamanho da pasta 'familia': " + File.formatSize(familia.getSize()));
    }
}
