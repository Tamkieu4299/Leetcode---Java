
public class Solution extends VersionControl {
	
	public int firstBadVersion(int n) {
        return recurse(0,n);
    }
    
    public int recurse(int start, int end){
    	
        if(start - end == -1) 
        	return end;
        
        int pointToMeasure = start + (end - start)/2;
        // what is the difference between pointToMeasure = 
		// (start+end)/2 || start - (end + start)/2
		// These two statements evaluate to the same thing I believe, but
			//my code was exceeding the time limit when I had pointToMeasure = (start + end)/2
        
        if(isBadVersion(pointToMeasure)){
            return recurse(start,pointToMeasure);
        }else{
            return recurse(pointToMeasure,end);
        }
    }
}
