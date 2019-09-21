package com.bridgelabz.objectorientation;

public class InventryNew 
{
	Rice rice;
	Pulses pulses;
	Wheat wheat;
	public Rice getRice() {
		return rice;
	}
	public void setRice(Rice rice) {
		this.rice = rice;
	}
	public Pulses getPulses() {
		return pulses;
	}
	public void setPulses(Pulses pulses) {
		this.pulses = pulses;
	}
	public Wheat getWheat() {
		return wheat;
	}
	public void setWheat(Wheat wheat) {
		this.wheat = wheat;
	}
	@Override
	public String toString() {
		return "InventryNew [rice=" + rice + ", pulses=" + pulses + ", wheat=" + wheat + "]";
	}		
}
