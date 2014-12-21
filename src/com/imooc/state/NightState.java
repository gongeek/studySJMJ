package com.imooc.state;

public class NightState implements State{
    private static final NightState nightSate=new NightState();
    private NightState(){}
    public static State getInstance() {
        return nightSate;
    }
    @Override
    public void doClock(Context context, int hour) {
        if(!(hour<9||17<=hour)){
            context.changeState(DaySate.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库黑夜");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("警铃黑夜");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("一般通话黑夜");
    }
    public String toString(){
        return "黑夜";
    }
    
}
