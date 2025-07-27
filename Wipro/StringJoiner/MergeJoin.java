package Wipro.StringJoiner;

import java.util.StringJoiner;

public class MergeJoin {
    public static void main(String[] args) {
        StringJoiner sj1=new StringJoiner("-");
        sj1.add("chennai");
        sj1.add("madurai");
        StringJoiner sj2=new StringJoiner("-");
        sj2.add("trichy");
        sj2.add("kanchipuram");
        sj1.merge(sj2);
        System.out.println(sj1.toString());

    }
}
