package com.riki.nitaistudio.utils.runnableUtils;

import androidx.annotation.NonNull;
import com.riki.nitaistudio.utils.OnSubscribe;


public class OnStartRunnable<T> implements Runnable {
    private final OnSubscribe<T> onSubscribe;

    public OnStartRunnable(@NonNull OnSubscribe<T> onSubscribe) {
        this.onSubscribe = onSubscribe;
    }

    @Override 
    public void run() {
        this.onSubscribe.onStart();
    }
}
