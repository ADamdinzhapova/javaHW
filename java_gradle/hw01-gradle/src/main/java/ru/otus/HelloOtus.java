package ru.otus;

import com.google.common.base.Splitter;

import java.util.List;

public class HelloOtus {
    public static void main(String[] args) {
        String text = "hello_otus_!";
        String separator = "_";
        List<String> list = Splitter.on(separator).splitToList(text);
        System.out.println(list);
    }
}
