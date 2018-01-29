package com.tecnotree.home.thread.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample
{
	public static void main(String[] args)
	{
		ReentrantLock reentrantLock = new ReentrantLock();
		reentrantLock.lock();
		System.out.println("lock count:: "+reentrantLock.getHoldCount());
		System.out.println("isLocked:: "+reentrantLock.isLocked());
		System.out.println("isHeldByCurrentThread:: "+reentrantLock.isHeldByCurrentThread());
		System.out.println("getQueueLength:: "+reentrantLock.getQueueLength());
		reentrantLock.lock();
		System.out.println("lock count:: "+reentrantLock.getHoldCount());
		reentrantLock.unlock();
		System.out.println("After Unlock the lock count:: "+reentrantLock.getHoldCount());
		System.out.println("isFair:: "+reentrantLock.isFair());
		
	}
}
