package 考试;

class MyThread extends Thread{
	public MyThread (String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println(this.getName()+"执行第"+i+"次");
			try {
				sleep(1);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class 线程 {
	public static  void main(String []args) {
		MyThread t1=new MyThread("线程1");
		MyThread t2=new MyThread("线程2");
		t1.start();
		t2.start();
	}
}
