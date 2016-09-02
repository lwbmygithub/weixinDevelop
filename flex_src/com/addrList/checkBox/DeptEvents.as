package com.addrList.checkBox
{
	import flash.events.Event;

	public class DeptEvents extends Event
	{
		public var checkBoxEvePoints:Object;

		function DeptEvents(_data:Object,_bubble:Boolean):void
		{
			checkBoxEvePoints=_data;

			super("deptPoint",_bubble);
		}
	}
}