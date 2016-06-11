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
 * @data: 2016/01/14
 * 
 * This source code is intended for educational and illustrative purposes only
 * and is provided AS-IS without warranty of any kind.
 * 
 */
package com.kediumm.jstocks.controller.core;

import java.util.List;

import com.kediumm.jstocks.controller.prefs.CoinsEM;
import com.kediumm.jstocks.model.GBCE;



public class ViewData {
	
	public ViewData() {}

	/**
	 * 
	 * <!-- begin-user-doc -->
	 * View all GBCE Data
	 * <!-- end-user-doc -->
	 * 
	 * @see 
	 * @param the new value of the '<em>List<GBCE> lstGBCE</em>' attribute.
	 * @model 
	 * @generated
	 * @return 
	 * @throws
	 */
	public void viewGBCE_Data(List<GBCE> lstGBCE) {
		
		//GBCE objGBCE = new GBCE();
		
		try {
			
			if ( lstGBCE.isEmpty() ) {
				
				System.out.println("Database is Empty!!");
			
			} else {
				
				
				
				System.out.println("Sample data from the Global Beverage Corporation Exchange");
				System.out.println("-----------------------------------------------------------------------------------");
				System.out.println("|| Stock Symbol | Type | Last Dividend | Fixed Dividend | Par Value ");
				
				//for (int i=0; i < lstGBCE.size(); i++) {
				for (GBCE objGBCE : lstGBCE ) {
				
					//objGBCE = lstGBCE.get(i);
					System.out.println("|| " + objGBCE.getStk_symbol() + " | " + objGBCE.getStk_type() + " | " + objGBCE.getStk_last_dividend() + CoinsEM.GBP.getValue() + " | " + 
										objGBCE.getStk_fixed_dividend() + "%" + " | " + objGBCE.getStk_value() + CoinsEM.GBP.getValue() );
				
				}
				
			}
			
		} catch (Exception e) {
			
			System.out.println(e);
			
		}
		
		
		
	}
	
}
