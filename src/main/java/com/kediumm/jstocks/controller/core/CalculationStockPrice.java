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
 * This source code is intended for educational and illustrative purposes only
 * and is provided AS-IS without warranty of any kind.
 * 
 */
package com.kediumm.jstocks.controller.core;

import java.time.ZonedDateTime;
import java.util.List;

import com.kediumm.jstocks.controller.abstracts.Formula;
import com.kediumm.jstocks.model.GBCE;
import com.kediumm.jstocks.model.StockTrade;

public class CalculationStockPrice extends Formula{
	
	private double trade, value, quantity;
	private FormulaStockPrice form_stockprice = new FormulaStockPrice();
	
	
	public CalculationStockPrice() {}
	
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * Calculation Stock Price based on trades recordset
	 * <!-- end-user-doc -->
	 * 
	 * @see 
	 * @param the new value of the '<em>List<GBCE> lstGBCE</em>' attribute.
	 * @param the new value of the '<em>List<StockTrade> lstStockTrade</em>' attribute.
	 * @model 
	 * @generated
	 * @return 
	 * @throws
	 */
	public void calcStockPrice(List<GBCE> lstGBCE, List<StockTrade> lstStockTrade) {
		
		GBCE objGBCE = new GBCE();
		StockTrade objStockTrade = new StockTrade();
		
		System.out.println("Calculate the Stock Price");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("|| Stock Symbol | Type | Last Dividend | Fixed Dividend | Par Value | Stock Price");
		
		try {
			
			if (!lstStockTrade.isEmpty()) {
				
				for (int i=0; i < lstGBCE.size(); i++) {
					
					
					objGBCE = lstGBCE.get(i);
					
					for (int y=0; y < lstStockTrade.size(); y++) {
						
						objStockTrade = lstStockTrade.get(y);
					
						if ( objStockTrade.getSt_symbol().equals( objGBCE.getStk_symbol() ) ) {
						
							if (objStockTrade.getSt_date().isAfter(ZonedDateTime.now().minusMinutes(15))) {
							
								quantity = quantity + objStockTrade.getSt_quantity();
								
								
								trade = trade + getProduct(objStockTrade.getSt_price(), objStockTrade.getSt_quantity());
								
							}
							
						}
						
					}
					
					
					value = form_stockprice.getStockPrice(trade, quantity);
					
					System.out.println("|| " + objGBCE.getStk_symbol() + " | " + objGBCE.getStk_type() + " | " + objGBCE.getStk_last_dividend() + "GBP" + " | " +
							objGBCE.getStk_fixed_dividend() + "%" + " | " + objGBCE.getStk_value() + "GBP" + " | " + value + "GBP" );
					
					trade = 0;
					quantity = 0;
					value = 0;
				
				}
			
			} else {
				System.out.println(" No records!! ");
				
			}
			
			
		} catch (Exception ex) {
			
			System.out.println("UPPSSS ...  " + ex);
			
		}
		
		
		
	}

	
}
