package com.addrList.components
{
	import flash.events.Event;
	
	public class CommonEvent extends Event
	{
		//voiceCall
//		public static const VOICES_STATUS:String="voicesStatus";
		public static const FAX_NUMS:String="faxNums";
		public static const FAX_REGISTERED:String="faxRegister";
		public static const VOICE_TOPIC_REGISTERED:String="voiceTopicRegister";
		public static const VOICE_TOPIC:String="voiceTopic";
		public static const VOICE_NUMS:String="voiceNums";
		public static const TOPIC_SELECT:String="voiceSelect";
//		public static const VOICE_REG_FROM:String="voiceRegFrom";
		public static const MINI_VOICE_BAR:String="miniVoiceBar";
		public static const MAX_VOICE_BAR:String="maxVoiceBar";
		public static const ON_LINE_STATUS_CHANGE:String="onLineStatusChange";
		public static const PEOPLE_BAR_INI:String="peopleBarIni";
		public static const ZOOM_EFFECT:String="zoomEffect";
		public static const EXECUTE_STEP:String="executeStep";
		public static const AUTO_EXECUTE_STEP:String="autoExecuteStep";
		public static const ASYN_AUTO_EXECUTE:String="asynAutoExecute";
		public static const REF_BTN_MARK:String="refBtnMark";
		
		public function CommonEvent(type:String, bubbles:Boolean=false, cancelable:Boolean=false, data:Object=null)
		{
			if (data != null)
				_data=data;
			super(type, bubbles, cancelable);
		}
		private var _data:Object;

		/**
		 * The data will be passed via the event. It allows even dispatcher publishes
		 * data to event listener(s).
		 */
		public function get data():Object
		{
			return _data;
		}

		/**
		 * @private
		 */
		public function set data(data:Object):void
		{
			_data=data;
		}

	}
}