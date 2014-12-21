package com.imooc.visitor;


import org.junit.Test;

public class ListVistorTest {
    @Test
    public void testMain(){
        Director rootDirector=new Director("root");
        Director binDirector=new Director("bin");
        Director tmpDirector=new Director("tmp");
        Director usrDirector=new Director("usr");

        rootDirector.add(binDirector);
        rootDirector.add(tmpDirector);
        rootDirector.add(usrDirector);

        binDirector.add(new File("vi",10000));
        binDirector.add(new File("latex", 20000));

        Director yuki=new Director("yuki");
        Director hanako=new Director("hanko");
        Director tomura=new Director("tomura");

        usrDirector.add(yuki);
        usrDirector.add(hanako);
        usrDirector.add(tomura);


        File diaryHTML=new File("diary.html",3000);

        yuki.add(diaryHTML);
        hanako.add(new File("index.html", 6000));
        tomura.add(new File("add.html",5000));

        rootDirector.accept(new ListVistor());
    }
    
}