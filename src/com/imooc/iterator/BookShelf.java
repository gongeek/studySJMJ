package com.imooc.iterator;

/**
 * Created by gongeek on 2014/11/25.
 * BookShelf
 * 注:这里的Aggregate相当于默认语言包中的Iterable接口
 * 自己写的Iterator相当于默认语言包中的Iterator接口
 * 实际开发中2个接口不需要自己重写
 * 只需写下面的几个 OK
 */

public class BookShelf implements Aggregate {

    private Book[] books;
    private int last = 0;//数组中使用的最后以为索引

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return this.books[index];
    }

    public void appendBook(Book book) {
        this.books[this.last] = book;
        this.last++;
    }

    public int getLength() {
        return this.last;//返回当前公有多少书
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
