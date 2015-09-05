package com.zju.greenhandforJava;
public class MyThreadPointer2 implements Runnable {

	private String name;
	private Object lock1;

	private MyThreadPointer2(String name, Object obj) {
		this.name = name;
		lock1 = obj;
	}

	/*
	 * public void run() { synchronized (prev) { synchronized (self) {
	 * System.out.println(name + " will notify  "+self);
	 * System.out.println(name); self.notify(); } try { System.out.println(name
	 * + " will keep wait  "+prev.toString()); prev.wait(); } catch
	 * (InterruptedException e) { e.printStackTrace(); } } }
	 */

	public void run() {
		for (int i = 0; i < 3; i++) {
			synchronized (lock1) // 这里改成this就只输出一组A B
			{
				System.out.println(name);
				lock1.notify();
				try {
					lock1.wait();
					// System.out.println("wait之后还未执行的语句"+name);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}// 就这句

			}
		}
	}

	public static void main(String[] args) throws Exception {
		Object a = new Object();
		MyThreadPointer2 pa = new MyThreadPointer2("A", a);
		MyThreadPointer2 pb = new MyThreadPointer2("B", a);

		Thread t1 = new Thread(pa); // 定义Thread对象
		Thread t2 = new Thread(pb);

		t1.start();
		t2.start();
	}
}