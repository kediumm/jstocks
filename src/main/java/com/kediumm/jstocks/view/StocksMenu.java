/**
 * Copyright 2016 Miguel Vale Teixeira
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author: Miguel Vale Teixeira
 * @data: 2016/01/13
 * 
 */
package com.kediumm.jstocks.view;

import java.util.ArrayList;
import java.util.List;

import com.kediumm.jstocks.controller.core.CalculationGBCE;
import com.kediumm.jstocks.controller.core.CalculationStock;
import com.kediumm.jstocks.controller.core.CalculationStockPrice;
import com.kediumm.jstocks.controller.core.GBCEData;
import com.kediumm.jstocks.controller.core.InsertRecTrade;
import com.kediumm.jstocks.controller.core.ReadData;
import com.kediumm.jstocks.controller.core.ViewData;
import com.kediumm.jstocks.model.GBCE;
import com.kediumm.jstocks.model.StockTrade;

public class StocksMenu {
	
	private static ViewData view_data  = new ViewData();
	private static CalculationStock calculation_stock = new CalculationStock();
	private static CalculationGBCE calculation_gbce = new CalculationGBCE();
	private static CalculationStockPrice calculation_stockprice = new CalculationStockPrice();
	private static InsertRecTrade record = new InsertRecTrade();
	private static List<GBCE> lstGBCE = new ArrayList<GBCE>();
	private static List<StockTrade> lstRecTrade = new ArrayList<StockTrade>();
	
	private static int option;
	private static double ticker_price;
	
	
	
	public StocksMenu() {
		
		lstGBCE = GBCEData.getInstance().getLstGBCE();
        menu();
		
	}
	
	 public static void menu() {
			
	    	System.out.println( "");
	    	System.out.println( "#######################################################################" );
	        System.out.println( "Super Simple Stocks" );        
	        System.out.println( "#######################################################################" );

	    	System.out.println( "1 - View Basic GBCE Data");
	        System.out.println( "2 - Dividend Yield");
	        System.out.println( "3 - P/E Ratio");
	        System.out.println( "4 - Record a trade");
	        System.out.println( "5 - View All Records");
	        System.out.println( "6 - View Stock Price");
	        System.out.println( "7 - Calculate GBCE");
	        System.out.println( "9 - Exit");
	        System.out.print("Chosse on option!");
	        option = ReadData.readInt();
	        
	        System.out.println("");
	        //System.out.println("choosing options: " + option);
	        menuOption(option);
	        
	    }
	    
	    public static void menuOption(int op) {
	    	
	    	switch (op) {
	    	case 1:  view_data.viewGBCE_Data(lstGBCE);
	    			 menu();
	        		 break;
	        		    
	        case 2:  getTickerPrice();
	        		 calculation_stock.calcDividendYield(lstGBCE, ticker_price);
	        		 menu();
	                 break;
	                 
	        case 3:  getTickerPrice();
	        		 calculation_stock.calcPERatio(lstGBCE, ticker_price);
	        		 menu();
	                 break;
	                 
	        case 4:  record.insertRecTrade(lstGBCE);
	                 lstRecTrade = record.getLstRecTrade();
			 		 menu();
			 		 break;
			 		 
	        case 5:  record.viewRecTrade();
					 menu();
					 break;	
			 
	        case 6:  calculation_stockprice.calcStockPrice(lstGBCE, lstRecTrade);
	        		 menu();
	                 break;
	        
	        case 7:  calculation_gbce.getGeometricMean(lstRecTrade);
	        		 menu();
	                 break;
	        
	        case 9:  System.out.println("Bye .... ");
	        		 System.exit(0);
	        		 break;
	        		 
	        default: System.out.println(">>>>> Wrong option. Choose another option!");
	        		 menu();
	                 break;
	    	}
	    	
	    }
	    
	    private static void tickerPrice() {
	    	
	    	System.out.print("Give me Ticker Price Value!");
			ticker_price = ReadData.readDouble();
			
	    }
	    
	    public static void getTickerPrice() {
	    	
	    	String str = "";
	    	
	    	if (ticker_price == 0.0) {
	    		
	    		tickerPrice();
	    		
	    	} else {
	    		
	    		System.out.println("Ticker Price Value is " + ticker_price );
	    		System.out.print("You Accept? (Y/n) " );
	    		
	    		str = ReadData.readString().toUpperCase();
	    		
	    		if (str.equals("N")) {
	    			
	    			tickerPrice();
	    		}
	    		
	    	}
	    	
	    }

}
