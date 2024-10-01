# 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 
# 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
# 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
# n=17일때 까지 피보나치 수를 써보면 다음과 같다.
# 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
# n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

# 재귀함수 방식 : 시간초과
# def fibonacci(n):
#     if n < 2:
#         return n
#     else:
#         return (fibonacci(n-1) + fibonacci(n-2))
    
# n = int(input())
# print(fibonacci(n))

# 값을 저장해서 재활용
def fibonacci(n, dp={}):
    if n in dp:
        return dp[n]
    if n < 2:
        return n
    
    dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp)
    return dp[n]

n = int(input())
print(fibonacci(n))
