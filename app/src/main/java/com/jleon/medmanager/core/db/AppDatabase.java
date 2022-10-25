package com.jleon.medmanager.core.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Medicine.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public static String DB_NAME = "medicine_database";

    public abstract MedicineDao medicineDao();
}