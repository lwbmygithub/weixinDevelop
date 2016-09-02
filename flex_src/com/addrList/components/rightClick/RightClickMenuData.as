package com.addrList.components.rightClick
{
	public class RightClickMenuData
	{
		/**顶部固定菜单选项**/
		public static var Top_MIS:Array=[{label:"中恒信-投资社区",enabled:false},
										{type:"separator"}];
		/**底部固定菜单选项**/
		public static var Bottom_MIS:Array=[{type:"separator"},
										  {label:"当期版本:Beta 0610",action:"",enabled:false},
										  {label:"关于我们:中恒信",action:"",enabled:false}];
		
		/**主界面 右键菜单内容**/
		public static var Main_MIS:Array=[{label:"当前位置:主题图界面",action:"Main App"}];
		/**买入界面 右键菜单内容**/
		public static var Buy_MIS:Array=[{label:"当前位置:买入操作界面",action:"buy infomation"}];
		/**卖出界面 右键菜单内容**/
		public static var Sell_MIS:Array=[{label:"当前位置:卖出操作界面",action:"sell infomation"}];
		
		
	}
}