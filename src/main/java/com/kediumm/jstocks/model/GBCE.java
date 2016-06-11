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
package com.kediumm.jstocks.model;


public class GBCE {
	
	private String stk_symbol;
	private String stk_type;
	private double stk_last_dividend;
	private double stk_fixed_dividend;
	private double stk_value;
	
	private double stk_price;
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	public GBCE() {
		
	}
	
	public GBCE(String stk_symbol, String stk_type, double stk_last_dividend, double stk_fixed_dividend, double stk_value) {
		
		this.stk_symbol = stk_symbol;
		this.stk_type = stk_type;
		this.stk_last_dividend = stk_last_dividend;
		this.stk_fixed_dividend = stk_fixed_dividend;
		this.stk_value = stk_value;
	}
	
	public GBCE(String stk_symbol, String stk_type, double stk_last_dividend, double stk_fixed_dividend, double stk_value,
				double stk_price) {
		
		this.stk_symbol = stk_symbol;
		this.stk_type = stk_type;
		this.stk_last_dividend = stk_last_dividend;
		this.stk_fixed_dividend = stk_fixed_dividend;
		this.stk_value = stk_value;
		this.stk_price = stk_price;
	}

	/**
	 * @return the stk_symbol
	 */
	public String getStk_symbol() {
		return stk_symbol;
	}

	/**
	 * @param stk_symbol the stk_symbol to set
	 */
	public void setStk_symbol(String stk_symbol) {
		this.stk_symbol = stk_symbol;
	}

	/**
	 * @return the stk_type
	 */
	public String getStk_type() {
		return stk_type;
	}

	/**
	 * @param stk_type the stk_type to set
	 */
	public void setStk_type(String stk_type) {
		this.stk_type = stk_type;
	}

	/**
	 * @return the stk_last_dividend
	 */
	public double getStk_last_dividend() {
		return stk_last_dividend;
	}

	/**
	 * @param stk_last_dividend the stk_last_dividend to set
	 */
	public void setStk_last_dividend(double stk_last_dividend) {
		this.stk_last_dividend = stk_last_dividend;
	}

	/**
	 * @return the stk_fixed_dividend
	 */
	public double getStk_fixed_dividend() {
		return stk_fixed_dividend;
	}

	/**
	 * @param stk_fixed_dividend the stk_fixed_dividend to set
	 */
	public void setStk_fixed_dividend(double stk_fixed_dividend) {
		this.stk_fixed_dividend = stk_fixed_dividend;
	}

	/**
	 * @return the stk_value
	 */
	public double getStk_value() {
		return stk_value;
	}

	/**
	 * @param stk_value the stk_value to set
	 */
	public void setStk_value(double stk_value) {
		this.stk_value = stk_value;
	}

	/**
	 * @return the stk_price
	 */
	public double getStk_price() {
		return stk_price;
	}

	/**
	 * @param stk_price the stk_price to set
	 */
	public void setStk_price(double stk_price) {
		this.stk_price = stk_price;
	}
	
	

}
