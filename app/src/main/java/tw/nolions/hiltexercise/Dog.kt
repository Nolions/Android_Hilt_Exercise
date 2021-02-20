package tw.nolions.hiltexercise

import android.util.Log
import javax.inject.Inject

class Dog @Inject constructor(
    private val dog: DogHilt
) {

    fun wow(): String {
        return dog.wow()
    }
}