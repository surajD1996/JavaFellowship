/******************************************************************************
 *  Purpose	 	gives distinct coupon numbers
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	21-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class CouponNumbers 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter How Many Coupon Numbers You Want");
		int input = Utility.scanInt();
		int answer = 0;
		answer = Utility.couponNumbers(input);
		System.out.println("we need to generate "+answer+" numbers to generate "+input+" distinct Coupons");		
	}
}