package com.example.androidservice_kotlin.service

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.media.RingtoneManager
import android.os.Build
import android.os.IBinder
import android.provider.Settings
import androidx.annotation.RequiresApi


class MusicService : Service() {
    override fun onBind(p0: Intent?): IBinder? {

        return null

    }


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)
        var mp = MediaPlayer.create(this, uri)
        mp.isLooping = true
        mp.start()
        return START_NOT_STICKY
    }

    override fun onDestroy() {

        super.onDestroy()
    }

}