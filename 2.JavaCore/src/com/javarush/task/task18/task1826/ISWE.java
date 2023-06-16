package com.javarush.task.task18.task1826;

import java.io.IOException;
import java.io.OutputStream;

public class ISWE extends ISWrapper{
    public ISWE(ISWrapper data){
       super(data);
    }

    @Override
    public int read() throws IOException {
        return super.read() + 1;
    }

    @Override
    public long transferTo(OutputStream out) throws IOException {
        return super.transferTo(out);
    }

}
