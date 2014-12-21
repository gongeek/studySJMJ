package com.imooc.command;


import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command {
    private Stack commands=new Stack();

    @Override
    public void execute() {
        Iterator it=commands.iterator();
        while (it.hasNext()){
            Command command= (Command) it.next();
            command.execute();
        }
    }

    public void append(Command command){
        //不能添加宏命令
        if(command!=this){
            commands.push(command);
        }
    }

    public void undo(){
        if(!commands.empty()){
            commands.pop();
        }
    }
    public void clear(){
        commands.clear();
    }
}
