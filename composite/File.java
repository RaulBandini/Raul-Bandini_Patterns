import java.util.Locale;

public class File implements FileSystemComponent {
    private final String name;
    private final long size;

    public File(String name, long size) {
        this.name = name;
        if (size < 0) {
            throw new IllegalArgumentException("O tamanho do arquivo nao pode ser negativo.");
        }
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void display(String indentation) {
        System.out.println(indentation + name + " (" + formatSize(size) + ")");
    }

    @Override
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Um arquivo nao pode conter componentes.");
    }

    @Override
    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Um arquivo nao pode conter componentes.");
    }

    static long megabytes(double megabytes) {
        return Math.round(megabytes * 1024 * 1024);
    }

    static String formatSize(long bytes) {
        return String.format(Locale.ROOT, "%.1f MB", bytes / (1024.0 * 1024.0));
    }
}
