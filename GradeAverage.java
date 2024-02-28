public class GradeAverage {

	private int [] scores;
	
	public GradeAverage(int [] s)
	{
		scores = s;
	}
	// returns the mean (average) of the values in the scores array
	// whose indexes are between first and last (including first and last).  
	//You may assume that first and last are >= 0 and < scores.length
	private double mean(int first, int last)
	{
           double avg = 0;
		 for ( int i= first; i <= last; i++){
          avg +=  scores[i];
        }
        avg = avg/(last-first + 1);
        return avg;

        // return 0.0;    // replace this
	}
	
	// returns true if each successive value in scores is greater than
	// or equal to the previous value.  Otherwise returns false
	private boolean showsImprovement()
	{
        for (int i= 0; i< scores.length-1 ;i++){
            if (scores[i+1] < scores[i]){
                return false;
            }

        }
        return true;
		// return false;   // replace this
	}
	
	// if the values in the scores array show improvement, returns the
	// average of the elements in scores with indexes greater than or
	// equal to scores.length()/2
	public double finalGrade()
	{
		boolean x = showsImprovement();
		if (x ==true){
		return mean(scores.length/2, scores.length-1);
		}
		return mean(0, scores.length-1);
	}
		// return 0.0;   // replace this

	public static void main(String[] args) {
		int [] s1 = {50,50,20,80,53};   // not improved, finalGrade is 50.6
		int [] s2 = {20,50,50,53,80};   // improved, final grade is 61.0
		int [] s3 = {20,50,50,85};      // improved, final grade is 67.5
		int [] s4 = {35, 50, 45, 60,62};  // not improved, finalGrade is 50.4
		int [] s5 = {47, 58, 58, 66, 87, 90,90,90};  // improved, final grade is 89.25
		
		GradeAverage sr1 = new GradeAverage(s1);
		System.out.println("1: ");
		System.out.println(sr1.mean(1,3));
		System.out.println(sr1.showsImprovement());
		System.out.println(sr1.finalGrade());

		GradeAverage sr2 = new GradeAverage(s2);
		System.out.println("2: ");
		System.out.println(sr2.mean(2,4));
		System.out.println(sr2.showsImprovement());
		System.out.println(sr2.finalGrade());

		GradeAverage sr3 = new GradeAverage(s3);
		System.out.println("3: ");
		System.out.println(sr3.mean(0,2));
		System.out.println(sr3.showsImprovement());
		System.out.println(sr3.finalGrade());

		GradeAverage sr4 = new GradeAverage(s4);
		System.out.println("4: ");
		System.out.println(sr4.showsImprovement());
		System.out.println(sr4.finalGrade());

		GradeAverage sr5 = new GradeAverage(s5);
		System.out.println("5: ");
		System.out.println(sr5.showsImprovement());
		System.out.println(sr5.finalGrade());		
	}

}