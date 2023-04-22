package org.breadsb.file_writer;

public abstract class FileWriter {

    private String fileName;
    private String description;

    FileWriter(String inputFileName) {
        this.fileName = inputFileName;
    }

    FileWriter(String inputFileName, String inputDescription) {
        this(inputFileName);
        this.description = inputDescription;
    }

    public String getFileName() {
        return this.fileName;
    }

    void editFileName(String newFileName) {
        this.fileName = newFileName;
    }

    abstract String extensionFile();

    private String addBeginingPath() {
        return "Beginning/";
    }

    public String fullFileName() {
        return addBeginingPath()+getFileName()+extensionFile();
    }

    public String getDescription() {
        return this.description;
    }
}
