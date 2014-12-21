package com.imooc.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder implements Builder {
    private String filename;
    private PrintWriter printWriter;

    @Override
    public void makeTitle(String s) {
        filename=s+".html";
        try {
            printWriter=new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        printWriter.println("<html><head><title>"+s+"</title></head><body>");
        printWriter.println("<h1>"+s+"</h1>");
    }

    @Override
    public void makeString(String s) {
        printWriter.println("<p>"+s+"</p>");
    }

    @Override
    public void makeItems(String[] items) {
        printWriter.println("<ul>");
        for(String v:items){
            printWriter.println("<li>"+v+"</li>");
        }
        printWriter.println("</ul>");

    }

    @Override
    public String getResult() {
        printWriter.println("</body></html>");
        printWriter.close();
        return filename ;
    }
}
