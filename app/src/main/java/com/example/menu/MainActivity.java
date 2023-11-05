package com.example.menu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Intent intent = new Intent();

        if (id == R.id.menu_vb) {
            openYouTubeVideo("https://www.youtube.com/watch?v=_x5_9SD0SqM");
        } else if (id == R.id.menu_csharp) {
            openYouTubeVideo("https://www.youtube.com/watch?v=F62A4BFr0Ss");
        } else if (id == R.id.menu_java) {
            openYouTubeVideo("https://www.youtube.com/watch?v=_x5_9SD0SqM");
        } else if (id == R.id.menu_php) {
            openYouTubeVideo("https://www.youtube.com/watch?v=_x5_9SD0SqM");
        } else if (id == R.id.menu_aspnet) {
            openYouTubeVideo("https://www.youtube.com/watch?v=_x5_9SD0SqM");
        }

        return super.onOptionsItemSelected(item);
    }

    private void openYouTubeVideo(String videoUrl) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoUrl));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

}


