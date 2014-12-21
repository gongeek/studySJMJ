package com.imooc.chain;

public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next){
        this.next=next;
        return next;
    }

    public final void support(Trouble trouble){
        if(resolve(trouble)){
            done(trouble);
        }else if(next!=null){
            next.support(trouble);
        }else {
            fail(trouble);
        }
    }

    public String toString(){
        return name;
    }

    protected abstract boolean resolve(Trouble trouble);

    private void done(Trouble trouble){
        System.out.println(trouble+"被"+this+"解决");
    }
    private void fail(Trouble trouble){
        System.out.println(trouble+"未解决");
    }

}
