package org.sysDesign.SOLID.LSP.GoodCode;

public class Main {
    // accepts all files that can be read
    // here in this both readable and writeable files can be send as both are the child of Readable interface
    public static void readAnyFile(ReadableFile file){
        file.read();
    }
    static void main() {
        ReadableFile readableFile = new ReadOnlyFile();
        readableFile.read();

        WritableFile writableFile = new WritableFile();
        writableFile.read();
        writableFile.write();

        readAnyFile(readableFile);
    }
}
