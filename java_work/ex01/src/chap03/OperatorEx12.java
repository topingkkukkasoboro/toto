package chap03;

class OperatorEx12 { 
      public static void main(String[] args) { 
            char c1 = 'a';        // char은 유니코드 값으로 바꾼다 그래서 97이 저장된다
            char c2 = c1;         // c1에 있는 값을 c2에 넣어라 그래서 97이 들어간다
            char c3 =' ';         // c3을 공백으로 저장한다

            int i = c1 + 1;       // c1이 유니코드로 97로 바뀌었으니 1을 더한 값을 i에 넣어라 98

            c3 = (char)(c1 + 1); //c1이 97인데 1을 더하면 98이다 그걸 다시 문자로 변경하면 b가 나온다
            c2++; //c2는 c1의 유니코드 값인 97이 들어갔다 거기서 먼저 1을 더해라 
            c2++; //c2는 c1의 유니코드 값인 97이 들어갔다 거기서 먼저 1을 더해라 

            System.out.println("i=" + i); 
            System.out.println("c2=" + c2);  // c2는 c1에 1을 두번 더했으니 99다 근데 문자로 되어 있으니 c다
            System.out.println("c3=" + c3); 
      } 
} 
