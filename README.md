# BAEKJOON
<p>
  단계별로 풀어보기
</p>

<br>


  <h5> stage1 > stage1_11 
  
  
  ```
    1. (int)(Math.log10(A)+1) == 정수A의 길이
  ```

    

  <h5> stage3 > stage3_11
    
  ```
   1. BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    - 버퍼 사용 시 예외처리 : throws Exception
    
   2. StringTokenizer st; 
      st = new StringTokenizer(br.nextToken()); 
    - 띄어쓰기 기준으로 값을 입력받는다. ex) 11번 문제와 같이 st 여러 번 활용 가능
    주의) 여러 번 값을 받아오는 것인지, 한 번 받아오는 것인지 생각하기!! <반복문에 넣는가?> 
  ```

   <h5> stage3 > stage3_11
       
  ```
    1. StringBuilder명령어
  ```
    

   <h5> stage5 > stage5_6
     
  ```
    1. charAt : String타입으로 저장된 문자열을 한 글자만 선택해서 char타입으로 변환
     ex) arr[i].charAt(j)=='O'
  ```
    

   <h5> stage6
   - 문제 신중하게 
     
     
   <h5> stage7 > stage7_1
     
  ```
    1. BufferedReader는 String형태로 값을 받아오며 charAt으로 변환 후 int형으로 변환
  ```
     
   <h5> stage7 > stage7_2
     
  ```
    1. br.readLine() - 한줄 통째로 입력받는 방법 <String>
        br.read() - 값 읽어올때 int값으로 변형하여 읽어오는 방법
        ex) 1을 read하면 int형이 아닌 ASCII향식의 문자값 49를 읽어오는 것
  ```
     
   <h5> stage7 > stage7_3
     
  ```
    1. length사용!!
      charAt 문자열은 -'a'해주면 0부터 시작하는 값 가질수있다.
  ```
     
     
   <h5> stage7 > stage7_6
     
  ```
    1. st= new StringTokenizer(br.readLine()," ");
        System.out.println(st.countTokens()); //공백의 개수를 구한다
  ```
