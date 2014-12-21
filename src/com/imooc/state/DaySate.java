package com.imooc.state;

public class DaySate implements State {
    private static final DaySate dayState=new DaySate();
    private DaySate(){};
    public static State getInstance(){
        return dayState;
    }

    @Override
    public void doClock(Context context, int hour) {
        if(hour<9||17<=hour){
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库白天");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("警铃白天");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("一般通话白天");
    }
    public String toString(){
        return "白天";
    }
}
