package com.davronxolboyev.app.davlatnitop;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    AppCompatButton bayroq_btn;
    AppCompatButton gerb_btn;
    AppCompatButton poytaxt_btn;
    SoundPool sp;
    int click;
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = new SoundPool(1, AudioManager.STREAM_MUSIC,0);
        music = MediaPlayer.create(this,R.raw.music);
       // music.stop();

        music.start();
        music.setLooping(true);
        click = sp.load(this,R.raw.clicksound,1);
        listener();
        ButtonClick();
    }

    private void ButtonClick() {
        bayroq_btn.setOnClickListener(v -> {
            sp.play(click,1,1,0,0,1);
            Intent intent = new Intent(MainActivity.this,QuizPlace.class);
            intent.putExtra("key",1);
            startActivity(intent);
            MainActivity.this.finish();
        });
        gerb_btn.setOnClickListener(v -> {
            sp.play(click,1,1,0,0,1);
            Intent intent = new Intent(MainActivity.this,QuizPlace.class);
            intent.putExtra("key",2);
            startActivity(intent);
            MainActivity.this.finish();
        });
        poytaxt_btn.setOnClickListener(v -> {
            sp.play(click,1,1,0,0,1);
            Intent intent = new Intent(MainActivity.this,Poytaxt.class);
            startActivity(intent);
            MainActivity.this.finish();
        });
    }

    private void listener() {
        bayroq_btn = findViewById(R.id.bayroqBtn);
        gerb_btn = findViewById(R.id.gerbBtn);
        poytaxt_btn = findViewById(R.id.poytaxtBtn);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Chiqish");
        alert.setMessage("Ilovadan chiqishni hohlaysizmi?...");
        alert.setPositiveButton("HA",(dialog, which) -> finish())
                .setNegativeButton("YO`Q",(dialog, which) -> dialog.cancel());
        alert.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        music.stop();
    }
}