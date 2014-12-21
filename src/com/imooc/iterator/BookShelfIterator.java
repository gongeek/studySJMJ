package com.imooc.iterator;

/**
 * Created by gongeek on 2014/11/25.
 * 创建BookShelf的迭代器注意是类
 */
public class BookShelfIterator implements Iterator {
    public BookShelf bookShelf;
    public int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = this.bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
