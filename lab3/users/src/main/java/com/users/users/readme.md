Letter B.1)
A instância é completada pelo @Autowired, que por sua vez, é implementado pelo Java JPA.

Letter B.2)
findAll(), findById(), save(), deleteById() são métodos implementados pelo Java JPA, no springframework.data.jpa.repository.JpaRepository.

Letter B.3)
Os dados estão sendo salvos na memória, por isso, ao reiniciar o servidor, os dados são perdidos, é necessário implementar um banco de dados em cache para que os dados sejam salvos permanentemente.

Letter B.4)
No ficheiro User, onde as notações @NotBlank são responsáveis por validar os dados inseridos pelo utilizador, caso os dados não sejam válidos, o programa não irá funcionar. O @NotBlank é implementado pelo Java Bean Validation.