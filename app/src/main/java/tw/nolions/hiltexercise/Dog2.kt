package tw.nolions.hiltexercise

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

@Module
@InstallIn(ActivityComponent::class)
class Dog2 @Inject constructor() {
    @Inject
    lateinit var dog: Dog

    fun wow(): String {
        return dog.wow()
    }
}