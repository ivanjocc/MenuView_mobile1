package com.example.app2;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ActivityWhereContextMenuIsUsed extends Activity {

    private ContextualMenuModule contextualMenuModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        TextView textView = findViewById(R.id.textView);
        contextualMenuModule = new ContextualMenuModule(this, textView);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return contextualMenuModule.onContextItemSelected(item);
    }
}
