public class Clock{
	int hours;
	int minutes;
	int seconds;

	 public String toString(){
    	return hours +":"+ minutes + ":" + seconds;
    }

	public Clock(){
      hours=12;
	}

	public Clock(int hours,int minutes,int seconds){
		this.hours=hours;
		this.minutes=minutes;
		this.seconds=seconds;
    }
	public Clock(int seconds){
      if(seconds>59){
      	hours=seconds/3600;
      	minutes=seconds%3600/60;
      	this.seconds=seconds%3600%60;
      }
      else{
      	this.seconds=seconds;
      }
	}	
    public void setClock(int seconds){
    	if(seconds>59){
      	hours=seconds/3600;
      	minutes=seconds%3600/60;
      	this.seconds=seconds%3600%60;
      }
      else{
      	this.seconds=seconds;
      }
    }
    public void setHour(int hours){
        this.hours=hours;
    }
        
    public void setMinutes(int minutes){
      	this.minutes=minutes;
      }
    public void setSeconds(int seconds){
      	this.seconds=seconds;
      } 
    public int getHour(){
         return hours; 
    }
    
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
    	return seconds;
    }
    public void tick(){
    	 seconds=hours*3600+(minutes*60)+this.seconds+1;
       setClock(seconds);
    }     	
    public void tickDown(){
    	 seconds=hours*3600+(minutes*60)+this.seconds-1;
    	setClock(seconds);
    }
    public Clock addClock(Clock clock){
    	int second1=clock.hours*3600+(clock.minutes)*60+clock.seconds;
        int second2=this.hours*3600+(this.minutes)*60+this.seconds;
            return new Clock(second1 + second2);     
    }
    public Clock subtackClock(Clock clock){
    	int second1=clock.hours*3600+(clock.minutes)*60+clock.seconds;
        int second2=this.hours*3600+(this.minutes)*60+this.seconds;
            return new Clock(second2- second1);     
    }
   
}

