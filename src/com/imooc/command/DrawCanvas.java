package com.imooc.command;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    private Color color=Color.red;
    private int radius=6;
    private MacroCommand historys;

    public DrawCanvas(int width,int height,MacroCommand historys) {
        setSize(width,height);
        setBackground(Color.white);
        this.historys = historys;
    }

    public void paint(Graphics g){
        historys.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics g=getGraphics();
        g.setColor(color);
        g.fillOval(x-radius,y-radius,radius*2,radius*2);
    }

}
