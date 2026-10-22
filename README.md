# FabricaAuto

## Identificação acadêmica

**Instituição:** UNIUBE — Universidade de Uberaba  
**Curso:** Análise e Desenvolvimento de Sistemas  
**Disciplina:** Programação Orientada a Objetos  
**Atividade:** ACQA — Avaliação Continuada - Questão Aberta  
**Tutor:** ROGERIO BERNARDES ANDRADE  
**Aluno:** VINICIUS SILVA DE ANDRADE  
**RA:** *******

---

## 1. Descrição do projeto

O **FabricaAuto** é uma aplicação desenvolvida em Java como parte de uma atividade avaliativa para obtenção de nota na disciplina Programação Orientada a Objetos, do curso de Análise e Desenvolvimento de Sistemas da UNIUBE.

O projeto consiste no desenvolvimento de um sistema de console destinado ao cadastro, à consulta e ao gerenciamento de veículos, utilizando conceitos fundamentais da Programação Orientada a Objetos (POO).

A aplicação permite cadastrar carros e motos, listar os veículos registrados, selecionar um veículo para executar operações e consultar seu estado atual. Cada tipo de veículo possui características específicas, além de comportamentos comuns herdados de uma classe base.

Durante o desenvolvimento, foram adotadas decisões de organização e validação para tornar o código mais legível, facilitar a manutenção e garantir que as operações respeitem as regras de funcionamento estabelecidas para cada veículo.

Além de atender às funcionalidades previstas para o sistema, o projeto busca demonstrar a aplicação prática de conceitos como encapsulamento, herança, sobrescrita de métodos, reutilização de código e separação de responsabilidades.

## 2. Objetivos do projeto

### 2.1. Objetivo geral

Desenvolver uma aplicação em Java que demonstre a utilização dos princípios da Programação Orientada a Objetos por meio da representação e do gerenciamento de diferentes tipos de veículos.

### 2.2. Objetivos específicos

- Criar classes para representar automóveis, carros e motos.
- Aplicar encapsulamento para controlar o acesso aos atributos.
- Utilizar herança para compartilhar características e comportamentos entre classes.
- Implementar operações para ligar, movimentar, parar e desligar veículos.
- Criar regras específicas para controlar as operações de carros e motos.
- Desenvolver menus para cadastro, listagem, seleção e consulta de veículos.
- Validar as informações fornecidas pelo usuário.
- Separar as responsabilidades do sistema em classes específicas.
- Documentar o funcionamento e verificar as funcionalidades por meio de testes manuais.

## 3. Requisitos funcionais contemplados

O sistema foi organizado para contemplar as seguintes funcionalidades:

1. Cadastrar carros com informações de cor, placa, modelo e presença de teto solar.
2. Cadastrar motos com informações de cor, placa, modelo, presença de freio ABS e presença de baú.
3. Armazenar os veículos cadastrados em uma lista.
4. Listar os veículos registrados, exibindo seus atributos comuns e específicos.
5. Selecionar um veículo pelo número apresentado na listagem.
6. Ligar e desligar o veículo selecionado.
7. Movimentar e parar o veículo selecionado.
8. Consultar o estado atual do veículo.
9. Abrir e fechar o carro, respeitando suas regras específicas.
10. Acionar o alarme da moto.
11. Validar campos obrigatórios, estados binários e opções numéricas.
12. Impedir operações incompatíveis com o estado atual do veículo.

**Nota:** esta lista descreve as funcionalidades contempladas na implementação documentada. Para afirmar correspondência integral com o enunciado oficial da ACQA, é necessário conferir também o documento original da atividade.

## 4. Tecnologias utilizadas

- **Linguagem de programação:** Java.
- **Versão de referência:** Java 21.
- **Ambiente de desenvolvimento:** Apache NetBeans.
- **Interface com o usuário:** console.
- **Paradigma de programação:** Programação Orientada a Objetos.
- **Testes:** testes manuais executados pela interface de console.

