package tw.nolions.hiltexercise

import android.util.Log
import javax.inject.Inject

class Dog @Inject constructor(
    private val dog: DogHilt
) {

    fun wow(): String {
        Log.d("Hilt", "======Dog======")
        return dog.wow()
    }
}