public class arrayEx02 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10}; //배열 생성
        for (int i = 0; i < a.length; i++){ // a의 배열의 길이 만큼 돌린다.
            System.out.println("a["+ i +"] = " + a[i]);
        }
    }
}