O projeto não depende de interface gráfica ou banco de dados para executar as funcionalidades descritas. Os veículos são armazenados em memória durante a execução do programa.

## 5. Funcionalidades do sistema

### 5.1. Menu principal

O menu principal permite acessar as funcionalidades de gerenciamento dos veículos.

| Opção | Funcionalidade |
|---|---|
| 1 | Cadastrar carro |
| 2 | Cadastrar moto |
| 3 | Listar veículos cadastrados |
| 4 | Selecionar veículo |
| 0 | Encerrar o sistema |

A utilização de um menu centralizado permite que o usuário acesse as funcionalidades de maneira organizada, sem precisar interagir diretamente com as classes internas do sistema.

### 5.2. Cadastro de carros

O cadastro de carros solicita:

- Cor;
- Placa;
- Modelo;
- Presença de teto solar.

O veículo é instanciado a partir da classe `Carro` e adicionado à lista de veículos.

### 5.3. Cadastro de motos

O cadastro de motos solicita:

- Cor;
- Placa;
- Modelo;
- Presença de freio ABS;
- Presença de baú.

O veículo é instanciado a partir da classe `Moto` e armazenado na mesma lista utilizada para os carros.

### 5.4. Listagem de veículos

A listagem apresenta os dados dos veículos cadastrados, incluindo:

- Número de identificação na lista;
- Tipo de veículo;
- Modelo;
- Placa;
- Cor;
- Estado de funcionamento;
- Estado de movimentação;
- Características específicas do carro ou da moto.

A identificação do tipo de veículo permite apresentar os atributos específicos de cada classe sem duplicar toda a estrutura de armazenamento.

### 5.5. Seleção e operações

Após selecionar um veículo, o usuário pode acessar um menu de operações.

| Opção | Operação |
|---|---|
| 1 | Ligar |
| 2 | Mover |
| 3 | Parar |
| 4 | Desligar |
| 5 | Operação específica do veículo |
| 6 | Consultar estado |
| 0 | Voltar ao menu principal |

A opção 5 é adaptada ao tipo selecionado: para carros, permite abrir ou fechar; para motos, aciona o alarme.

## 6. Regras de negócio

As regras de negócio definem quais operações podem ser executadas em cada situação. Elas evitam alterações indevidas no estado dos objetos e mantêm os comportamentos dos veículos consistentes.

### 6.1. Regras gerais dos veículos

- O veículo começa desligado e parado.
- Os estados binários utilizados pelo sistema aceitam os valores `0` e `1`.
- O veículo deve estar ligado para iniciar a movimentação, conforme a implementação de `Automovel`.
- Um veículo em movimento deve ser parado antes de ser desligado.
- A seleção exige que exista um veículo cadastrado.
- O número informado para selecionar um veículo deve corresponder a um item existente na lista.

### 6.2. Regras específicas do carro

O carro possui regras adicionais relacionadas ao estado de abertura:

- Não pode ser aberto enquanto estiver em movimento.
- Não pode ser fechado ou ter seu estado de abertura alterado enquanto estiver em movimento.
- Não pode iniciar a movimentação enquanto estiver aberto.
- Pode ser aberto ou fechado quando estiver parado.
- Para movimentar-se após ser aberto, deve primeiro ser fechado e estar ligado.

Essas restrições são implementadas na classe `Carro`, que sobrescreve o método `mover()` e verifica o estado de abertura antes de delegar a operação à classe base.

### 6.3. Regras específicas da moto

A classe `Moto` possui atributos específicos para representar a presença de freio ABS e baú, além de disponibilizar a operação de acionamento do alarme.

Essas características são mantidas na classe especializada, evitando que os atributos exclusivos da moto sejam adicionados à classe genérica `Automovel`.

## 7. Estrutura do projeto

A organização prevista para o projeto no NetBeans é:

```text
FabricaAuto/
├── src/
│   └── fabricaauto/
│       ├── Automovel.java
│       ├── Carro.java
│       ├── Moto.java
│       ├── FabricaAuto.java
│       ├── Menu.java
│       ├── EntradaUtil.java
│       └── Validador.java
├── nbproject/
├── build.xml
└── README.md
```

