package com.addrList.components
{
    
  import flash.display.GradientType;
  import flash.geom.Matrix;
  
  import ilog.orgchart.OrgChartItemRendererBorder;
  
  import mx.core.EdgeMetrics;
  import mx.utils.ColorUtil;
  import mx.utils.GraphicsUtil;
  
  /**
   * This subclass of OrgChartItemRendererBorder use a gradient to render the background.
   */ 
  public class OrgChartGradientBorder extends OrgChartItemRendererBorder {
    
    override protected function drawBackground(color:uint, radius:Number, width:Number, height:Number):void {
      
          
      var fillColors:Array;
      var fillColors2:Array;
      
      switch (name) {
        case "selectedSkin":
        case "selectedOverSkin":
          fillColors = [0xCEDBEA, 0x52637E];
          fillColors2 = [0x121417, 0x173146];
          filters = null;
          break;       
        case "overSkin":
        default:
          fillColors = [0xBABABA, 0x4F5050];
          fillColors2 = [0x0C0D0D, 0x282828];
          filters = null;
          break;      
      }
      
      var bm:EdgeMetrics = borderMetrics;
      var w:Number = width - (bm.left + bm.right);
      var h:Number = (height - (bm.top + bm.bottom))/2;
      
      var matrix:Matrix = verticalGradientMatrix(bm.left, bm.top, w, h);      
      
      graphics.beginGradientFill(GradientType.LINEAR, fillColors, [1.0, 1.0], [0, 0xFF], matrix);
      
      if (radius == 0 )  {                            
        graphics.drawRect(bm.left, bm.top, w, h);                                        
      } else {                           
        GraphicsUtil.drawRoundRectComplex(graphics,
								   bm.left, bm.top, w, h,
								   radius, radius, 0, 0);    
				                    
      }
      graphics.endFill();
                 
      matrix = verticalGradientMatrix(bm.left, bm.top+h, w, h);
      
      graphics.beginGradientFill(GradientType.LINEAR, fillColors2, [1.0, 1.0], [0, 0xFF], matrix);
      
      if (radius == 0 )  {                            
        graphics.drawRect(bm.left, bm.top+h, w, h);                                       
      } else {                           
        GraphicsUtil.drawRoundRectComplex(graphics,
								   bm.left, bm.top+h, w, h,
								   0, 0, radius, radius);    			      
      }
      graphics.endFill();
      
      if (name.toLowerCase().indexOf("over") != -1) {
        fillColors = [0xFF0000, 0x96E8FF, 0x2C3446];
        matrix = new Matrix();
        matrix.createGradientBox(w, 2*h, 0, 0, height-h/2);
        graphics.beginGradientFill(GradientType.RADIAL, fillColors, [1.0, 0.7, 0.5], [0, 127, 255], matrix);
        graphics.moveTo(radius, height-bm.bottom);
        graphics.curveTo(width/2, h, width-radius, height-bm.bottom);
        graphics.moveTo(radius, height-bm.bottom);        
        graphics.endFill();
               
      }
    }
  }
}