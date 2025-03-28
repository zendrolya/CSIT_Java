package org.knit.solutions.lab2_5.task14;

public class SizeAnalyzer implements FileSystemVisitor {
    private int totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
        System.out.println("Учтён файл " + file.getName() + " размером " + file.getSize() + " байт");
    }

    @Override
    public void visit(Folder folder) {
        System.out.println("Обработка папки: " + folder.getName());
    }

    @Override
    public void visit(Link link) {
        System.out.println("Ссылка " + link.getName() + " пропущена при подсчёте размера");
    }

    public int getTotalSize() {
        return totalSize;
    }
}