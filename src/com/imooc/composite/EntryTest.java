package com.imooc.composite;

import org.junit.Test;

public class EntryTest {
    @Test
    public void testMain(){
        Directory rootDirectory=new Directory("root");
        Directory binDirectory=new Directory("bin");
        Directory tmpDirectory=new Directory("tmp");
        Directory usrDirectory=new Directory("usr");

        rootDirectory.add(binDirectory);
        rootDirectory.add(tmpDirectory);
        rootDirectory.add(usrDirectory);

        binDirectory.add(new File("vi",10000));
        binDirectory.add(new File("latex",20000));

        Directory yuki=new Directory("yuki");
        Directory hanako=new Directory("hanko");
        Directory tomura=new Directory("tomura");

        usrDirectory.add(yuki);
        usrDirectory.add(hanako);
        usrDirectory.add(tomura);


        File diaryHTML=new File("diary.html",3000);

        yuki.add(diaryHTML);
        hanako.add(new File("index.html", 6000));
        tomura.add(new File("add.html",5000));

        rootDirectory.printList("");
        System.out.println("*****************");
        System.out.println(yuki.getFullPath());
        System.out.println("*****************");
        System.out.println(diaryHTML.getFullPath());
    }

}