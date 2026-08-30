package com.riki.nitaistudio.Interface;

import androidx.annotation.NonNull;


public interface Action<T> {
    void onSubscribe(@NonNull Subscriber<T> subscriber);
}
