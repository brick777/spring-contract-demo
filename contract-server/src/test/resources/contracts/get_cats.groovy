package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description 'should get cat with id 1'

    request {
        url "/v1/cats/1"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body (
                name: $(consumer("Fela"), producer(anyNonBlankString())),
                color: $(consumer("biały"), producer("czarny_1")),
        )
    }
}