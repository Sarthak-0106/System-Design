package org.sysDesign.SOLID.LSP.GoodCode;

// concrete class for readable file which overrides the read function
public class ReadableFile implements Readable {
    @Override
    public void read(){
        System.out.println("Reading from a file");
    }
}
