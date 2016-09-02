package com.reports.emergencyEventReports.components
{
	import com.reports.emergencyEventReports.components.events.ChartCheckBoxEvent;
	
	import flash.events.MouseEvent;
	
	import mx.charts.LegendItem;
	import mx.controls.CheckBox;
	import mx.controls.Label;
	import mx.controls.listClasses.*;

	public class legendRender extends LegendItem
	{

		public var checkbox:CheckBox = new CheckBox();
		private var obj:Object = new Object;
		private var labelName:String ='';
		private const NEGATIVE_COLOR:uint = 0xFF0000; // Red 
		public function legendRender() 
		{ 
			super(); 
			this.styleName = "ChineseFont"; 
			checkbox.id = "chartCheck";
			checkbox.x = 0;//-18
			checkbox.y = 10;
			checkbox.alpha = 1;
			checkbox.selected = true;
			checkbox.addEventListener(MouseEvent.CLICK,updateCheckStates);
			this.addChild(checkbox);
		} 
		private function updateCheckStates(event:MouseEvent):void
		{
			var obje:Object = new Object();
			obje.labelName = obj.displayName;
			obje.isSelected = checkbox.selected;
			this.dispatchEvent(new ChartCheckBoxEvent(obje,true));
		}
		override protected function updateDisplayList(unscaledWidth:Number, unscaledHeight:Number):void
		{
			super.updateDisplayList(unscaledWidth, unscaledHeight);
			obj = this.element;
			labelName = obj.displayName;
			var BOX_COLOR:uint = this.parentDocument.getLineColor(labelName);
			if(!(BOX_COLOR==9999999999)){
				checkbox.setStyle("fillColors",[BOX_COLOR,BOX_COLOR]);
				checkbox.setStyle("fillAlphas",[1.0, 1.0]);
			}
			this.marker.width = 0;
			this.marker.visible = false;
		}
	}
}
