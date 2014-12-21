package com.imooc.mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements Mediator, ActionListener {
    private ColleagueCheckBox checkGuest;
    private ColleagueCheckBox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOK;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        //使用Gridlayout布局
        setLayout(new GridLayout(4,2));
        createColleagues();
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOK);
        add(buttonCancel);
        //有效无效的初始设定
        colleagueChanged(checkGuest);
        pack();
        setVisible(true);
    }


    @Override
    public void createColleagues() {
        CheckboxGroup g=new CheckboxGroup();
        checkGuest=new ColleagueCheckBox("Guest",g,true);
        checkLogin=new ColleagueCheckBox("Login",g,false);
        textUser=new ColleagueTextField("",10);
        textPass=new ColleagueTextField("",10);
        textPass.setEchoChar('*');
        buttonOK=new ColleagueButton("OK");
        buttonCancel=new ColleagueButton("Cancel");
        //Mediator
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOK.setMediator(this);
        buttonCancel.setMediator(this);
        //Listener
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textPass.addTextListener(textPass);
        textUser.addTextListener(textUser);
        buttonCancel.addActionListener(this);
        buttonOK.addActionListener(this);
    }
    private void userpassChanged(){
        if(textUser.getText().length()>0){
            textPass.setColleagueEnabled(true);
            if(textPass.getText().length()>0){
                buttonOK.setColleagueEnabled(true);
            }else {
                buttonOK.setColleagueEnabled(false);
            }
        }else {
            textPass.setColleagueEnabled(false);
            buttonOK.setColleagueEnabled(false);
        }
    }


    @Override
    public void colleagueChanged(Colleague colleague){
        if (colleague==checkGuest||colleague==checkLogin){
            if(checkGuest.getState()){
                textPass.setColleagueEnabled(false);
                textUser.setColleagueEnabled(false);
                buttonOK.setColleagueEnabled(true);
            }else {
                textUser.setColleagueEnabled(true);
                userpassChanged();
            }
        }else if(colleague==textUser||colleague==textPass){
            userpassChanged();
        }else {
            System.out.println("NONONO");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(""+e);
        System.exit(0);
    }

    public static void main(String[] args) {
        new LoginFrame("Sample");
    }
}
