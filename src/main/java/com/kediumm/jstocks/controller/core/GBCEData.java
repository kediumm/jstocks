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
package com.kediumm.jstocks.controller.core;

import java.util.ArrayList;
import java.util.List;

import com.kediumm.jstocks.model.GBCE;

public class GBCEData {
	
	private static GBCEData instance = new GBCEData();
	
	private List<GBCE> lstGBCE = new ArrayList<GBCE>();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	private GBCEData() {
		
		addGBCE_Data("TEA", "Common", (double) 0.00 , (double) 0.00, (double) 100.00);
		addGBCE_Data("POP", "Common", (double) 8.00 , (double) 0.00, (double) 100.00);
		addGBCE_Data("ALE", "Common", (double) 23.00 , (double) 0.00, (double) 60.00);
		addGBCE_Data("GIN", "Preferred", (double) 8.00 , (double) 2.00, (double) 100.00);
		addGBCE_Data("JOE", "Common", (double) 13.00 , (double) 0.00, (double) 250.00);
		
	}
	
	public static GBCEData getInstance() {
		
		return instance;
	}
	
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * Add data to List<GBCE>
	 * <!-- end-user-doc -->
	 * 
	 * @see 
	 * @param the new value of the '<em>String symbol</em>' attribute.
	 * @param the new value of the '<em>String type</em>' attribute.
	 * @param the new value of the '<em>double las_dividend</em>' attribute.
	 * @param the new value of the '<em>double fixed_dividend</em>' attribute.
	 * @param the new value of the '<em>double value</em>' attribute.
	 * @model 
	 * @generated
	 * @throws
	 */
	private void addGBCE_Data(String symbol, String type, double las_dividend, double fixed_dividend, double value) {
		
		GBCE objGBCE = new GBCE();
		
		objGBCE.setStk_symbol(symbol);
		objGBCE.setStk_type(type);
		objGBCE.setStk_last_dividend(las_dividend);
		objGBCE.setStk_fixed_dividend(fixed_dividend);
		objGBCE.setStk_value(value);
		lstGBCE.add(objGBCE);
		
	}

	
	

	/**
	 * @return the lstGBCE
	 */
	public List<GBCE> getLstGBCE() {
		return lstGBCE;
	}

	/**
	 * @param lstGBCE the lstGBCE to set
	 */
	public void setLstGBCE(List<GBCE> lstGBCE) {
		this.lstGBCE = lstGBCE;
	}
	
	

}
