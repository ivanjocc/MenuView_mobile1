package com.example.app3;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopupMenuModule {
    private Context context;

    public PopupMenuModule(Context context) {
        this.context = context;
    }

    public void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(context, view);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                handlePopupMenuSelection(item.getItemId());
                return true;
            }
        });

        popupMenu.show();
    }

    public void handlePopupMenuSelection(int itemId) {
        if (itemId == R.id.popup_menu_item1) {
            Toast.makeText(context, "option 1 selected", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.popup_menu_item2) {
            Toast.makeText(context, "option 2 selected", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "there is a problem", Toast.LENGTH_SHORT).show();
        }
    }

}

