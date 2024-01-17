package applicationBased;

import java.util.ArrayList;
import java.util.List;

public class FileNode {
    private String name;
    private boolean isFile;
    private List<FileNode> children;

    public FileNode(String name, boolean isFile) {
        this.name = name;
        this.isFile = isFile;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean isFile() {
        return isFile;
    }

    public List<FileNode> getChildren() {
        return children;
    }

    public void addChild(FileNode child) {
        children.add(child);
    }
}
