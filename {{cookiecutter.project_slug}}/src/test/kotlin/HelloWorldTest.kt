package {{ cookiecutter.lib_package }}

import kotlin.test.Test
import kotlin.test.assertEquals


/**
 * Unit tests for the HellowWorld class.
 */
internal class HellowWorldTest {

    val name = "Cooiecutter"
    val classUnderTest = HelloWorld(name)

    /**
     * Test the greeting() method.
     */
    @Test
    fun testGreeting() {
        assertEquals("Hello, ${name}!", classUnderTest.greeting())
    }
}
