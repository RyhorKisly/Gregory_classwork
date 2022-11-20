package com.lis.inheritance.storage;

import com.lis.inheritance.figuras.twod.Angle;
import com.lis.inheritance.figuras.twod.TwoD;

public class HolderForTwoD<T extends TwoD & Angle> {
    private T value;

    public HolderForTwoD(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
