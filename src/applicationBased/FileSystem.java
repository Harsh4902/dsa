package applicationBased;

public class FileSystem {

    private FileNode root;

    public FileSystem() {
        this.root = new FileNode("Root", false);
    }

    public void addFile(String path) {
        String[] parts = path.split("/");
        FileNode current = root;

        for (String part : parts) {
            if (!part.isEmpty()) {
                FileNode child = findChild(current, part);

                if (child == null) {
                    child = new FileNode(part, true);
                    current.addChild(child);
                }

                current = child;
            }
        }
    }

    public void addDirectory(String path) {
        String[] parts = path.split("/");
        FileNode current = root;

        for (String part : parts) {
            if (!part.isEmpty()) {
                FileNode child = findChild(current, part);

                if (child == null) {
                    child = new FileNode(part, false);
                    current.addChild(child);
                }

                current = child;
            }
        }
    }

    private FileNode findChild(FileNode node, String name) {
        for (FileNode child : node.getChildren()) {
            if (child.getName().equals(name)) {
                return child;
            }
        }
        return null;
    }

    public void printFileSystem() {
        printFileNode(root, 0);
    }

    private void printFileNode(FileNode node, int level) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indent.append("    ");
        }

        System.out.println(indent + (node.isFile() ? "[File] " : "[Directory] ") + node.getName());

        for (FileNode child : node.getChildren()) {
            printFileNode(child, level + 1);
        }
    }

}
