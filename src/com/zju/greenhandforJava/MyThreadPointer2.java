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
			synchronized (lock1) // ����ĳ�this��ֻ���һ��A B
			{
				System.out.println(name);
				lock1.notify();
				try {
					lock1.wait();
					// System.out.println("wait֮��δִ�е����"+name);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}// �����

			}
		}
	}

	public static void main(String[] args) throws Exception {
		Object a = new Object();
		MyThreadPointer2 pa = new MyThreadPointer2("A", a);
		MyThreadPointer2 pb = new MyThreadPointer2("B", a);

		Thread t1 = new Thread(pa); // ����Thread����
		Thread t2 = new Thread(pb);

		t1.start();
		t2.start();
	}
}