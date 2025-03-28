package org.knit.solutions.lab2_5.task14;

public class Link implements FileSystemElement {
    private String name;
    private FileSystemElement fileLink;

    public Link(String name, FileSystemElement fileLink) {
        this.name = name;
        this.fileLink = fileLink;
    }

    public String getName() {
        return name;
    }

    public FileSystemElement getfileLink() {
        return fileLink;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
