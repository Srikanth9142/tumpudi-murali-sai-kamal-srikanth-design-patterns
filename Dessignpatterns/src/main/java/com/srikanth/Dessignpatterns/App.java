package com.srikanth.Dessignpatterns;

import AdapterPatterns.DriverAdapter;
import BridgePatterns.DriverBridge;
import CommandPattern.DriverCommand;
import PrototypePatterns.DriverPrototype;
import SingletonPatterns.DriverSingleton;
import TemplatePatterns.DriverTemplate;

public class App 
{
	@SuppressWarnings("unused")

    public static void main( String[] args )
    {
    	DriverAdapter driveradapter  = new DriverAdapter();
        DriverBridge driverbridge = new DriverBridge();
        DriverCommand drivercommand = new DriverCommand();
        DriverPrototype driverprototype = new DriverPrototype();
        DriverSingleton driversingleton = new DriverSingleton();
        DriverTemplate drivertemplate = new DriverTemplate();
    }
}