Os arquivos de configuração podem variar conforme a versão e o modelo de projeto utilizado no NetBeans.

Todas as classes Java pertencem ao pacote `fabricaauto`.

## 8. Responsabilidades das classes

### 8.1. `FabricaAuto.java`

É a classe principal da aplicação e contém o método `main()`.

Sua responsabilidade é instanciar a classe `Menu` e iniciar a execução do sistema.

**Motivo da decisão:** manter o ponto de entrada simples evita concentrar regras de negócio, leitura de dados e lógica de navegação em uma única classe.

### 8.2. `Automovel.java`

Representa a classe base dos veículos.

Concentra os atributos comuns, como cor, placa, modelo, estado de funcionamento e estado de movimentação, além dos comportamentos gerais de ligar, mover, parar e desligar.

**Motivo da decisão:** carros e motos compartilham diversas características. Centralizar esses elementos reduz a duplicação de código e facilita a manutenção das regras comuns.

### 8.3. `Carro.java`

É uma especialização de `Automovel`.

Acrescenta os atributos relativos ao teto solar e ao estado de abertura do carro. Também implementa o método `abrirFechar()` e sobrescreve `mover()` para respeitar as restrições relacionadas à abertura.

**Motivo da decisão:** as regras exclusivas do carro devem permanecer na classe que representa esse tipo de veículo. Dessa forma, o comportamento específico pode ser implementado sem alterar desnecessariamente a classe base.

### 8.4. `Moto.java`

É uma especialização de `Automovel`.

Acrescenta os atributos de freio ABS e baú, além do comportamento de acionamento do alarme.

**Motivo da decisão:** manter as características específicas da moto em sua própria classe evita que a classe genérica contenha atributos que não se aplicam a todos os veículos.

### 8.5. `Menu.java`

É responsável pela interação com o usuário.

Gerencia o menu principal, o cadastro de carros e motos, a listagem, a seleção dos veículos e o menu de operações.

**Motivo da decisão:** separar a interface de console das regras de negócio facilita a leitura do código e permite modificar a navegação sem precisar concentrar todas as alterações nas classes dos veículos.

### 8.6. `EntradaUtil.java`

Centraliza a leitura de dados digitados pelo usuário, incluindo números inteiros e textos.

**Motivo da decisão:** a centralização da entrada de dados reduz a repetição de código e mantém o processo de leitura consistente entre as diferentes funcionalidades.

### 8.7. `Validador.java`

Reúne métodos auxiliares para verificar textos obrigatórios, estados binários e opções numéricas dentro de intervalos permitidos.

**Motivo da decisão:** separar as validações em uma classe utilitária torna as verificações reutilizáveis e evita repetir as mesmas regras em diferentes partes do programa.

## 9. Conceitos de Programação Orientada a Objetos aplicados

### 9.1. Classes e objetos

As classes definem as características e os comportamentos dos veículos. Os objetos são as instâncias criadas durante os cadastros.

Por exemplo, cada carro cadastrado é uma instância de `Carro`, enquanto cada moto cadastrada é uma instância de `Moto`.

### 9.2. Encapsulamento

Os atributos dos veículos são declarados como privados e seu acesso é controlado por métodos públicos, como getters e setters.

Essa abordagem reduz a manipulação direta dos atributos e permite aplicar validações em pontos específicos de alteração.

### 9.3. Herança

As classes `Carro` e `Moto` utilizam `extends Automovel` para herdar características e comportamentos comuns.

A herança evita a repetição de atributos e métodos e estabelece uma relação entre a classe genérica e suas especializações.

### 9.4. Sobrescrita de métodos

A classe `Carro` sobrescreve o método `mover()` utilizando a anotação `@Override`.

Antes de movimentar o carro, o método verifica se ele está aberto. Caso esteja, a operação é bloqueada. Caso contrário, o comportamento original de `Automovel` é executado por meio de `super.mover()`.

