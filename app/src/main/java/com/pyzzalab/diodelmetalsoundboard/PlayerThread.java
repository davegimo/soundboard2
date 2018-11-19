package com.pyzzalab.diodelmetalsoundboard;

import android.media.MediaPlayer;
import android.os.AsyncTask;

class PlayerThread extends AsyncTask<MediaPlayer, Void, Void>
{
    @Override
    protected Void doInBackground(MediaPlayer... player) {

        player[0].start();
        return null;
    }
}