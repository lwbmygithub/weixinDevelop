package com.addrList.checkBox
{
	import flash.events.Event;

	public class CommonAddrPeopleEvents extends Event
	{
		public var checkBoxEvePoints:Object;

		function CommonAddrPeopleEvents(_data:Object,_bubble:Boolean):void
		{
			checkBoxEvePoints=_data;

			super("commonAddrPeoplePoint",_bubble);
		}
	}
}