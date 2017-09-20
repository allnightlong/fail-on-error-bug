package fail.on.error.bug

class BootStrap {

    def init = { servletContext ->
        new Book().save() //exception thrown
    }
    def destroy = {
    }
}
