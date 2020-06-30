package com.company.options;
import com.company.Human;
public class Fifth
{
    public static void fifth(Human[] humans)
    {
        System.out.println("Customers available for You:");
        for (Human human : humans)
        {
            System.out.println(human);
        }
    }
}
