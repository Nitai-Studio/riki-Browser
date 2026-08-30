package com.riki.nitaistudio.utils.runnableUtils;

import androidx.annotation.NonNull;
import com.riki.nitaistudio.utils.OnSubscribe;


public class OnNextRunnable<T> implements Runnable {
    private final T item;
    private final OnSubscribe<T> onSubscribe;

    public OnNextRunnable(@NonNull OnSubscribe<T> onSubscribe, T t) {
        this.onSubscribe = onSubscribe;
        this.item = t;
    }

    @Override 
    public void run() {
        this.onSubscribe.onNext(this.item);
    }
}
