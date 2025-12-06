import java.util.concurrent.ThreadLocalRandom;
class GFG {
    public static int getRandomValue(int Min,int Max){
        return ThreadLocalRandom.current().nextInt(Min,Max+1);
    }

    public static void main(String[] args){
        int Min = 1,Max=100;

        System.out.println("Random value between:"+Min+" and "+Max+":"+getRandomValue(Min, Max));
    }
}
