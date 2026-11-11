import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        long total = 0;
        for (FileSystemComponent component : components) {
            total += component.getSize();
        }
        return total;
    }

    @Override
    public void display(String indentation) {
        display(indentation, indentation);
    }

    private void display(String prefix, String childIndentation) {
        System.out.println(prefix + name + "/");
        for (int i = 0; i < components.size(); i++) {
            FileSystemComponent component = components.get(i);
            boolean isLast = i == components.size() - 1;
            String branch = isLast ? "└─ " : "├─ ";
            String nextIndentation = childIndentation + (isLast ? "   " : "│  ");

            if (component instanceof Directory) {
                ((Directory) component).display(childIndentation + branch, nextIndentation);
            } else {
                component.display(childIndentation + branch);
            }
        }
    }

    @Override
    public void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        components.remove(component);
    }
}
