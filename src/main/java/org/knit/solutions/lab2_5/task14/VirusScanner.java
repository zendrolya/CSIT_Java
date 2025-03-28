package org.knit.solutions.lab2_5.task14;

public class VirusScanner implements FileSystemVisitor {
    @Override
    public void visit(File file) {
        if (file.hasVirus()) {
            System.out.println("Вирус обнаружен в файле: " + file.getName());
        } else {
            System.out.println("Файл: " + file.getName() + " безопасен");
        }
    }

    @Override
    public void visit(Folder folder) {
        System.out.println("Сканирование папки: " + folder.getName());
    }

    @Override
    public void visit(Link link) {
        System.out.println("Сканирование ссылки: " + link.getName());
    }
}