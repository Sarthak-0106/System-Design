package org.sysDesign.SOLID.LSP.BadCode;

public class ReadOnlyFile extends File{

    public void write(){
        throw new UnsupportedOperationException("Can't write a read only file");
    }
}
