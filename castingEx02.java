public class castingEx02 {
    public static void main(String[] args) {
        //강제형변환 : 더 작은 범위를 나타내는 데이터 형
        // 데이터 손실 가능성 있음, 형 변환 연산자를 사용해야 에러 안남
        int a = 128;
        byte b = (byte)a;
        System.out.println(b);

    }
}
