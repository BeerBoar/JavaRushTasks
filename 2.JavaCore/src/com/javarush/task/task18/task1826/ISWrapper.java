package com.javarush.task.task18.task1826;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class ISWrapper extends InputStream {
    private InputStream local;

    public ISWrapper(InputStream data){
        this.local = data;
    }

    @Override
    public int read() throws IOException {
        return local.read();
    }

    @Override
    public long transferTo(OutputStream out) throws IOException {
        return local.transferTo(out);
    }

    @Override
    public int available() throws IOException {
        return local.available();
    }

    @Override
    public void close() throws IOException {
        local.close();
    }
}
