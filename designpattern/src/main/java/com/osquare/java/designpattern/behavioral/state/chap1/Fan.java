package com.osquare.java.designpattern.behavioral.state.chap1;

public class Fan {
    State fanOffState;
    State fanLowState;
    State fanMedState;
    State fanHigState;

    State state;

    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMedState(this);
        fanHigState = new FanHighState(this);

        state = fanOffState;
    }
    public void pullChain() {
        state.handleRequest();
    }

    @Override
    public String toString() {
        return state.toString();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getFanHighState() {
        return fanHigState;
    }

    public State getFanOffState() {
        return fanOffState;
    }
}
