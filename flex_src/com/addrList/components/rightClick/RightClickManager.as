package com.addrList.components.rightClick
{
	import flash.display.DisplayObject;
	import flash.events.MouseEvent;
	import flash.external.ExternalInterface;
	
	import mx.core.Application;
	
	public class RightClickManager
	{
		static private var rightClickTarget:DisplayObject;
        static public const RIGHT_CLICK:String = "rightClick";
        static private const javascript:XML = 
        <script>
        	<![CDATA[
				function(flashObjectId)
				{				
					var RightClick = {
						init: function (flashObjectId) {
							this.FlashObjectID = flashObjectId;
							this.Cache = this.FlashObjectID;
							if(window.addEventListener){
								 window.addEventListener("mousedown", this.onGeckoMouse(), true);
							} else {
								document.getElementById(this.FlashObjectID).parentNode.onmouseup = function() { document.getElementById(RightClick.FlashObjectID).parentNode.releaseCapture(); }
								document.oncontextmenu = function(){ if(window.event.srcElement.id == RightClick.FlashObjectID) { return false; } else { RightClick.Cache = "nan"; }}
								document.getElementById(this.FlashObjectID).parentNode.onmousedown = RightClick.onIEMouse;
							}
						},
						killEvents: function(eventObject) {
							if(eventObject) {
								if (eventObject.stopPropagation) eventObject.stopPropagation();
								if (eventObject.preventDefault) eventObject.preventDefault();
								if (eventObject.preventCapture) eventObject.preventCapture();
						   		if (eventObject.preventBubble) eventObject.preventBubble();
							}
						},
						onGeckoMouse: function(ev) {
						  	return function(ev) {
						    if (ev.button != 0) {
								RightClick.killEvents(ev);
								if(ev.target.id == RightClick.FlashObjectID && RightClick.Cache == RightClick.FlashObjectID) {
						    		RightClick.call();
								}
								RightClick.Cache = ev.target.id;
							}
						  }
						},
						onIEMouse: function() {
						  	if (event.button ==2||event.button==0) {
								if(window.event.srcElement.id == RightClick.FlashObjectID && RightClick.Cache == RightClick.FlashObjectID) {
									RightClick.call(); 
								}
								document.getElementById(RightClick.FlashObjectID).parentNode.setCapture();
								if(window.event.srcElement.id)
								RightClick.Cache = window.event.srcElement.id;
							}
						},
						call: function() {
							mainApp.rightClick();
						}
					}
					
					RightClick.init(flashObjectId);
				}
        	]]>
        </script>;

        public function RightClickManager()
        {
            return;
        }

        static public function regist() : Boolean
        {
            if (ExternalInterface.available)
            {
                ExternalInterface.call(javascript, ExternalInterface.objectID);
                ExternalInterface.addCallback("rightClick", dispatchRightClickEvent);
                Application.application.addEventListener(MouseEvent.MOUSE_OVER,mouseOverHandler);
            }// end if
            return true;
        }

        static private function mouseOverHandler(event:MouseEvent) : void
        {
			rightClickTarget = DisplayObject(event.target);
            return;
        }
        static private function dispatchRightClickEvent() : void
        {
			var event:MouseEvent;
            if (rightClickTarget != null)
            {	
            	voiceMeetingList(rightClickTarget.name);
                event = new MouseEvent(RIGHT_CLICK, true,false, rightClickTarget.mouseX, rightClickTarget.mouseY);
                rightClickTarget.dispatchEvent(event);
            }// end if
            return;
        }

	}
}