package StringTasks.StringTask3;

public class ParseFileInfo {

    public static FileInfo parseFileInfo(String path) {


        int dotIndex = path.lastIndexOf(".");
        String ext = path.substring(dotIndex + 1);

        int slashIndex = path.lastIndexOf("/");
        String name = path.substring(slashIndex + 1, dotIndex);


        return new FileInfo(name, ext);

    }
}