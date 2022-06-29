import 'dart:html';

void click(String seletor) {
  Element link = querySelector(seletor);

  link.onClick.listen(printConsole);
}

void printConsole(Event e) {
  e.preventDefault();
  print('clicou');
}

//instalar no terminal
//pub global activate webdev
//dart2js -o script.js script.dart