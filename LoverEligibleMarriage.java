class LoverEligibleMarriage
{
    public static void main (String[] args) 
    {
        int fAge=16;
        int mAge=19;
        if(fAge>=18 && mAge>=21)
        {
            System.out.println("both are eligible for marriage");
        }
        else
        {
            if (fAge>=18 && mAge<=21)
            {
                System.out.println("girl is eligible but boy is not eligible");
            }
            else
            {
                if(fAge<=18 && mAge>=21)
                {
                    System.out.println("boy is eligible but girl is not eligible");
                }
                else
                {
                    System.out.println("both are not eligible");
                }
            }
        }   
    }
}