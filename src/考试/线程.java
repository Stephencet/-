package ����;

class MyThread extends Thread{
	public MyThread (String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println(this.getName()+"ִ�е�"+i+"��");
			try {
				sleep(1);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class �߳� {
	public static  void main(String []args) {
		MyThread t1=new MyThread("�߳�1");
		MyThread t2=new MyThread("�߳�2");
		t1.start();
		t2.start();
	}
}
