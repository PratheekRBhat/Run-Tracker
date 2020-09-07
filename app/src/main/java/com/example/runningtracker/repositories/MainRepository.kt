package com.example.runningtracker.repositories

import com.example.runningtracker.database.Run
import com.example.runningtracker.database.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDAO
) {
    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedByDate()

    fun getAllRunsSortedByAverageSpeed() = runDao.getAllRunsSortedByAverageSpeed()

    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllRunsSortedByCaloriesBurned()

    fun getAllRunsSortedByDistanceCovered() = runDao.getAllRunsSortedByDistanceCovered()

    fun getAllRunsSortedByTime() = runDao.getAllRunsSortedByTime()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()

    fun getTotalAverageRunSpeed() = runDao.getTotalAverageRunSpeed()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

    fun getTotalDistanceCovered() = runDao.getTotalDistanceCovered()
}