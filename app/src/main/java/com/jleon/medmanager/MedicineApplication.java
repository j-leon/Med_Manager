package com.jleon.medmanager;

import android.app.Application;

import androidx.room.Room;

import com.jleon.medmanager.core.db.AppDatabase;

public class MedicineApplication extends Application {

    public AppDatabase APP_DB;

    @Override
    public void onCreate() {
        super.onCreate();
        APP_DB = Room.databaseBuilder(this,AppDatabase.class, AppDatabase.DB_NAME).build();
    }
}
