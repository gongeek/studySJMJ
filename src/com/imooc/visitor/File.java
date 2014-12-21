package com.imooc.visitor;

public class File extends Entry{
    private String fileName;
    private int fileSize;

    public File(String fileName, int fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    @Override
    public String getName() {
        return fileName;
    }

    @Override
    public int getSize() {
        return fileSize;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
