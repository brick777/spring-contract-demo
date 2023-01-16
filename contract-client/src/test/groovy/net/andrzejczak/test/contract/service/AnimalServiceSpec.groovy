package net.andrzejczak.test.contract.service

import net.andrzejczak.test.contract.dto.Cat
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties
import spock.lang.Specification

@SpringBootTest
@AutoConfigureStubRunner(ids = ["net.andrzejczak.test.contract:server:+:stubs:8080"],
        stubsMode = StubRunnerProperties.StubsMode.LOCAL)
class AnimalServiceSpec extends Specification {

    @Autowired
    private AnimalService animalService

    def 'should get cat'() {
        when:
        Cat result = animalService.findCat(1)

        then:
            result.getName() == 'Fela'
            result.getColor() == 'biały'
    }
}
