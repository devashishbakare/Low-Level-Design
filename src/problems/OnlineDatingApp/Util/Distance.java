package problems.OnlineDatingApp.Util;

public class Distance {
    //here we need to write logic to return the distance between to points.
    public int distance(int l1,int l2)
    {
        return (int)Math.sqrt((l1 - l2)*(l1 - l2) + (l1- l2)*(l1- l2));
    }

}
