package com.example.runningtracker.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM running_table ORDER BY timestamp DESC")
    fun getAllRunsSortedByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY averageSpeedInKMPH DESC")
    fun getAllRunsSortedByAverageSpeed(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY timeInMills DESC")
    fun getAllRunsSortedByTime(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY distanceInMeters DESC")
    fun getAllRunsSortedByDistanceCovered(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY caloriesBurned DESC")
    fun getAllRunsSortedByCaloriesBurned(): LiveData<List<Run>>

    @Query("SELECT SUM(timeInMills) FROM running_table")
    fun getTotalTimeInMillis(): LiveData<Long>

    @Query("SELECT SUM(distanceInMeters) FROM running_table")
    fun getTotalDistanceCovered(): LiveData<Int>

    @Query("SELECT SUM(caloriesBurned) FROM running_table")
    fun getTotalCaloriesBurned(): LiveData<Int>

    @Query("SELECT AVG(averageSpeedInKMPH) FROM running_table")
    fun getTotalAverageRunSpeed(): LiveData<Float>
}