package problems.FoodKart.Util;
import problems.FoodKart.Models.RestoRating;
import java.util.Comparator;

public class SortByHighestRate implements Comparator<RestoRating> {
    @Override
    public int compare(RestoRating r1, RestoRating r2){
        return r2.getRating()- r1.getRating();
    }
}
