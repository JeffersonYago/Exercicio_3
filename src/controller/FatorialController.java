package controller;
public class FatorialController {
public FatorialController() {
	super();	
	}
public int fatorial(int n) {
// se n for igual a 0 então retornará 1(encerrando a chamada da recursiva)
    if (n == 0)
      return 1;
        
// Para qualquer outro acima de 0, será calculado o seu valor multiplicado pelo seu antecessor
    return n * fatorial(n - 1);
  }
}
