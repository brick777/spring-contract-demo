package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description 'should get dog with id 1'

    request {
        url "/v1/dogs/1"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body (
                age: anyPositiveInt(),
                name: anyNonBlankString(),
                owner: anyNonBlankString()
        )
    }
}