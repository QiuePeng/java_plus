package com.paul.wh5;

public class Test {

	public static void main(String[] args) {
		
		Staff s = new Staff();
		s.setName("Tom");
		s.setSex("男");
		s.setHiredate("1999-10-27");
		s.setPhone("0963-913-773");
		s.setEmail("paul0963913773@gmail.com");
		s.setSalary(30000);
		s.setLunch(2400);
		s.getMonthSalary();
		
		Temporary t = new Temporary();
		t.setName("Jescia");
		t.setSex("女");
		t.setHiredate("2000-1-14");
		t.setPhone("0933-333-333");
		t.setEmail("paul0933333333@gmail.com");
		t.setTimes(100);
		t.getMonthSalary();
		
		Salesman sm = new Salesman();
		sm.setName("Justin");
		sm.setSex("男");
		sm.setHiredate("2022-10-14");
		sm.setPhone("0933-333-2222");
		sm.setEmail("paul0933332222@gmail.com");
		sm.setSalary(40000);
		sm.setSalesbonus(5000);
		sm.setLunch(2400);
		sm.getMonthSalary();
		
		Manager m = new Manager();
		m.setName("QIuPeng");
		m.setSex("男");
		m.setHiredate("1999-10-27");
		m.setPhone("0963-913-773");
		m.setEmail("paul0963913773@gmail.com");
		m.setSalary(80000);
		m.setBonus(10000);
		m.setLunch(2400);
		m.setTransport(3000);
		m.getMonthSalary();		

	}

}
