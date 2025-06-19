import java.io.File;
public class FilePath {
    public static void main(String [] args){
        String notePath = "src/note.txt";
        String docsPath = "Documents/project-docs.txt";
        String imagesPath = "Documents/images";
        String diagramPath = "Documents/images/diagram.png";

        checkFileOrDirectory(notePath);
        checkFileOrDirectory(docsPath);
        checkFileOrDirectory(imagesPath);
        checkFileOrDirectory(diagramPath);
    }

    private static void checkFileOrDirectory(String path) {
        File file = new File(path);
        if(file.exists()){
            System.out.println("Path: " + file.getAbsolutePath());
            if (file.isFile()){
                System.out.println("The path is pointing to a file");
            }else if(file.isDirectory()){
                System.out.println("The path is pointing to a directory");
            }
        }else {
            System.out.println("The path\"" + path + "\" does not exist");
        }
        System.out.println();
    }
}
