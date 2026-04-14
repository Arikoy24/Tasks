package StringTasks.StringTask3;

//3. Виділити ім'я файлу та розширення
//Завдання: Реалізуй метод:
//
//FileInfo parseFilePath(String path);
//Приклад:
//
//"/home/user/docs/report.pdf" → name: "report", ext: "pdf"

public class Main {

    public static void main(String[] args) {

        String path = "/home/user/docs/report.pdf";


        FileInfo file = ParseFileInfo.parseFileInfo(path);


        System.out.printf("Name: \"%s\"%nExt: \"%s\"",
                file.getName(),
                file.getExt());

    }
}
