package tw.nolions.hiltexercise

import android.util.Log
import javax.inject.Inject

class DogHilt @Inject constructor() {

    fun wow():String {
        Log.d("Hilt", "DogHilt::wow()")
        return "wow"
    }
}