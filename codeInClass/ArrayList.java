c int a[];
    private int lastItem;
    public ArrayList(){
        this(10);
    }
    public ArrayList(int length){
        a = new int[length];
        lastItem = -1;
    }
    public int getLength(){
        return (lastItem + 1);
    }
    public void insert(int num){
        insertAt(num,lastItem+1);
    }
    public void insertAt(int num, int location){
        if ((lastItem + 1) == a.length ){
            extendList();
        }
        for(int i = lastItem; i >= location; i--){
            a[i+1] = a[i];
        }
        a[location] = num;
        lastItem++;
    }
    private void extendList(){
        int b[];
        b = new int[2*a.length];
        for (int i = 0; i <= lastItem; i++){
            b[i] = a[i];
        }
        a = b;
    }
    public int deleteAt(int location){
        int deleteNum = a[location];
        for (int i = location; i < lastItem; i++){
            a[i] = a[i+1];
        }
        // BUG
        a[lastItem] = 0;
        lastItem--;
        return deleteNum;
    }
    public boolean isEmpty(){
        return (lastItem == -1);
    }
    public void reverse(){
        int curr,i,j;
        i = 0;
        j = lastItem;
        while(i<j){
            curr = a[i];
            a[i] = a[j];
            a[j] = curr;
            // BUG
            i++;
            j--;
        }
    }
    public void sort(){
        int curr;
        for (int i = 1; i <= lastItem; i++){
            curr = a[i];
            for (int j = i-1; j >= 0; j--){
                if(a[j] > curr){
                    a[j+1] = a[j];
                    a[j] = curr;
                }
                else{
                    break;
                }
            }
        }
    }
}

