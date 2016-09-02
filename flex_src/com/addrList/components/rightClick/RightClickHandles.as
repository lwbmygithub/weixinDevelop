package com.addrList.components.rightClick
{
	import flash.display.DisplayObjectContainer;
	import flash.events.MouseEvent;
	import flash.geom.Point;
	
	import mx.controls.Menu;
	import mx.core.UIComponent;
	import mx.events.MenuEvent;

	public class RightClickHandles
	{
		private var menu:Menu;
		private static var _instance:RightClickHandles=null;
		public function RightClickHandles(privateClass:PrivateClass){}
		public static function getInstance():RightClickHandles{
			if(_instance==null){
				_instance=new RightClickHandles(new PrivateClass);
			}
			return _instance;
		}
		/**
		 * @param target 监听右键事件的对象
		 * @param items 右键点击时出现的上下文菜单
		 * @param handle 右键上下文菜单点击后回调事件
		 * **/
		public function setHandleFunction(target:UIComponent, items:Array,handle:Function):void
		{
			target.addEventListener(RightClickManager.RIGHT_CLICK, function c(event:MouseEvent):void{
					var _items:Array=RightClickMenuData.Top_MIS.concat(items).concat(RightClickMenuData.Bottom_MIS);
					rightClickHandler(event,_items,handle);
			});
		}
		protected  function rightClickHandler(event:MouseEvent,items:Array,handle:Function):void
		{
			removeMenu(handle);

			menu=new Menu();
			menu=Menu.createMenu(event.target as DisplayObjectContainer, items, false);

			menu.labelField="label"
			menu.variableRowHeight=true;
			menu.addEventListener(MenuEvent.ITEM_CLICK, function c(event:MenuEvent):void{handle(event.item);});        

			var point:Point=new Point(event.localX, event.localY);
			point=event.target.localToGlobal(point);
			menu.show(point.x, point.y);
		}
		private function removeMenu(handle:Function):void
		{
			if (menu != null)
			{
				try{
					menu.hide();
				}catch(err:Error){}
				try{
					menu.removeEventListener(MenuEvent.ITEM_CLICK, function c(event:MenuEvent):void{handle(event.item);});   
				}catch(err:Error){}
				menu=null;
			}
		}
	}
}
class PrivateClass{}