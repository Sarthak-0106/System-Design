package org.sysDesign.SOLID.LSP.BadCode;

public class Main {
    static void main() {
        File file = new ReadOnlyFile();

        file.read(); // works fine
        file.write(); // throws exception
        // read only should not be written basically this object should not support this method
    }
}
