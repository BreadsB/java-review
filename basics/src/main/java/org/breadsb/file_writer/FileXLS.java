package org.breadsb.file_writer;

public class FileXLS extends FileWriter {

    String fullName;
    String extension;

    FileXLS(String fileName) {
        super(fileName);
    }

    FileXLS(String fileName, String description) {
        super(fileName, description); // Constructor chaining
        this.extension = extensionFile();
    }

    public String getExtension() {
        return this.extension;
    }

    @Override
    String extensionFile() {
        return ".xls";
    }

}
