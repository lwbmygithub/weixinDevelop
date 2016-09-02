package com.reports.emergencyEventReports.components
{
	import mx.containers.HBox;
	import mx.controls.Label;
	import mx.controls.listClasses.*;

	public class eventReportRowRenderer extends Label
	{

		private const ALL_COUNT_COLOR:uint=0x5F04B4;//汇总
		
		override protected function updateDisplayList(unscaledWidth:Number, unscaledHeight:Number):void
		{
			super.updateDisplayList(unscaledWidth, unscaledHeight);	
			if (data != null)
			{
				setStyle("textAlign", 'center');
				if (data.hasOwnProperty("REALM") && data.REALM == '全市')
				{
//					setStyle("color", ALL_COUNT_COLOR);
					setStyle("fontWeight", 'bold');
				}
				else if( this.data.hasOwnProperty("REALM") && this.data.REALM == " " ){
					this.visible = false;
				}
//				else if(this.data.hasOwnProperty("REALM_ID") ){
//					this.visible = false;
//				}
			}
		}
	}
}
