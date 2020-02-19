public class Main_03 {
    public static void main(String[] args) {

        // interface로 클래스를 선언하지 않고 필요할때 직접 클래스를 정의하여 사용하는 방법
        // 익명클래스 사용
        Myinter nameObj = new Myinter() {
            @Override
            public String name() {
                return "홍길동";
            }
        };

        String nameStr = nameObj.name();

        String nameStr1 = sub(new Myinter() {
            @Override
            public String name() {
                return "성춘향";
            }
        });

        /*
            java 1.8 이상에서 인터페이스를 익명클래스로 생성하는 lambda 방식
            () : method 식별자
            -> : method 본체를 가리키는 화살표 함수
            { } : 구현코드
         */
        String nameStr2 = s ub(()-> {
            return "이몽룡";
        });
    }

    public static String sub(Myinter inter){
        return inter.name();
    }

}
