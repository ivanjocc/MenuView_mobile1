package com.example.app2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class ContextualMenuModule {
    private final Context context;
    private final View targetView;

    public ContextualMenuModule(Context context, View targetView) {
        this.context = context;
        this.targetView = targetView;
        registerForContextMenu();
    }

    private void registerForContextMenu() {
        targetView.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
            @Override
            public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
                MenuInflater inflater = new MenuInflater(context);
                inflater.inflate(R.menu.context_menu, menu);
            }
        });
    }

    public boolean onContextItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.context_menu_item1) {
            // action
            return true;
        } else if (itemId == R.id.context_menu_item2) {
            // action
            return true;
        } else {
            return super.onContextItemSelected(item);
        }
    }

}
