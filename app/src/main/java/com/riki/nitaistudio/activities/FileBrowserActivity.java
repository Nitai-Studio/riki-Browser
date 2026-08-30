package com.riki.nitaistudio.activities;

import android.os.Bundle;
import android.text.TextUtils;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.riki.nitaistudio.R;
import com.riki.nitaistudio.adapter.FileBrowserAdapter;
import com.riki.nitaistudio.fragment.FileListFragment;
import com.riki.nitaistudio.models.Directory;

import java.io.File;


public class FileBrowserActivity extends AppCompatActivity implements FileBrowserAdapter.OnDirectoryClickListener {
    final String TAG = "FileBrowserActivity";
    String rootPath;

    Toolbar toolbar;

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_file_browser);
        this.toolbar= findViewById(R.id.toolbar_file_browser);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_left);

        }
        String stringExtra = getIntent().getStringExtra(StorageListActivity.STORAGE_ROOT);
        this.rootPath = stringExtra;
        if (stringExtra != null) {
            listDirFiles(stringExtra);
        }
    }

    public void listDirFiles(String str) {
        if (new File(str).isDirectory()) {
            FileListFragment newInstance = FileListFragment.newInstance(str);
            if (TextUtils.equals(str, this.rootPath)) {
                getSupportFragmentManager().beginTransaction().replace(R.id.file_list_container, newInstance).commit();
            } else {
                getSupportFragmentManager().beginTransaction().replace(R.id.file_list_container, newInstance).addToBackStack(null).commit();
            }
        }
    }

    @Override 
    public void onDirectoryClicked(Directory directory) {
        listDirFiles(directory.getPath());
    }
}
