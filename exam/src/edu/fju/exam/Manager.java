package edu.fju.exam;

public class Manager extends Employee {
    int i=40000;
    String e="Eddie";
    int n=47000;
    String b="Andy";
	public Manager(String j, int a) {
		super(j, a);
		this.i=i;
		this.e=e;
		this.n=n;
		this.b=b;
	}

	@Override
	public void print(){
		System.out.println("Eddie"+" "+(i+5000));
		System.out.println("Andy"+" "+(n+5000));
	}

}
