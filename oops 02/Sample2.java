package oops;

public class Sample2 {
public void m1(Parent p)
{
	p.display();
}

public void m1(Child c)
{
	c.display2();
}

public static void main(String[] args) {
	Sample2 s= new Sample2();
	Parent p = new Parent();
	Child c = new Child();
	Parent pc = new Child();
	//s.m1(p);
	//s.m1(c);
	s.m1(pc);
}

}
