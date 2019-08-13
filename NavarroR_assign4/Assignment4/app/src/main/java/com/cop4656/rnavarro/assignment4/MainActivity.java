// Ruben Navarro
// 05/23/2019
// COP4656
// Assignment 4
// RN16G

package com.cop4656.rnavarro.assignment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;
import android.widget.ImageView;
import android.media.AudioManager;
import android.content.Context;
import android.widget.SeekBar;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    // variable for music restart
    int n = 0;

    // Button objects for sound bite played on click
    private Button button1, button2, button3, button4, button5, button6,
                   button7, button8, button9;

    // ImageView object for picture swapping
    private ImageView iv;

    // MediaPlayer objects for respective songs
    private MediaPlayer mp1, mp2, mp3, mp4, mp5, mp6, mp7;

    // Seekbar for song positioning and navigation
    private SeekBar sb;

    // handler for seek bar progress
    private Handler hand;
    // audio manager object to check is any music is active
    private AudioManager am;

    // runnable object for seek bar progression
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assigns respective buttons
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        // assigns respective songs
        mp1 = MediaPlayer.create(this, R.raw.war_chant);
        mp2 = MediaPlayer.create(this, R.raw.fsu_fight_song);
        mp3 = MediaPlayer.create(this, R.raw.victory_song);
        mp4 = MediaPlayer.create(this, R.raw.gold_and_garnett);
        mp5 = MediaPlayer.create(this, R.raw.fsu_cheer);
        mp6 = MediaPlayer.create(this, R.raw.fourth_quarter_fanfare);
        mp7 = MediaPlayer.create(this, R.raw.seminole_uprising);

        // assigns audio service
        am = (AudioManager)this.getSystemService(Context.AUDIO_SERVICE);

        // assigns image for later swapping
        iv = findViewById(R.id.imageView3);

        // allocates handler
        hand = new Handler();

        // assigns seekbar
        sb = findViewById(R.id.seekBar1);


        // seekbar listener to track progress once sound begins to play
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (mp1.isPlaying() && fromUser) {
                    mp1.seekTo(progress * 1000);
                }
                else if (mp2.isPlaying() && fromUser) {
                    mp2.seekTo(progress*1000);
                }
                else if (mp3.isPlaying() && fromUser) {
                    mp3.seekTo(progress*1000);
                }
                else if (mp4.isPlaying() && fromUser) {
                    mp4.seekTo(progress*1000);
                }
                else if (mp5.isPlaying() && fromUser) {
                    mp5.seekTo(progress*1000);
                }
                else if (mp6.isPlaying() && fromUser) {
                    mp6.seekTo(progress*1000);
                }
                else if (mp7.isPlaying() && fromUser) {
                    mp7.seekTo(progress*1000);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        // When war chant button is clicked it plays music, stops other music from playing, and activates respective image
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mp1.isPlaying()) {
                    musicStop(mp1);
                    activateMedia(mp1);
                }
                else if (mp2.isPlaying()) {
                    musicStop(mp2);
                    activateMedia(mp1);
                }
                else if (mp3.isPlaying()) {
                    musicStop(mp3);
                    activateMedia(mp1);
                }
                else if (mp4.isPlaying()) {
                    musicStop(mp4);
                    activateMedia(mp1);
                }
                else if (mp5.isPlaying()) {
                    musicStop(mp5);
                    activateMedia(mp1);
                }
                else if (mp6.isPlaying()) {
                    musicStop(mp6);
                    activateMedia(mp1);
                }
                else if (mp7.isPlaying()) {
                    musicStop(mp7);
                    activateMedia(mp1);
                }
                else {
                    activateMedia(mp1);
                }
            }
        });

        // When fight song button is clicked it plays music, stops other music from playing, and activates respective image
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp2.isPlaying()) {
                    musicStop(mp2);
                    activateMedia(mp2);
                }
                else if (mp1.isPlaying()) {
                    musicStop(mp1);
                    activateMedia(mp2);
                }
                else if (mp3.isPlaying()) {
                    musicStop(mp3);
                    activateMedia(mp2);
                }
                else if (mp4.isPlaying()) {
                    musicStop(mp4);
                    activateMedia(mp2);
                }
                else if (mp5.isPlaying()) {
                    musicStop(mp5);
                    activateMedia(mp2);
                }
                else if (mp6.isPlaying()) {
                    musicStop(mp6);
                    activateMedia(mp2);
                }
                else if (mp7.isPlaying()) {
                    musicStop(mp7);
                    activateMedia(mp2);
                }
                else {
                    activateMedia(mp2);
                }
            }
        });

        // When victory song button is clicked it plays music, stops other music from playing, and activates respective image
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp3.isPlaying()) {
                    musicStop(mp3);
                    activateMedia(mp3);
                }
                else if (mp2.isPlaying()) {
                    musicStop(mp2);
                    activateMedia(mp3);
                }
                else if (mp1.isPlaying()) {
                    musicStop(mp1);
                    activateMedia(mp3);
                }
                else if (mp4.isPlaying()) {
                    musicStop(mp4);
                    activateMedia(mp3);
                }
                else if (mp5.isPlaying()) {
                    musicStop(mp5);
                    activateMedia(mp3);
                }
                else if (mp6.isPlaying()) {
                    musicStop(mp6);
                    activateMedia(mp3);
                }
                else if (mp7.isPlaying()) {
                    musicStop(mp7);
                    activateMedia(mp3);
                }
                else {
                    activateMedia(mp3);
                }
            }
        });

        // When gold and garnette button is clicked it plays music, stops other music from playing, and activates respective image
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp4.isPlaying()) {
                    musicStop(mp4);
                    activateMedia(mp4);
                }
                else if (mp2.isPlaying()) {
                    musicStop(mp2);
                    activateMedia(mp4);
                }
                else if (mp3.isPlaying()) {
                    musicStop(mp3);
                    activateMedia(mp4);
                }
                else if (mp1.isPlaying()) {
                    musicStop(mp1);
                    activateMedia(mp4);
                }
                else if (mp5.isPlaying()) {
                    musicStop(mp5);
                    activateMedia(mp4);
                }
                else if (mp6.isPlaying()) {
                    musicStop(mp6);
                    activateMedia(mp4);
                }
                else if (mp7.isPlaying()) {
                    musicStop(mp7);
                    activateMedia(mp4);
                }
                else {
                    activateMedia(mp4);
                }
            }
        });

        // When fsu cheer button is clicked it plays music, stops other music from playing, and activates respective image
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp5.isPlaying()) {
                    musicStop(mp5);
                    activateMedia(mp5);
                }
                else if (mp2.isPlaying()) {
                    musicStop(mp2);
                    activateMedia(mp5);
                }
                else if (mp3.isPlaying()) {
                    musicStop(mp3);
                    activateMedia(mp5);
                }
                else if (mp4.isPlaying()) {
                    musicStop(mp4);
                    activateMedia(mp5);
                }
                else if (mp1.isPlaying()) {
                    musicStop(mp1);
                    activateMedia(mp5);
                }
                else if (mp6.isPlaying()) {
                    musicStop(mp6);
                    activateMedia(mp5);
                }
                else if (mp7.isPlaying()) {
                    musicStop(mp7);
                    activateMedia(mp5);
                }
                else {
                    activateMedia(mp5);
                }
            }
        });

        // When 4th quarter button is clicked it plays music, stops other music from playing, and activates respective image
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp6.isPlaying()) {
                    musicStop(mp6);
                    activateMedia(mp6);
                }
                else if (mp2.isPlaying()) {
                    musicStop(mp2);
                    activateMedia(mp6);
                }
                else if (mp3.isPlaying()) {
                    musicStop(mp3);
                    activateMedia(mp6);
                }
                else if (mp4.isPlaying()) {
                    musicStop(mp4);
                    activateMedia(mp6);
                }
                else if (mp5.isPlaying()) {
                    musicStop(mp5);
                    activateMedia(mp6);
                }
                else if (mp1.isPlaying()) {
                    musicStop(mp1);
                    activateMedia(mp6);
                }
                else if (mp7.isPlaying()) {
                    musicStop(mp7);
                    activateMedia(mp6);
                }
                else {
                    activateMedia(mp6);
                }
            }
        });

        // When seminole uprising button is clicked it plays music, stops other music from playing, and activates respective image
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp7.isPlaying()) {
                    musicStop(mp7);
                    activateMedia(mp7);
                }
                else if (mp2.isPlaying()) {
                    musicStop(mp2);
                    activateMedia(mp7);
                }
                else if (mp3.isPlaying()) {
                    musicStop(mp3);
                    activateMedia(mp7);
                }
                else if (mp4.isPlaying()) {
                    musicStop(mp4);
                    activateMedia(mp7);
                }
                else if (mp5.isPlaying()) {
                    musicStop(mp5);
                    activateMedia(mp7);
                }
                else if (mp6.isPlaying()) {
                    musicStop(mp6);
                    activateMedia(mp7);
                }
                else if (mp1.isPlaying()) {
                    musicStop(mp1);
                    activateMedia(mp7);
                }
                else {
                    activateMedia(mp7);
                }
            }
        });

        // When stop button is clicked, checks which sound is playing and proceeds to call stop function.
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button9.setVisibility(View.INVISIBLE);
                if (mp1.isPlaying())
                    musicStop(mp1);
                else if (mp2.isPlaying())
                    musicStop(mp2);
                else if (mp3.isPlaying())
                    musicStop(mp3);
                else if (mp4.isPlaying())
                    musicStop(mp4);
                else if (mp5.isPlaying())
                    musicStop(mp5);
                else if (mp6.isPlaying())
                    musicStop(mp6);
                else if (mp7.isPlaying())
                    musicStop(mp7);
            }
        });

        // Toggles between pausing and playing music when button 9 is pressed
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(am.isMusicActive()) {
                   if (mp1.isPlaying()) {
                       mp1.pause();
                       n = 1;
                   }
                   else if (mp2.isPlaying()) {
                       mp2.pause();
                       n = 2;
                   }
                   else if (mp3.isPlaying()) {
                       mp3.pause();
                       n = 3;
                   }
                   else if (mp4.isPlaying()) {
                       mp4.pause();
                       n = 4;
                   }
                   else if (mp5.isPlaying()) {
                       mp5.pause();
                       n = 5;
                   }
                   else if (mp6.isPlaying()) {
                       mp6.pause();
                       n = 6;
                   }
                   else if (mp7.isPlaying()) {
                       mp7.pause();
                       n = 7;
                   }
                    button9.setText("Play");
                }
                else if (!am.isMusicActive()) {
                    if (n == 1)
                        mp1.start();
                    else if (n == 2)
                        mp2.start();
                    else if (n ==3)
                        mp3.start();
                    else if (n ==4)
                        mp4.start();
                    else if (n == 5)
                        mp5.start();
                    else if (n == 6)
                        mp6.start();
                    else if (n == 7)
                        mp7.start();

                    button9.setText(("Pause"));
                }
            }
        });
    }

    // function to stop music from playing, resets seek bar progression, and sets seekbar and image to invisible when song is not playing
    public void musicStop(MediaPlayer mp) {
        mp.pause();
        mp.seekTo(0);
        sb.setProgress(0);
        sb.setVisibility(View.INVISIBLE);
        iv.setVisibility(View.INVISIBLE);
        if (hand != null) {
            hand.removeCallbacks(runnable);
        }
    }

    // function start song, display respective image, and set pause/pay button to visible
    public void activateMedia(MediaPlayer mp) {
        mp.start();
        initializeSeekBar();
        button9.setVisibility(View.VISIBLE);

        if (mp1.isPlaying())
            iv.setImageResource(R.drawable.war_chant_img);
        else if (mp2.isPlaying())
            iv.setImageResource(R.drawable.fight_img);
        else if (mp3.isPlaying())
            iv.setImageResource(R.drawable.victory);
        else if (mp4.isPlaying())
            iv.setImageResource(R.drawable.gg);
        else if (mp5.isPlaying())
            iv.setImageResource(R.drawable.cheer);
        else if (mp6.isPlaying())
            iv.setImageResource(R.drawable.fourth);
        else if (mp7.isPlaying())
            iv.setImageResource(R.drawable.uprising);

        iv.setVisibility(View.VISIBLE);
        button9.setText("Pause");
    }

    // function to initialize the seek bar once sound plays
    public void initializeSeekBar(){
        sb.setVisibility(View.VISIBLE);
        runnable = new Runnable() {
            @Override
            public void run() {
                if(mp1.isPlaying()){
                    sb.setMax(mp1.getDuration()/1000);
                    int mCurrentPosition = mp1.getCurrentPosition()/1000;
                    sb.setProgress(mCurrentPosition);
                }

                else if(mp2.isPlaying()){
                    sb.setMax(mp2.getDuration()/1000);
                    int mCurrentPosition = mp2.getCurrentPosition()/1000;
                    sb.setProgress(mCurrentPosition);
                }
                else if(mp3.isPlaying()){
                    sb.setMax(mp3.getDuration()/1000);
                    int mCurrentPosition = mp3.getCurrentPosition()/1000;
                    sb.setProgress(mCurrentPosition);
                }
                else if(mp4.isPlaying()){
                    sb.setMax(mp4.getDuration()/1000);
                    int mCurrentPosition = mp4.getCurrentPosition()/1000;
                    sb.setProgress(mCurrentPosition);
                }
                else if(mp5.isPlaying()){
                    sb.setMax(mp5.getDuration()/1000);
                    int mCurrentPosition = mp5.getCurrentPosition()/1000;
                    sb.setProgress(mCurrentPosition);
                }
                else if(mp6.isPlaying()){
                    sb.setMax(mp6.getDuration()/1000);
                    int mCurrentPosition = mp6.getCurrentPosition()/1000;
                    sb.setProgress(mCurrentPosition);
                }
                else if(mp7.isPlaying()){
                    sb.setMax(mp7.getDuration()/1000);
                    int mCurrentPosition = mp7.getCurrentPosition()/1000;
                    sb.setProgress(mCurrentPosition);
                }
                hand.postDelayed(runnable,1000);
            }
        };
        hand.postDelayed(runnable,1000);
    }

    // ensures that music stops playing once app is closed
    @Override
    public void onPause() {
        super.onPause();
if (mp1.isPlaying()) { musicStop(mp1); };
        if (mp2.isPlaying()) { musicStop(mp2); };
        if (mp3.isPlaying()) { musicStop(mp3); };
        if (mp4.isPlaying()) { musicStop(mp4); };
        if (mp5.isPlaying()) { musicStop(mp5); };
        if (mp6.isPlaying()) { musicStop(mp6); };
        if (mp7.isPlaying()) { musicStop(mp7); };
    }
}

