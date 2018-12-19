public class CodeWordChecker
{
    private int min;
    private int max;
    private String strN;

    public CodeWordChecker(int min, int max, String strN)
    {
        this.min = min;
        this.max = max;
        this.strN = strN;
    }

    public CodeWordChecker(String strN)
    {
        min = 6;
        max = 20;
        this.strN = strN;
    }

    public boolean isValid(String str)
    {
        if(str.length()<min || str.length()>max || str.contains(strN))
        {
            return false;
        }
        return true;
    }
}
