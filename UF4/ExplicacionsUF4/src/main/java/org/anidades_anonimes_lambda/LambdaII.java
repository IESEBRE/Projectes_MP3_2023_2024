package org.anidades_anonimes_lambda;

public class LambdaII {

    Qualsevol q=new Qualsevol(){
        @Override
        public Object tractaCadenes(String a, String b) {
            return a+b;
        }
    };

    Qualsevol q2=(a, b) -> {
        return b+a;
    };

    public void mostraNom(){
        System.out.println(q.getClass());
    }

    public static void main(String[] args) {
        LambdaII l=new LambdaII();
        l.mostraNom();

    }

}


interface Qualsevol{

    Object tractaCadenes(String a, String b);

}
