# 숫자 계산기
전달하는 문자를 구분자로 분리한 후 각 숫자의 합을 구해 반환. <br>

## 조건 사항
1. "," 또는 ":" 구분자를 기준으로 숫자를 분리하여, 각 숫자의 합을 반환한다.
2. 커스텀 구분자를 지정가능하다 "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
3. 음수를 전달하는 경우 Runtime Exception으로 에외처리한다.

## 기능

### 1. 구분자
1. 입력된 문자에 "," 또는 ":"가 포함되는지 확인한다.
2. 커스텀 구분자의 유무를 확인한다. ("//"와 "\n")
3. 확인된 구분자를 spliter로 설정한다.

### 2. 문자열 분리하기
1. 지정된 spliter를 이용해, 입력받은 문자열을 분리한다.
2. 숫자가 아닌 문자열이 입력된 경우 예외처리한다.

### 3. 더하기
1. 문자열의 숫자 더하기

### 4. 입, 출력
1. 입력받은 값을 전달한다.
2. 전달받은 값을 출력한다.

## Test
1-1. 구분자가 적절하게 설정되었는지 확인 <br>
1-2. 커스텀 구분자를 인식했는지 확인

2-1. 문자열이 잘 분리되었는지 확인 <br>
2-2. 숫자가 아닌 문자열의 예외처리 확인 <br>

3-1. 더해진 값이 옳은 값인지 확인