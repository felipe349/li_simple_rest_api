package contracts

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url ('/pessoa') {
            queryParameters {
                parameter("cpf", "12345678900")
            }
        }
    }
    response {
        status 200
        body ([
                cpf : "12345678900",
                nome : "Felipe",
                sexo : "M",
                idade : 21
        ])
    }
}