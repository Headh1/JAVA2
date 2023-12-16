package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }

    public void increment(){
        if(isCounterChk(count)) {
            count++;
        }else{
            System.out.println("최대값임");
        }
    }

    private boolean isCounterChk(int count){
        return count <= max;
    }

    public int getCount(){
        return count;
    }
}
