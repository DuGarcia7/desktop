package model;

public class ObjetoABC implements InterfaceA, InterfaceB, InterfaceC {

	@Override
	public void metodoC1() {
		System.out.println("Metodo C1 executado!");		
	}

	@Override
	public void metodoC2() {
		System.out.println("Metodo c2 executado!");		
	}

	@Override
	public void metodoB1() {
		System.out.println("Metodo B1 executado!");		
	}

	@Override
	public void metodoB2() {
		System.out.println("Metodo B2 executado!");		
	}

	@Override
	public void metodoA1() {
		System.out.println("Metodo A1 executado!");
	}

	@Override
	public void metodoA2() {
		System.out.println("Metodo A2 executado!");
	}
	

}
