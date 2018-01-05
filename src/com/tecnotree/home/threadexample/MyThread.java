package com.tecnotree.home.threadexample;

class MyThread extends Thread
{
	public void run() {
		for(int i=0; i <10; i++) {
			System.out.println("Executing Child thread and count is-->"+i);
		}
	}

}
