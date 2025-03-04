# 🏦 Banco de Konoha
Este desafio foi desenvolvido para simular operações bancárias básicas, como consulta de saldo, depósitos, saques e transferências entre contas.
Este projeto foi criado como parte do Desafio 5 do curso Java10x, com o objetivo de aplicar e consolidar conceitos de Programação Orientada a Objetos (POO) em Java.

# 🚀 O Que Este Projeto Faz?
O Banco de Konoha é um sistema bancário simples que permite:

Criar contas correntes e contas poupança.

Realizar operações como depósito, consulta de saldo e saque.

Transferir valores entre contas, com tratamento de exceções para garantir segurança e integridade.

Aplicar uma taxa de 1% sobre depósitos em contas poupança.

# 🧩 Componentes do Projeto
## 1. Interface Conta
Define os métodos básicos que todas as contas devem implementar:

``consultarSaldo()``: Exibe o saldo atual.

``depositar(double valor)``: Realiza um depósito.

## 2. Classe Abstrata ContaBancaria
Implementa a interface Conta e gerencia o saldo.

Inclui métodos para ``sacar(double valor)`` e verificar saldo suficiente.

## 3. Classes Concretas
### ``ContaCorrente``:

Permite depósitos sem taxas.

### ``ContaPoupanca``:

Aplica uma taxa de 1% sobre depósitos.

## 4. Enum ``TipoConta``
Define os tipos de conta: CORRENTE e POUPANCA.

## 5. Classe Principal ``BancoKonoha``
Contém o método main para execução do programa.

Implementa a funcionalidade de transferência entre contas, com tratamento de exceções.

# 🛠️ Tecnologias Utilizadas
Java 8+

Programação Orientada a Objetos (POO)

Git & GitHub (para versionamento)


# 🧠 Conceitos Aplicados
Abstração: Uso de interfaces e classes abstratas.

Encapsulamento: Atributos privados e métodos públicos.

Herança: Reutilização de código através de classes base.

Polimorfismo: Sobrescrita de métodos para comportamentos específicos.

Tratamento de Exceções: Uso de try-catch e IllegalArgumentException.

*Nota: Este projeto foi desenvolvido como parte do curso Java10x e é ideal para quem está começando a aprender Java e POO. É um desafio acessível, prático e educativo! 🚀*