Essa decisão demonstra como uma classe derivada pode especializar um comportamento herdado sem precisar duplicar toda a implementação original.

### 9.5. Polimorfismo

A lista de veículos utiliza o tipo `Automovel`:

```java
private final List<Automovel> listaVeiculos = new ArrayList<>();
```

Isso permite armazenar objetos de diferentes classes derivadas na mesma coleção.

Ao percorrer a lista, o sistema pode tratar os veículos por meio da referência genérica `Automovel` e identificar se cada objeto é um `Carro` ou uma `Moto` quando precisa acessar características específicas.

### 9.6. Separação de responsabilidades

Cada classe possui uma função definida: inicialização, interação, leitura, validação ou comportamento dos veículos.

Essa organização reduz o acoplamento entre as partes do programa e torna mais simples localizar erros, implementar melhorias e compreender o funcionamento geral da aplicação.

## 10. Justificativas das decisões de implementação

As principais decisões técnicas adotadas durante o desenvolvimento são descritas a seguir.

| Decisão | Justificativa |
|---|---|
| Utilizar uma classe base `Automovel` | Compartilhar atributos e operações comuns aos veículos. |
| Criar classes derivadas `Carro` e `Moto` | Representar características e comportamentos específicos de cada tipo. |
| Manter atributos privados | Aplicar encapsulamento e controlar o acesso aos dados. |
| Utilizar uma lista de `Automovel` | Armazenar diferentes tipos de veículos em uma única coleção. |
| Separar a classe `Menu` | Evitar concentrar toda a lógica da aplicação na classe principal. |
| Criar `EntradaUtil` | Centralizar os métodos de leitura de dados. |
| Criar `Validador` | Reutilizar verificações de entrada em diferentes operações. |
| Sobrescrever `mover()` em `Carro` | Impedir a movimentação enquanto o carro estiver aberto, preservando a regra geral da classe base. |
| Validar a abertura do carro | Impedir alterações no estado de abertura enquanto o veículo estiver em movimento. |
| Utilizar testes manuais | Verificar o comportamento real do sistema por meio das opções disponíveis no console, sem adicionar dependências de testes automatizados. |

As decisões foram tomadas para manter a implementação compreensível, organizada e compatível com os conceitos estudados na disciplina.

## 11. Validação e tratamento de entradas

O sistema utiliza mecanismos de validação para reduzir erros decorrentes das informações fornecidas pelo usuário.

### 11.1. Textos obrigatórios

Os campos de texto do cadastro não podem ficar vazios. Quando o usuário informa um campo sem conteúdo, o sistema solicita uma nova entrada.

### 11.2. Estados binários

Os atributos que representam opções do tipo sim ou não utilizam os valores `0` e `1`.

- `0`: Não.
- `1`: Sim.

Valores diferentes desses são rejeitados nas entradas em que essa validação é aplicada.

### 11.3. Opções e seleção

O programa verifica se o número do veículo selecionado corresponde a uma posição válida na lista. Também apresenta mensagens para opções inválidas nos menus.

A validação dos dados é realizada antes da execução de determinadas operações para evitar acessos inválidos e entradas incompatíveis com o formato esperado.

## 12. Como executar o projeto

1. Abra o Apache NetBeans.
2. Abra o projeto `FabricaAuto`.
3. Verifique se o JDK 21 está configurado para o projeto.
4. Execute a opção **Clean and Build Project**.
5. Confirme se a compilação foi concluída com sucesso.
6. Execute o projeto pela opção **Run Project** ou pelo atalho `F6`, conforme a configuração do NetBeans.
7. Utilize o menu apresentado no console para cadastrar e operar os veículos.

A aplicação mantém os veículos em memória. Portanto, os cadastros realizados durante uma execução não são persistidos automaticamente após o encerramento do programa.

## 13. Plano de testes manuais

Os testes manuais são realizados por meio do próprio console. O objetivo é verificar se as funcionalidades implementadas se comportam conforme as regras definidas.

