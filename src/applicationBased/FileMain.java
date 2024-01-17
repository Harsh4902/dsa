package applicationBased;

public class FileMain {

    public static void main(String[] args) {
        FileSystem fileSystem = new FileSystem();

        fileSystem.addDirectory("Documents");
        fileSystem.addFile("Documents/Report.doc");
        fileSystem.addDirectory("Documents/Projects");
        fileSystem.addFile("Documents/Projects/Project1.txt");
        fileSystem.addDirectory("Downloads");
        fileSystem.addFile("Downloads/Image.jpg");

        fileSystem.printFileSystem();
    }

}
