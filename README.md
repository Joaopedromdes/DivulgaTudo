# DivulgaTudo
Ao abrir o projeto, haverá 3 classes. 
Na classe calculadora foi feita uma calculadora que retorna uma projeção aproximada da quantidadde máxima de pessoas que visualizarão o mesmo anúncio.

Na classe VisCadastro foi instânciado um objeto, onde será usado para executar o programa.

Na classe Cadastro o sistema fornecerá os relatórios de cada anúncio contendo:
Valor investido
quantidade máxima de visualizações
quantidade máxima de cliques
quantidade máxima de compartilhamentos
              
                                Como compilar e executar o programa: 
Abra o Java Eclipse na classe VisCadastro, dentro do método: LocalDate dataFinal = dataInicial.plusDays(30); informe a quantidade de dias que o anúncio ficará ativo, no exemplo: 30 dias. Após isso, informe todos os parâmetros, como, nome do anúncio, nome do cliente, sobrescreva dataInicial e dataFinal e por último, informe qual será o Valor investido diariamente. Como no exemplo a seguir, cd.cadastroAnuncio("Anúncio do novo Honda Civic", "Honda", dataInicial, dataFinal, 1);. Informando isso, efetue o Run e 