### 13.1. Teste do menu principal

- Iniciar a aplicação.
- Verificar a exibição das opções.
- Informar uma opção inválida.
- Encerrar o programa pela opção `0`.

### 13.2. Teste de cadastro e listagem

- Cadastrar um carro com dados válidos.
- Cadastrar uma moto com dados válidos.
- Listar os veículos.
- Verificar os atributos comuns e específicos de cada objeto.
- Tentar informar um campo obrigatório vazio.
- Informar um valor diferente de `0` ou `1` em um atributo binário.

### 13.3. Teste das operações gerais

- Selecionar um veículo cadastrado.
- Ligar o veículo.
- Movimentar o veículo.
- Parar o veículo.
- Desligar o veículo quando estiver parado.
- Tentar desligar o veículo enquanto estiver em movimento.
- Consultar o estado do veículo após as operações.

### 13.4. Teste das regras específicas do carro

- Abrir o carro quando estiver parado.
- Tentar movimentar o carro enquanto estiver aberto.
- Confirmar que a movimentação é bloqueada.
- Fechar o carro.
- Movimentá-lo quando estiver fechado e ligado.
- Tentar abrir o carro enquanto estiver em movimento.
- Tentar fechar ou alterar a abertura enquanto estiver em movimento.
- Confirmar que as alterações de abertura são bloqueadas durante o movimento.

### 13.5. Teste das operações da moto

- Cadastrar e selecionar uma moto.
- Verificar a exibição das informações sobre freio ABS e baú.
- Acionar o alarme.
- Consultar o estado do veículo.

### 13.6. Teste da seleção

- Tentar selecionar um veículo sem haver cadastros.
- Informar um número inexistente.
- Selecionar um veículo válido.
- Verificar se as operações apresentadas correspondem ao tipo selecionado.

**Registro dos resultados:** os testes devem ser considerados aprovados somente após a execução e a confirmação dos resultados esperados. A compilação bem-sucedida, isoladamente, não comprova que todas as regras de negócio estão funcionando.

## 14. Limitações e possibilidades de melhoria

A versão atual foi concebida como uma aplicação acadêmica de console e possui algumas limitações que podem ser tratadas em versões futuras:

- Persistir os cadastros em arquivo ou banco de dados.
- Implementar validação de formato de placa.
- Criar identificadores permanentes para os veículos.
- Ampliar o tratamento de situações de entrada inesperada.
- Automatizar testes unitários para as regras de negócio.
- Criar uma interface gráfica.
- Aprimorar o tratamento de exceções e mensagens de erro.

Essas possibilidades não são apresentadas como funcionalidades já implementadas, mas como oportunidades de evolução do projeto.

## 15. Considerações finais

O desenvolvimento do FabricaAuto permite aplicar os conceitos fundamentais da Programação Orientada a Objetos em um sistema funcional de gerenciamento de veículos.

A utilização de uma classe base e de classes especializadas demonstra o reaproveitamento de código por herança. O encapsulamento contribui para o controle dos atributos, enquanto a sobrescrita de métodos permite adaptar comportamentos às regras específicas de cada veículo.

A separação das responsabilidades entre as classes `FabricaAuto`, `Menu`, `EntradaUtil`, `Validador`, `Automovel`, `Carro` e `Moto` contribui para uma estrutura mais organizada, legível e de fácil manutenção.

Por fim, a implementação das regras de negócio e a execução de testes manuais permitem verificar se o sistema respeita os estados dos veículos e impede operações incompatíveis com as condições estabelecidas.

O projeto constitui, assim, uma aplicação prática dos conhecimentos adquiridos na disciplina Programação Orientada a Objetos, no contexto da atividade avaliativa da UNIUBE.

---

**UNIUBE — Análise e Desenvolvimento de Sistemas**  
**Disciplina:** Programação Orientada a Objetos  
**Tutor:** ROGERIO BERNARDES ANDRADE  
**Aluno:** VINICIUS SILVA DE ANDRADE  
**RA:** 1221535
