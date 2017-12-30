/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Payable Interface
 *        
 */
package beam.example.domain.purchase;

public interface IPayable
{
	// calculate the payment of something
	double getTotalDue();
	
} /* END - Payable Interface */
