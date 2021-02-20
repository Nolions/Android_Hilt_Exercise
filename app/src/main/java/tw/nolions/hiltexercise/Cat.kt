package tw.nolions.hiltexercise

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject
import javax.inject.Qualifier

class CatImpl @Inject constructor() : Animal {
    override fun type(): String {
        return "cat"
    }

    override fun wow(): String {
        return "Meow"
    }
}

@Module
@InstallIn(ActivityComponent::class)
abstract class CatModule {
    @Binds
    abstract fun bindAnimal(cat: CatImpl): Animal
}

class Cat @Inject constructor(): CatModule() {
    override fun bindAnimal(cat: CatImpl): Animal {
        return cat
    }
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BindCatAnimal