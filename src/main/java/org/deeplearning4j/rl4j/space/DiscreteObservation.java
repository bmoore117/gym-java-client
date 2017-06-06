package org.deeplearning4j.rl4j.space;

/**
 * Created by Ben on 6/6/2017.
 */
public class DiscreteObservation implements Encodable {

    private int state;

    @Override
    public double[] toArray() {
        return new double[] {state};
    }

    public DiscreteObservation(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }
}
