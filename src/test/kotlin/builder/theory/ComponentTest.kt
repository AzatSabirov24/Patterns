package builder.theory

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.assertAll
import org.testng.annotations.Test

class ComponentTest {

    @Test
    fun builderTest() {
        val component = Component.Builder()
            .setParam1("Some value")
            .setParam3(true)
            .build()
        println(component)
        println(component.param1)
        println(component.param3)
        Assertions.assertEquals(component.param1, "Some value")
        Assertions.assertEquals(component.param2, null)
        Assertions.assertEquals(component.param3, true)
    }
}