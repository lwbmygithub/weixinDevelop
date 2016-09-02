package com.addrList.checkBox
{
	import flash.events.Event;

	public class AddrPeopleEvents extends Event
	{
		public var checkBoxEvePoints:Object;

		function AddrPeopleEvents(_data:Object,_bubble:Boolean):void
		{
			checkBoxEvePoints=_data;

			super("addrPeoplePoint",_bubble);
		}
	}
}