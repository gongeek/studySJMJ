package com.imooc.state;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener,Context {
    private JTextField textClock=new JTextField(60);
    private JTextArea textScreen=new JTextArea(10,60);
    private JButton buttonUse=new JButton("使用金库" );
    private JButton buttonAlarm=new JButton("警铃");
    private JButton buttonPhone=new JButton("一般警铃");
    private JButton buttonExit=new JButton("退出");
    private State state=DaySate.getInstance();//初始状态是白天

    public SafeFrame(String title){
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add(textClock,BorderLayout.NORTH);
        textClock.setEditable(false);

        add(textScreen,BorderLayout.CENTER);
        textScreen.setEditable(false);

        Panel panel=new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        add(panel,BorderLayout.SOUTH);
        pack();
        setVisible(true);

        //设置监听事件
        buttonAlarm.addActionListener(this);
        buttonUse.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if(e.getSource()==buttonUse){
            state.doUse(this);
        }else if(e.getSource()==buttonAlarm){
            state.doAlarm(this);
        }else if(e.getSource()==buttonPhone){
            state.doPhone(this);
        }else if(e.getSource()==buttonExit) {
            System.exit(0);
        }else {
            System.out.println("?");
        }
    }

    @Override
    public void setClock(int hour) {
        String clockStr="现在时间是:";
        if(hour<10){
            clockStr+="0"+hour+":00";
        }else {
            clockStr+=hour+":00";
        }
        System.out.println(clockStr);
        textClock.setText(clockStr);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("状态游"+this.state+"变成"+state);
        this.state=state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("Call!"+msg+"\n");
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("record..."+msg+"\n");
    }

    public static void main(String[] args) {
        SafeFrame safeFrame=new SafeFrame("Demo");
        while (true){
            for (int hour=0;hour<24;hour++){
                safeFrame.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
