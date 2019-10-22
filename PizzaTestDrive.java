class PizzaTestDrive{
	public static void main(String args[]){
		Cheesepizza c=new Cheesepizza();
		c.bake();
		c.addcheese();
		c.cut();
		c.pack();
		Cornpizza p=new Cornpizza();
		p.bake();
		p.addcorn();
		p.cut();
		p.pack();
		Thincrustcheesepizza t=new Thincrustcheesepizza();
		t.bake();
		t.tccp();
		t.cut();
		t.pack();
	}
}
