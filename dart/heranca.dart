class Pessoas {
  // posso criar abstract class
  String primeiro_nome, ultimo_nome;
  //getters and setters: https://dev.to/newtonmunene_yg/dart-getters-and-setters-1c8f

  Pessoas(this.primeiro_nome, this.ultimo_nome);

  String nome() {
    return this.primeiro_nome + ' ' + this.ultimo_nome;
  }
}

class Funcionario extends Pessoas {
  //extends os metodos da classe pai é opcional, no implements é obrigatorio ter os mesmos metodos
  double salario;

  Funcionario(String primeiro_nome, String ultimo_nome, this.salario)
      : super(primeiro_nome, ultimo_nome);

  void receberAumento(double valor) {
    this.salario += valor;
  }
}

void main() {
  var ana = Funcionario('Ana', 'Liberato', 15000.00);
  print(ana.nome());
  ana.receberAumento(27000.00);
}
