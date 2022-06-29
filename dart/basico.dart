void main() {
  //dart online https://dartpad.dev/
  //rodar no vscode dart nomearquivo.dart
  //criando variaveis: https://www.devmedia.com.br/sintaxe-dart-tipos-nao-tao-primitivos/40368

  //VARIÁVEIS
  String nome = 'Ana';
  bool boleano = true; //or false
  double reais = 7.7;
  int inteiro = 5;
  List lista = [1, 2, 3, 'Ana', true]; //tamanho chama metodo .length
  Map usuario = {
    'nome': 'Ana',
    'idade': 27,
    'peso': 59.9,
    'isProgramdora': true,
    7: 'sete'
  };
  var variavel; //variável dinâmica aceita qualquer tipo
  //final, static, const

  print('hello ' + nome + "!");
  print(usuario['nome']);
  print(usuario[7]);

  //ESTRUTURA DE CONTROLE
  if (true) {
    //operadores: igual == diferente !=
    print("executou o if");
  }
  print("terminou o if");

  //switch, while e for é igual ao java

  for (var item in lista) {
    print(item);
  }

  //metodos e funções
  hello('Ana');
  hello('Ana', sobrenome: 'Liberato');
}

void hello(String nome, {int idade: 0, String sobrenome: 'Figueiredo'}) {
  print("função hello " + nome + " " + sobrenome);
}
