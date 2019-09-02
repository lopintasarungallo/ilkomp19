class fibonacci{
    public static void main(String[] args) {
        int n1=0, n2=1, n3;
        for(int i=0;i<10;i++){
            n3=n1+n2;
            if(i==0){
                System.out.print(n1+" ");
            }
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}