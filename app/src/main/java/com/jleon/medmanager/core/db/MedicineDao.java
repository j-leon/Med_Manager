package com.jleon.medmanager.core.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MedicineDao {
    @Query("Select * from Medicine")
    List<Medicine> getAllMedicines();

    @Insert
    void insertAll(Medicine...medicines);

    @Delete
    void delete(Medicine medicine);


}
