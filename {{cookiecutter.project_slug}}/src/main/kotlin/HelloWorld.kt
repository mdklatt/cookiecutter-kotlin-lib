package {{ cookiecutter.lib_package }}

/**
 * Generate a greeting.
 */
class HelloWorld(var name: String = "World") {
    /**
     * Greeting message.
     *
     * @return message
     */
    fun greeting() = "Hello, ${name}!"
} 
