package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    private FileOutputStream local;
    public static String fileName = "C:/tmp/result.txt";

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }
    public AmigoOutputStream (FileOutputStream data) throws FileNotFoundException{
        super(fileName);
        this.local = data;
    }

    @Override
    public void write(int b) throws IOException {
        local.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        local.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        local.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        flush();
        write("JavaRush © All rights reserved.".getBytes());
        local.close();
    }

    @Override
    public FileChannel getChannel() {
        return local.getChannel();
    }
}