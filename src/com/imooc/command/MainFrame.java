package com.imooc.command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener,
        MouseMotionListener,WindowListener {
    private MacroCommand historys=new MacroCommand();
    private DrawCanvas canvas=new DrawCanvas(400,400,historys);
    private JButton clearButton=new JButton("清除");
    private JButton czButton=new JButton("撤销");


    public MainFrame(String title) throws HeadlessException {
        super(title);
        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);
        czButton.addActionListener(this);

        Box buttonBox=new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(czButton);
        Box mainBox=new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==clearButton){
            historys.clear();
            canvas.repaint();
        }else {
            historys.undo();
            canvas.repaint();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command command=new DrawCommand(canvas,e.getPoint());
        historys.append(command);
        command.execute();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String[] args) {
        new MainFrame("DEMO");
    }
}
