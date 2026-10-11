Complete a classe Employee, cujos quatro campos usam, cada um, um nível de acesso diferente.

ssn é private: somente a própria Employee pode lê-lo
department não tem modificador (acesso padrão, ao pacote)
role é protected
company é public, portanto Main pode lê-lo diretamente
O construtor define os quatro; getBadge() retorna company: role (department) SSN ***-**- seguido pelos últimos 4 caracteres de ssn