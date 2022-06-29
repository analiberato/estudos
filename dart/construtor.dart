class Retangulo {
  num largura, altura;

  Retangulo(this.largura, this.altura);

  Retangulo.quadrado(num dimensao) : this(dimensao, dimensao);

  num area() {
    return this.largura * this.altura;
  }
}

void main() {
  Retangulo retangulo = new Retangulo(3, 4);
  print(retangulo.area());
}
