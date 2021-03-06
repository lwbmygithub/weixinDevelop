package com.sunwah.baseapp.weixin.entity.Message.req;

/** 
 * 语音消息 
 *  
 * @author Caspar 
 *  
 */  
public class VoiceMessage extends BaseMessage {  
    /** 
     * 媒体ID 
     */  
    private String MediaId;  
    /** 
     * 语音格式 
     */  
    private String Format;  
  
    public String getMediaId() {  
        return MediaId;  
    }  
  
    public void setMediaId(String mediaId) {  
        MediaId = mediaId;  
    }  
  
    public String getFormat() {  
        return Format;  
    }  
  
    public void setFormat(String format) {  
        Format = format;  
    }  
  
}  