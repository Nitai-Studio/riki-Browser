package com.riki.nitaistudio.Interface;


public interface ActionListener {
    void onPauseDownload(int i);

    void onRemoveDownload(int i);

    void onResumeDownload(int i);

    void onRetryDownload(int i);
}
