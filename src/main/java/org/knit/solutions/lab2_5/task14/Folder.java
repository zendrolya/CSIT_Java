package org.knit.solutions.lab2_5.task14;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemElement {
    private String name;
    private List<FileSystemElement> files;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(FileSystemElement element) {
        files.add(element);
    }

    public List<FileSystemElement> getChildren() {
        return files;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);

        for (FileSystemElement child : files) {
            child.accept(visitor);
        }
    }
}