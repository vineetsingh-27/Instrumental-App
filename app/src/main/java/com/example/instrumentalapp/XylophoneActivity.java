package com.example.instrumentalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class XylophoneActivity extends AppCompatActivity {

    private SoundPool sp;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xylophone);

        // TODO: Create a new SoundPool
        sp = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        sound1 = sp.load(getApplicationContext(), R.raw.note1_c, 1);
        sound2 = sp.load(getApplicationContext(), R.raw.note2_d, 1);
        sound3 = sp.load(getApplicationContext(), R.raw.note3_e, 1);
        sound4 = sp.load(getApplicationContext(), R.raw.note4_f, 1);
        sound5 = sp.load(getApplicationContext(), R.raw.note5_g, 1);
        sound6 = sp.load(getApplicationContext(), R.raw.note6_a, 1);
        sound7 = sp.load(getApplicationContext(), R.raw.note7_b, 1);
    }

    public void playSound1(View v) {
        sp.play(sound1, 1.0f, 1.0f, 0, 0, 10f);
    }

    public void playSound2(View v) {
        sp.play(sound2, 1.0f, 1.0f, 0, 0, 10f);
    }

    public void playSound3(View v) {
        sp.play(sound3, 1.0f, 1.0f, 0, 0, 10f);
    }

    public void playSound4(View v) {
        sp.play(sound4, 1.0f, 1.0f, 0, 0, 10f);
    }

    public void playSound5(View v) {
        sp.play(sound5, 1.0f, 1.0f, 0, 0, 10f);
    }

    public void playSound6(View v) {
        sp.play(sound6, 1.0f, 1.0f, 0, 0, 10f);
    }

    public void playSound7(View v) {
        sp.play(sound7, 1.0f, 1.0f, 0, 0, 10f);
    }
}