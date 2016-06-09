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
package com.kediumm.jstocks;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;

import com.kediumm.jstocks.controller.core.GBCEData;
import com.kediumm.jstocks.controller.prefs.CoinsEM;
import com.kediumm.jstocks.model.GBCE;


/**
 * Simple test.
 * Testing if create Data
 */
public class AppTest extends TestNG
{
	
    
	@Test
	public void testGBCE_Data() {
		
		GBCE objGBCE = new GBCE();
		
		List<GBCE> lstGBCE = new ArrayList<GBCE>();
		//lstGBCE = data.getLstGBCE();
		lstGBCE = GBCEData.getInstance().getLstGBCE();
		
		Assert.assertNotNull( lstGBCE );
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("|| Stock Symbol | Type | Last Dividend | Fixed Dividend | Par Value ");
		for (int i=0; i < lstGBCE.size(); i++) {
			
			objGBCE = lstGBCE.get(i);
			
			System.out.println("|| " + objGBCE.getStk_symbol() + " | " + objGBCE.getStk_type() + " | " + objGBCE.getStk_last_dividend() + CoinsEM.GBP.getValue() + " | " + 
					objGBCE.getStk_fixed_dividend() + "%" + " | " + objGBCE.getStk_value() + CoinsEM.GBP.getValue() );
			
		}
		
	}
    
}
