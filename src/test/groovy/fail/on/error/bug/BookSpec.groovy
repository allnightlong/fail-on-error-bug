package fail.on.error.bug

import grails.testing.gorm.DomainUnitTest
import grails.validation.ValidationException
import spock.lang.Specification

class BookSpec extends Specification implements DomainUnitTest<Book> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        when:
        new Book().save() //no exception thrown

        then:
        thrown ValidationException
    }
}
