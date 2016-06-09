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
 * @data: 2016/01/15
 * 
 */
package com.kediumm.jstocks.model;

import java.time.ZonedDateTime;

public class StockTrade {
	
	private String st_symbol;
	private ZonedDateTime st_date; 
	private double st_quantity;
	private String st_sales;
	private double st_price;
	
	public StockTrade() {}
	
	public StockTrade(String st_symbol, ZonedDateTime st_date, double st_quantity, String st_sales, double st_price) {
	
		this.st_symbol = st_symbol;
		this.st_date = st_date;
		this.st_quantity = st_quantity;
		this.st_sales = st_sales;
		this.st_price = st_price;
	}
	
	/**
	 * @return the st_symbol
	 */
	public String getSt_symbol() {
		return st_symbol;
	}

	/**
	 * @param stk_symbol the st_symbol to set
	 */
	public void setSt_symbol(String st_symbol) {
		this.st_symbol = st_symbol;
	}
	
	/**
	 * @return the st_date
	 */
	public ZonedDateTime getSt_date() {
		return st_date;
	}

	/**
	 * @param zonedDateTime the st_date to set
	 */
	public void setSt_date(ZonedDateTime zonedDateTime) {
		this.st_date = zonedDateTime;
	}

	/**
	 * @return the st_quantity
	 */
	public double getSt_quantity() {
		return st_quantity;
	}

	/**
	 * @param st_quantity the st_quantity to set
	 */
	public void setSt_quantity(double st_quantity) {
		this.st_quantity = st_quantity;
	}

	/**
	 * @return the st_sales
	 */
	public String getSt_sales() {
		return st_sales;
	}

	/**
	 * @param st_sales the st_sales to set
	 */
	public void setSt_sales(String st_sales) {
		this.st_sales = st_sales;
	}

	/**
	 * @return the st_price
	 */
	public double getSt_price() {
		return st_price;
	}

	/**
	 * @param st_price the st_price to set
	 */
	public void setSt_price(double st_price) {
		this.st_price = st_price;
	}

}
