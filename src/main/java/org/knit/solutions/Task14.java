package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab2_5.task14.Folder;
import org.knit.solutions.lab2_5.task14.Link;
import org.knit.solutions.lab2_5.task14.File;
import org.knit.solutions.lab2_5.task14.SizeAnalyzer;
import org.knit.solutions.lab2_5.task14.VirusScanner;

@TaskDescription(taskNumber = 14, taskDescription = "Задача 14 на паттерн Визитер (Visitor)", href = "org.knit.solutions.task14")
public class Task14 implements Solution {
    @Override
    public void execute() {
        Folder root = new Folder("Новая папка 1");

        File file1 = new File("test.txt", 1024, false);
        File file2 = new File("goejgwajmtfbhp.jpg", 2048, true);
        File file3 = new File("laba.pdf", 4096, false);

        Folder subfolder = new Folder("новая папка 2");
        File file4 = new File("data.dat", 8192, false);
        subfolder.add(file4);

        Link link = new Link("ссылка", file3);

        root.add(file1);
        root.add(file2);
        root.add(subfolder);
        root.add(file3);
        root.add(link);

        System.out.println("=== Сканирование на вирусы ===");
        VirusScanner virusScanner = new VirusScanner();
        root.accept(virusScanner);

        System.out.println("\n=== Анализ размера ===");
        SizeAnalyzer sizeAnalyzer = new SizeAnalyzer();
        root.accept(sizeAnalyzer);

        System.out.println("\nОбщий размер файлов: " + sizeAnalyzer.getTotalSize() + " байт");
    }
}