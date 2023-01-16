package net.andrzejczak.test.contract.server

import spock.lang.Specification

class ApplicationSpec extends Specification {
    def "dumy test"() {
        given:
            def a = "2"
        when:
            def b = "2"
        then:
            a==b
    }
}
