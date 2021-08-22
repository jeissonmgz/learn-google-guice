package io.jeissonmgz.services;

public class PrintServiceImpl implements PrintService {

    @Override
    public void print(String text) {
        System.out.println(text);
    }

}
