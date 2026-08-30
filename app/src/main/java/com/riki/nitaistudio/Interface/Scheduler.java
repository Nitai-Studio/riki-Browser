package com.riki.nitaistudio.Interface;

import androidx.annotation.NonNull;


public interface Scheduler {
    void execute(@NonNull Runnable runnable);
}
