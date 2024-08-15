# 두 자연수 A와 B에 대해서, 
# A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 
# 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 
# 예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 
# 최소 공배수는 30이다.
# 두 자연수 A와 B가 주어졌을 때, 
# A와 B의 최소공배수를 구하는 프로그램을 작성하시오.

import sys

t = int(input())

# 반복문을 통해서 모든 수를 다 찾아봄
# for i in range(t):
#     a, b = map(int, sys.stdin.readline().split())
#     # 최소공배수(LCM)
#     lcm = 0

#     # lcm를 1씩 늘려가면서 lcm가 a와 b로 모두 나누어질 때 break
#     while(True):  
#         lcm += 1
#         if(lcm%a==0 and lcm%b==0):
#             print(lcm)
#             break

# 위 방법대로 하면 시간초과가 남
# 시간을 단축하기 위해서는 연산 횟수를 최소화 해야함
# 유클리드 호제법 이용
# 두 수 x, y가 있을 때, 
# 최대공약수(GCD)는 `y`와 `x % y`의 GCD와 같다.
# 따라서 최소공배수(LCM)은 x*y/GCD(x, y)가 된다.
for i in range(t):
    a, b = map(int, sys.stdin.readline().split())
    x, y = a, b
    lcm = 0

    # y가 0이 되면, x가 두 수의 gcd가 됨
    while y!=0:
        temp = x
        x = y
        y = temp%y

    lcm = a*b//x
    print(lcm)