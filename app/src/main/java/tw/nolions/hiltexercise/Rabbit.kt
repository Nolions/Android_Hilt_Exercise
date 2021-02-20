package tw.nolions.hiltexercise

import javax.inject.Inject
import javax.inject.Qualifier

class RabbitImpl @Inject constructor() : Animal {
    override fun type(): String {
        return "rabbit"
    }

    override fun wow(): String {
        return "mumble"
    }
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BindRabbitAnimal