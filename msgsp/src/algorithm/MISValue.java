package algorithm;

import java.util.Comparator;

public class MISValue {

	private Integer itemNo; 
	private Float minItemSupport;
	private Float actualSupport = 0.0f; //Initialized to 0	
	private Integer supportCount = 0;

	public Integer getItemNo(){
	    return this.itemNo;
	}
	
	public void setitemNo(Integer value){	    
	     this.itemNo = value;
	}
	
	public Float getMinItemSupport(){
	    return this.minItemSupport;
	}
	
	public void setMinItemSupport(Float value){	    
	     this.minItemSupport = value;
	}
	
	public Float getActualSupport(){
	    return this.actualSupport;
	}
	
	public void setActualSupport(Float value){	    
	     this.actualSupport = value;
	}
	
	public Integer getSupportCount(){
	    return this.supportCount;
	}
	
	public void setSupportCount(Integer value){	    
	     this.supportCount = value;
	}
}
