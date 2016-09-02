package com.reports.emergencyEventReports.components.events
{
	import flash.events.Event;

	public class ChartCheckBoxEvent extends Event
	{
		public var checkBoxData:Object;
		
		public function ChartCheckBoxEvent(_data:Object, bubbles:Boolean=false, cancelable:Boolean=false)
		{
			checkBoxData = _data;
			super("ChartCheckBox",bubbles);
		}
		
	}
}