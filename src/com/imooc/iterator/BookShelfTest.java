package com.imooc.iterator;

import com.imooc.iterator.Book;
import com.imooc.iterator.BookShelf;
import com.imooc.iterator.Iterator;
import org.junit.Test;

public class BookShelfTest {

    @Test//测试整个迭代器模式
    public void testBookShelf() {
        Book b1 = new Book("Java设计模式");
        Book b2 = new Book("JavaScript高级教程");
        Book b3 = new Book("HTML5入门");
        Book b4 = new Book("CSS3入门");
        //这个书架能够放100本书
        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(b1);
        bookShelf.appendBook(b2);
        bookShelf.appendBook(b3);
        bookShelf.appendBook(b4);
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            System.out.println(((Book) (it.next())).getName());
        }
    }

}