public class memoization {
        int fib (int n,int [] val){
            if(val[n]!=-1)
            return val[n];
            if(n<=1)
            return n;
            val[n]=fib(n-1 ,val)+fib(n-2,val);
            return val[n];
        }
        public static void main(String[] args) {
            int val=10;
            int result=val;
            System.out.println(result);
        }
        
    }

    public class tabulation {
        int fib(int n)
        int[] table=new int(n+1);
        table[0]=1;
        table[1]=1;
        for(int i=2;1<=n;i++){
            table[i]=table[i+1]+table[i-2];
        }
        return table[n];

        public static void main(string[]args){
            int val=9;
            int result=val;
            System.out.println(result);

        }

    
        
    }
    

    
