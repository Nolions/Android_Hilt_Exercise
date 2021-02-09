package tw.nolions.hiltexercise

import android.util.Log
import javax.inject.Inject

class DogHilt @Inject constructor() {

    fun wow() {
        Log.d("Hilt", "DogHilt::wow()")
    }
}