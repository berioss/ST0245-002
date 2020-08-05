public class mcd
{
    public static int MCD(int p, int q){
        if(q != 0)
            return MCD(q, p%q);
        else
            return p;
    }
}