package TemplatePatterns;

public class DriverTemplate {
	public DriverTemplate(){
		System.out.println();
		System.out.println("----- Template Pattern -----");
    	OrderProcess netOrder = new NetOrder(); 
        netOrder.processOrder(true); 
        System.out.println(); 
        OrderProcess storeOrder = new StoreOrder(); 
        storeOrder.processOrder(true); 
	}
}
