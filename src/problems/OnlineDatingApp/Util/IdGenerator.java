package problems.OnlineDatingApp.Util;

public class IdGenerator {

    private static int id = 0;

    public static int getId() {
        id++;
        return id;
    }
}
