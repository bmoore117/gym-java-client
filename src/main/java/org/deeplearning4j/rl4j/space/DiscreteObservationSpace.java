package org.deeplearning4j.rl4j.space;

import org.json.JSONObject;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

/**
 * Created by Ben on 6/6/2017.
 */
public class DiscreteObservationSpace<O> implements ObservationSpace<O> {

    private int n;
    private String name;

    public DiscreteObservationSpace(JSONObject jsonObject) {
        name = jsonObject.getString("name");
        n = jsonObject.getInt("n");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int[] getShape() {
        return new int[] {n};
    }

    @Override
    public INDArray getLow() {
        return Nd4j.create(new int[] {0});
    }

    @Override
    public INDArray getHigh() {
        return Nd4j.create(new int[] {n});
    }

    public O getValue(JSONObject o, String key) {
        return (O) new DiscreteObservation(o.getInt(key));
    }
}
