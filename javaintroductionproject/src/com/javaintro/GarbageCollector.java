package com.javaintro;

import com.mysql.cj.xdevapi.PreparableStatement.PreparableStatementFinalizer;

public class GarbageCollector {
	 @Override
	    protected void finalize() throws Throwable {
	        System.out.println("Finalize method called");
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("main method started");
         GarbageCollector obj2 = new GarbageCollector();
       
         obj2=null;
          
         
         System.gc();
         System.out.println("Mainmethod ended");
         
	}

}
