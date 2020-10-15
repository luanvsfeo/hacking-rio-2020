# Minha viagem - 2020
### Mestres da programação / Turismo

#### Apresentação 

Minha viagem é um aplicativo com o objetivo de ajudar pessoas a organizarem todo o seu plano de viagem de maneira facil 


#### O Produto

Com o "Minha viagem", os usuarios não terem mais que abrir varios aplicativos diferentes para saber as informações sobre a viagem que vai realizar ou esta realizando. Em um mesmo app,  ele consegue saber sobre o seus voô, sobre os hoteis que esta hospedado, sobre o carro alugado para a viagem, tudo de maneira centralizada e de facil acesso. 

Existe tambem um sistema de pontos para recompensar os usuarios que realizarem check-in em lugares que passar durante a viagem, que podem ser pontos turisticos, restaurantes, bares, etc .Com isso podemos monitorar de maneira indireta aonde os turistas vão e como vão, ja que o proprio usuario registrou essas informações.


#### Duvidas 


##### Como você consegue validar que o usuario realmente esta no local para realizar o check in ?

Utilizando a geolocalização do usuario no momento da realização do check in, assim tendo uma confiabilidade e controle .



##### Como você consegue as informações sobre os voôs e das demais informações que são cadastradas no itinerario do usuario?

Utilizando a API do [Aviationstack](https://aviationstack.com/documentation) para ter as informações dos voôs e utilizando a API
do [TripAdvisor](http://developer-tripadvisor.com/content-api/documentation/) para ter as informações dos estabelecimentos, bares, pontos
turisticos, etc.



#### Tecnologias utilizadas
 - Spring boot
 - JPA/Hibernate
 - React Native
 - PostgreSQL
