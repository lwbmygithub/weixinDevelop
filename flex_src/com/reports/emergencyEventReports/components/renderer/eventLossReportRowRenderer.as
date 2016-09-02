package com.reports.emergencyEventReports.components.renderer
{
	import mx.controls.Label;
	
	public class eventLossReportRowRenderer extends Label
	{
		private const ALL_COUNT_COLOR:uint=0x5F04B4;//汇总
//		public function eventLossReportRowRenderer()
//		{
//		}
		override protected function updateDisplayList(unscaledWidth:Number, unscaledHeight:Number):void
		{
			super.updateDisplayList(unscaledWidth, unscaledHeight);	
			if (data != null)
			{
				setStyle("textAlign", 'center');
				if (this.data.hasOwnProperty("REALM") && this.data.REALM == '合计')
				{
//					this.setStyle("color", ALL_COUNT_COLOR);
					this.setStyle("fontWeight", 'bold');
				}	
				else if(this.data.hasOwnProperty("REALM") && this.data.REALM == "0"){
					this.visible = false;
				}
			}
		}
	}
}