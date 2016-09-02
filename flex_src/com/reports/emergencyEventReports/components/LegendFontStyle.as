package com.reports.emergencyEventReports.components
{
	import mx.charts.LegendItem;

	public class LegendFontStyle extends LegendItem
	{
		public function LegendFontStyle()
		{
			super();
			this.styleName = "ChineseFont"; 
		}
		/**
		 * 修改图例名称 Mazole 2011-6-8
		 * */
		override protected function updateDisplayList(unscaledWidth:Number,
												  unscaledHeight:Number):void
		{
			super.updateDisplayList(unscaledWidth, unscaledHeight);
			if(this.label!=null){
				if(this.label.indexOf("_ETID@")!=-1 ){
			      		this.label = this.label.substring(0,this.label.indexOf("_ETID@"));
			      	}
			}
		}
		
	}
}