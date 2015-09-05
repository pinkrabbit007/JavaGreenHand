package com.zju.greenhandforJava;
public class MyThreadPointer1 implements Runnable {

	private String name;
	private Object lock1;
	private Object lock2;
	private Object lock3;

	private MyThreadPointer1(String name, Object lock1, Object lock2,
			Object lock3) {
		this.name = name;
		this.lock1 = lock1;
		this.lock2 = lock2;
		this.lock3 = lock3;
	}

	/*
	 * public void run() { synchronized (prev) { synchronized (self) {
	 * System.out.println(name + " will notify  "+self);
	 * System.out.println(name); self.notify(); } try { System.out.println(name
	 * + " will keep wait  "+prev.toString()); prev.wait(); } catch
	 * (InterruptedException e) { e.printStackTrace(); } } }
	 */

	public void run() {
		for (int i = 0; i < 10; i++) {
			// System.out.println(name + " run ");
			synchronized (lock3) {
				synchronized (lock2) {
					System.out.println(name);
					lock2.notify();
					try {
						lock1.wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		MyThreadPointer1 pa = new MyThreadPointer1("A", a, b, c);
		MyThreadPointer1 pb = new MyThreadPointer1("B", b, c, a);
		MyThreadPointer1 pc = new MyThreadPointer1("C", c, a, b);

		Thread t1 = new Thread(pa); // 定义Thread对象
		Thread t2 = new Thread(pb);
		Thread t3 = new Thread(pc);
		t1.start();
		// t2.sleep(100);t3.sleep(100);
		t2.start();
		t3.start();
	}
}