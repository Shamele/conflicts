package org.err;

public class Employee {
	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<=10;i++) {
			
				Thread.sleep(300);
				try {
					System.out.println(10/0);
				}
				catch( Throwable e1){
					System.out.println("catch");
					
					
				}
				finally {
					System.out.println("final");
				}
				
			}
			
		}
	}

	
