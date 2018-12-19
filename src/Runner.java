public class Runner
{
    public static void main(String[] args)
    {
        CodeWordChecker newChecker = new CodeWordChecker(1,20,"carrot");
        CodeWordChecker newChecker2 = new CodeWordChecker("dio");
        String str1 = "carrotcake";
        String str2 = "cake";
        String str3 = "kono dio da";
        System.out.println(newChecker.isValid("carrotcake"));
        System.out.println(newChecker.isValid("cake"));
        System.out.println(newChecker.isValid("kono dio da"));
    }
}
